package December.streams;

import MachineTest.PreviousSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaDemo

{
    public static void main(String[] args) {

//
//Thread t1=new Thread(()->{
//
//        System.out.println("Hello");
//});
        ArrayList<String> names=new ArrayList<>(Arrays.asList("Ajay","Vijay","Sanjay","Arjith"));

        names.stream().filter(x->x.startsWith("A")).forEach(System.out::println);


        names.stream().map(x->x.toUpperCase()+" ").forEach(System.out::print);

        names.stream().sorted();

        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).reduce(0,(x,y)->x+y));

//        Sum add1= Integer::sum;
//
//        System.out.println(  add1.add(2,3));
//
//
//        Predicate<String> check=x->x.startsWith("a");
//        System.out.println(  check.test("ajay"));
//
//
//        ArrayList<Integer> ls=new ArrayList<>(Arrays.asList(1,2,3));
//
//
//        Consumer<List<Integer>> print= x->{
//            for(int i:ls){
//                System.out.println(i);
//            }
//        };
//
//        print.accept(ls);
}}

//
//class Task implements Runnable{
//
//
//    @Override
//    public void run() {
//        System.out.println("runnable");
//    }





    interface Sum{

        int add(int a,int b);
    }

