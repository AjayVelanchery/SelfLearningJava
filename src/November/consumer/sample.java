package November.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class sample {

    public static void main(String[] args) {


    Consumer<List<Integer>> test1= ts->{


        for(Integer i:ts){
            System.out.println(i+100);
        }


    };

    Consumer<List<Integer>> test2= st->{

        for(Integer s:st){
            System.out.println(s);
        }
    };



    test1.andThen(test2).accept(Arrays.asList(1,2,3,4));
}}
