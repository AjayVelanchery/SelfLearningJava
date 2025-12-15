package December;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {


List<Student> list=new ArrayList<>();

list.add(new Student("Ajay",3.36));
        list.add(new Student("Sanjay",4.36));

        list.add(new Student("Vijay",5.36));

        list.add(new Student("kunju",5.68));


        list.sort(null);
        System.out.println(list);

        List<Integer>numbers=new ArrayList<>();
//
//        numbers.add(2);
//        numbers.add(1);
//        numbers.add(99);
//
//        numbers.sort(null);
//
//        System.out.println(numbers);

    }}
