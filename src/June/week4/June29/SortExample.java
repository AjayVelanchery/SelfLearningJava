package June.week4.June29;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

    public static void main(String[] args) {

        ArrayList<Emp> emps=new ArrayList<>();
        emps.add(new Emp("Ajay","7598327",16));
        emps.add(new Emp("Rishal","343565",14));
        emps.add(new Emp("Auresh","2345354",15));
        System.out.println(emps);
        //comparable
//      Collections.sort(emps);

        Collections.sort(emps,new IdComparator());
        System.out.println(emps);
//
//        ArrayList<Emp> emps1=new ArrayList<>(emps);
        Collections.sort(emps,new NameComparator());
        System.out.println(emps);




    }
}
