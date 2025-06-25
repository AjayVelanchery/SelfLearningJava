package Week3.June24;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Lambdacollection {

    public static void main(String[] args) {
        Map <Integer,String> sam=new TreeMap<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);

        sam.put(1,"ajay");
        sam.put(3,"rouf");
        sam.put(2,"shinoj");
        System.out.println(sam);
    }
}
