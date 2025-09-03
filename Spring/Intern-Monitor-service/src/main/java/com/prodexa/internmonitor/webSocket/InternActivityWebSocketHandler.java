package com.prodexa.internmonitor.webSocket;

import com.google.gson.*;
import com.prodexa.internmonitor.Service.InternActivityService;
import com.prodexa.internmonitor.dto.InternActivityDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;

@Component // <- Make this a Spring bean
public class InternActivityWebSocketHandler implements WebSocketHandler {

    private final InternActivityService service;
    private final Gson gson;

    private static final Logger log = LoggerFactory.getLogger(InternActivityWebSocketHandler.class);

    public InternActivityWebSocketHandler(InternActivityService service) {
        this.service = service;
        this.gson = new GsonBuilder()
                // Deserialize ISO-8601 strings to Instant
                .registerTypeAdapter(Instant.class, (JsonDeserializer<Instant>) (json, type, context) -> Instant.parse(json.getAsString()))
                // Serialize Instant to ISO-8601 string
                .registerTypeAdapter(Instant.class, (JsonSerializer<Instant>) (src, type, context) -> new JsonPrimitive(src.toString()))
                .create();
    }

    @Override
    public Mono<Void> handle(WebSocketSession session) {

        Flux<String> replies = session.receive()
                .map(msg -> msg.getPayloadAsText())
                .flatMap(payload -> {
                    try {
                        InternActivityDTO dto = gson.fromJson(payload, InternActivityDTO.class);
                        log.info("Received payload={} -> Parsed DTO={}", payload, dto);

                        if (dto.getTimestamp() == null) {
                            dto.setTimestamp(Instant.now());
                        }

                        return service.saveActivity(dto)
                                .map(saved -> "ACK:" + saved.getInternId() + ":" + saved.getTimestamp())
                                .onErrorResume(e -> {
                                    log.warn("Error saving activity: {}", e.getMessage());
                                    return Mono.just("ERROR:save-failed");
                                });

                    } catch (JsonSyntaxException e) {
                        log.warn("Invalid JSON payload: {}", payload, e);
                        return Mono.just("ERROR:invalid-json");
                    } catch (Exception e) {
                        log.warn("Unexpected error: {}", payload, e);
                        return Mono.just("ERROR:unexpected");
                    }
                });

        // Keep WebSocket alive indefinitely
        Flux<String> neverComplete = Flux.never();

        return session.send(
                Flux.merge(replies, neverComplete)
                        .map(session::textMessage)
        );
    }
}
