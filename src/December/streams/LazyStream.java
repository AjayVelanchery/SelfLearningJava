package December.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyStream {

    static void main(String[] args) {


        List<String> names= Arrays.asList("Ajay","Risal","Shamu");


        Stream<String> name= names.stream().filter(x->{
            System.out.println(x);
       return x.length()>3;});


        System.out.println("Before termianl operation");

        List<String> result=name.collect(Collectors.toList());
        System.out.println(result);



    }


}
