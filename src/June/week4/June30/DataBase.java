package June.week4.June30;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Employee>getEmployees(){

        List<Employee> list=new ArrayList<>();

        list.add(new Employee(176,"latupatu","It",600000));
        list.add(new Employee(365,"kutuapu","civil",9000000));
        list.add(new Employee(345,"gagt","water",500000));
        list.add(new Employee(136,"samue","defence",45000));
        list.add(new Employee(165,"agay","air",1600000));
         return list;
    }}

