package week4.June26;


//interface addtwo{
//    int addit(int a,int b);
//}
//public class FunctionalInterfaceLearninng {
//    public static void main(String[] args) {
//        int a1=10,b1=20;
//        addtwo s=(int a, int b)->(a+b);
//
//        System.out.println(s.addit(a1,b1));
//    }
//}

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class FunctionalInterfaceLearning{
    public static void main(String[] args) {


//        Function<String,Integer>function=(String s)->s.length();
//        System.out.println(function.apply("Ajay"));
//
//        Function<Integer, Double>function1=a->a/2.0;
//       function1= function1.andThen(a->a*3);
//
//        Function<Integer,Double>function2=a->a/2.0;
//       function2= function2.compose(a->a*3);
//
//        System.out.println(function2.apply(2));
//        System.out.println(function1.apply(2));
//
//        Consumer<String> consumer=s -> System.out.println(s);
//
//        consumer.accept("Ajay");

        Predicate<Integer> predicate=s->s==2;
        System.out.println(predicate.test(3));



    }




}