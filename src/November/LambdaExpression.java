package November;

import June.Week2.June13.Inherit;

import java.util.*;

public class LambdaExpression {


    public static void main(String[] args) {

//
// Employee employee=()->"ajay";
//
//        System.out.println(employee.getName());
//
//
//        Runnable runnable=()->{
//
//            for(int i=0;i<=10;i++){
//                System.out.println("Hello"+i);
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();


        List<Integer> list=new ArrayList<>(Arrays.asList(1,33,23,43,5,47));


        list.sort((a,b)->b-a);
        System.out.println(list);

    }
}
