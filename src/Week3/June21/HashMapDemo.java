package Week3.June21;

import java.util.*;

public class HashMapDemo {

       public static void main(String[] args) {

           HashMap<Integer, String> m = new HashMap<>();

           m.put(101, "John");
           m.put(102, "dohny");
           m.put(103, "bohny");
           m.put(104, "lohny");
           m.put(105, "sony");
           m.put(103, "X");


           System.out.println(m);


           System.out.println(m.get(105));


           m.remove(103);
           System.out.println(m);

           System.out.println(m.containsKey(101));
//
//
//        System.out.println(m.containsValue("Mary"));
//
//        System.out.println(m.isEmpty());
//        System.out.println( m.keySet());
//        System.out.println(m.values());
//
//        System.out.println(m.entrySet());


           for (int i : m.keySet()) {
               System.out.println(i);
           }

           for (Object i : m.values()) {

               System.out.println(i);
           }

           for (Object i : m.keySet()) {

               System.out.println(i + " " + m.get(i));
           }


           //entry

        for(Map.Entry entry:m.entrySet()){

            System.out.println(entry.getKey()+"  "+entry.getValue());
        }


        Set s=m.entrySet();

        Iterator itr=s.iterator();

        while (itr.hasNext()){
            Map.Entry entry=(Map.Entry)  itr.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

       }
   }
