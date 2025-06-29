package June.week4.June27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterLearning {

    public static void main(String[] args) {

//        List<Integer> ls=new ArrayList<>(Arrays.asList(3,2,4,2,4,2,644,55,3310));
//
//        ls.stream()
//                .filter(n->n>100)
//                .forEach(System.out::println);

      List<String> st=new ArrayList<>(Arrays.asList("Ajay","VIjay","Suresh"));

      st.stream()
              .filter(s ->Character.isUpperCase(s.charAt(0)))
              .filter(s ->Character.isUpperCase(s.charAt(1)))
                      .forEach(System.out::println);


      List<String> str=new ArrayList<>(Arrays.asList("Ajay","Vijay","Sureshs"));

      str.stream()
              .filter(s -> s.endsWith("s"))
              .forEach(System.out::println);
     }


}
