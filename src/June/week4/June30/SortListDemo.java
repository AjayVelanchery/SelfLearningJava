package June.week4.June30;

import June.Week2.June13.Inherit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {


    List<Integer>list=new ArrayList<>();
    list.add(8);
        list.add(2);
        list.add(4);
        list.add(5);

//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);
//
//        list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s));

        List<Employee> employees=DataBase.getEmployees();
//        Collections.sort(employees,(o1,o2)->(int)(o1.getSalary()- o2.getSalary()));
//        System.out.println(employees);



//        employees.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).forEach(System.out::println);
// employees.stream()
//         .sorted(Comparator.comparing(emp->emp.getSalary()))
//         .forEach(System.out::println);
//    }}

        employees.stream().sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }}



//class Mycomparator implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return (int)(o1.getSalary()- o2.getSalary());
//    }


