package June.week4.June26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo1 {


    public static void main(String[] args) {


        //map

        List<String> ls=new ArrayList<>(Arrays.asList("Ajay","Suresh","vijesh"));

      Set<Integer>st= ls.stream().map(l->l.length())
//        .forEach(length->System.out.println(length));
                .collect(Collectors.toSet());
        System.out.println(st);
    }
}
