package November.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Sample1 {

    public static void main(String[] args) {


        Function<String,Integer> function=x->x.length();
        Function<String,String> function1=x->x.substring(0,3);


//        System.out.println( function1.apply("Ajay"));

   Function<String,Integer> tester3=function1.andThen(function);

        System.out.println(tester3.apply("Ajay"));


        Function<String,Integer> func=str->str.length();
        BiFunction<String,String,Integer> func2=(x,y)->x.length()+y.length();

        System.out.println(func2.apply("ajay","vijay"));
    }
}
