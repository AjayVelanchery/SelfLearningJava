package July;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {


//        Stream.iterate(0,no->no<=10,no->no+1)
//                .forEach(System.out::println);
//
        ArrayList<Integer> listofIntegers = new ArrayList<>();
//        listofIntegers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//Stream<Integer> streamofIntegers=listofIntegers.stream()
//        .parallel()
//                .map(n->n*2)
////                        .sequential()
//                                .filter(n->n>2);
//        streamofIntegers.forEachOrdered(no-> System.out.println(no));
//        System.out.println(streamofIntegers.isParallel());


        for(int i=1;i<=5;i++){
            listofIntegers.clear();
            Stream.iterate(1,no->no<=20,no->no+1).parallel().forEach(no->listofIntegers.add(no));
//                            .forEach(no-> listofIntegers.add(no));

            System.out.println(listofIntegers);
            System.out.println(listofIntegers.size());
        }
    }}

