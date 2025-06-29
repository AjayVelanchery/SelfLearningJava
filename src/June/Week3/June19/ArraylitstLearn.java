package June.Week3.June19;
import java.util.*;
public class ArraylitstLearn {

    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);

        //remove
        a.remove(1);
        System.out.println(a);

        a.set(1,2);
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.get(0));
    }
}
