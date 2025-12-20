package December;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapLearning {

    public static void main(String[] args) {


        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(5,0.3f,true);


        linkedHashMap.put("Apple",3);
        linkedHashMap.put("Orange",2);
        linkedHashMap.put("Banana",20);
 linkedHashMap.get("Banana");
        linkedHashMap.get("Apple");

        for(Map.Entry<String,Integer> entries:linkedHashMap.entrySet()){

            System.out.println(entries.getKey());
        }

    }

}
