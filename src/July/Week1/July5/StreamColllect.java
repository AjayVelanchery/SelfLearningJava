package July.Week1.July5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamColllect {

    public static void main(String[] args) {


//        ArrayList<Integer>listOfIntegers=new ArrayList<>();

        List<Integer>list=Stream.iterate(0, no->no+1).parallel().limit(20).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.size());


        List<Integer>list1=new ArrayList<>(Arrays.asList(2,3,1,3));

        list1.stream().parallel().map(n->n+1)
                .forEachOrdered(System.out::println);


    }}
