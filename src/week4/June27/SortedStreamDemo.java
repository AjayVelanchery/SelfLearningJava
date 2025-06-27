package week4.June27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


class Students{
 Integer x;
 String y;
    Students(Integer x,String y){
        this.x=x;
        this.y=y;
    }
    public  String toString(){
return  x+" "+y;
    }
}
public class SortedStreamDemo {

    public static void main(String[] args) {

//        List sr=new ArrayList(Arrays.asList("Ajay","Vijay","Sanjay"));
//
//        sr.stream()
//                .sorted()
//                .forEach(System.out::println);

        List <Students>sr=new ArrayList<>();
        sr.add(new Students(1,"Ajay"));
        sr.add(new Students(3,"Suresh"));
        sr.add(new Students(2,"Vijay"));
        sr.add(new Students(5,"Sanjay"));
        sr.add(new Students(5,"Sanjay"));

       Set<Students>st= sr.stream()
                .sorted((p1,p2)->p1.y.compareTo(p2.y))
//                .forEach(System.out::println);
                .collect(Collectors.toSet());
        System.out.println(st);
    }
}
