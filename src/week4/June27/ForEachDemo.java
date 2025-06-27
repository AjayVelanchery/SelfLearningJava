package week4.June27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {


        List<String> st=new ArrayList<>(Arrays.asList("Ajay","Sureesh"));


//        st.stream().sorted(Comparator.reverseOrder())
//                .map(n->n.charAt(1))
//                .forEach(System.out::println);


        List<Integer> nums=Arrays.asList(3,2,4,3,5);

//        Consumer<Integer>cons=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
        nums.forEach(n-> System.out.println(n));
    }
}
