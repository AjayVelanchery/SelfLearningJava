package June.week4.June27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceLearning {
    public static void main(String[] args) {


        List<Integer> ls=new ArrayList<>(Arrays.asList(2,3,4,2));



//        System.out.println(  ls.stream()
//                .reduce((n1,n2)->n1+n2));

        Integer ls1=ls.stream().reduce(0,(n1,n2)->n1+n2);
        Optional<Integer> ls2=ls.stream().reduce((n1, n2)->n1>n2?n1:n2);
        ls2.ifPresent(System.out::println);
        System.out.println(ls1);
        System.out.println(ls2);
        Integer ls3=ls.stream().reduce(0,(n1,n2)->n1==n2?n1:n2);
        System.out.println(ls3);

    }
}
