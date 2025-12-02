package December;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {

        HashMap<Integer,String> hs=new HashMap<>();

        hs.put(2,"Ajay");
        hs.put(1,"sanjay");
 hs.put(3,"vijay");

        for(int i: hs.keySet()){

            System.out.println(hs.get(i));
        }


         for(Map.Entry<Integer,String> entry:hs.entrySet()){
             System.out.println(entry.getKey()+" "+entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
         }
        System.out.println(hs);

    }
}
