package November.Predicate;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
//
//        Predicate<Integer> test=x->x>100;
//
//        System.out.println(  test.test(20));


        Predicate<String> tester1= x->x.toLowerCase().charAt(0)=='v';
        Predicate<String> tester2=x->x.toLowerCase().charAt(x.length()-1)=='l';

   Predicate<String> or=tester1.or(tester2);

        System.out.println(or.test("ajal"));


        BiPredicate<Integer,Integer> func2=(x,y)->x%2==0&&y%2==0;


        System.out.println(func2.test(2,3));

        BiConsumer<Integer,Integer> func=(x,y)-> System.out.println(x+y);


      func.accept(2,3);


        BinaryOperator<String> binaryOperator=(x,y)->x+y;

        System.out.println(binaryOperator.apply("ajay","great"));
    }
}
