//package october;
//import reactor.core.publisher.Mono;
//public class Mono1 {
//
//    public static void main(String[] args) {
//
//
//        Mono<String> usernamemono = Mono.just("Ajay");
//
//        Mono<String> greetingMono = usernamemono.map(name -> "Hello, " + name + "!");
//
//    greetingMono.subscribe(
//
//            data-> System.out.println(data),
//        error-> System.out.println("Error: "+error.getMessage()),
//                ()-> System.out.println("Mono completed")
//                );
//    }
//}
