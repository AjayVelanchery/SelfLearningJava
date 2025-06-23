package Week3.June21;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmapDemo {


    public static void main(String[] args) {

        LinkedHashMap <Integer,String> lm=new LinkedHashMap<>();


        lm.put(1,"Ajay");
        lm.put(2,"Rizal");
        lm.put(3,"Samdev");
        lm.put(4,"Akshay");

        System.out.println(lm);

        for(Map.Entry<Integer,String>i:lm.entrySet()){
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }

    }
}
