//package october;
//
//import reactor.core.publisher.Flux;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class FluxLearning {
//
//    public static void main(String[] args) {
//
//        List<String> fruits= Arrays.asList("Apple","Banana","Cherry");
//
//        Flux<String > fruitsFlux=Flux.fromIterable(fruits);
//
//        Flux<String> processedflux=fruitsFlux
//                .filter(f->f.length()>5)
//                .map(String::toUpperCase);
//
//    processedflux.subscribe(
//            data-> System.out.println("Fruits: "+data),
//            error-> System.err.println("Error"+error.getMessage()),
//            ()-> System.out.println("flux stream finshed")
//
//    );
//    }
//
//}
