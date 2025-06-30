package June.week4.June30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public class PredicateDemo implements Predicate<Integer> {
public class PredicateDemo {


//        @Override
//    public boolean test(Integer t) {
//
//        if(t%2==0)
//            return true;
//        else{
//        return false;
//    }}





    public static void main(String[] args) {
        Predicate<Integer>predicate= ( t)-> t%2==0;
//        {

//            if(t%2==0)
//                return true;
//            else{
//                return false;
//            }




        System.out.println(predicate.test(4));

        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        list1.stream().filter(predicate).forEach(t-> System.out.println("Print Even"+t));

    }}
