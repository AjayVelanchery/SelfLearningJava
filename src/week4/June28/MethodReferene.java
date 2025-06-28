package week4.June28;

import Week1.June9.Array;

import java.util.Arrays;
import java.util.List;

public class MethodReferene {

    public static void main(String[] args) {

        List<Integer>numbers=List.of(1,2,3,4,5);
        //1.Reference to static methods.

        numbers.forEach(System.out::println);

//        2.instance method of particular object
         Greeter greeter=new Greeter();
        List<String>family=List.of("Jajm","sus","ddg");

        family.forEach(greeter::greet);

//        References to an instance method of an object of a particualr type

        List<String> team=Arrays.asList("Tasha","Jan","ras");
//        team.sort((s1,s2)->s1.compareToIgnoreCase(s2));
        team.sort(String::compareToIgnoreCase);
        System.out.println(team);


//Reference to a constructor

       List<String> names= Arrays.asList("Alice","john","Suresh");


        List<Person> People=   names.stream()
    .map(Person::new)
        .toList();

        System.out.println(People);
    }
}
