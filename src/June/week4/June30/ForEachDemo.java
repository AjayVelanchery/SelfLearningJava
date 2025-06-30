package June.week4.June30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {


    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Ajay");
        list.add("Joseph");
        list.add("Raju");
        list.add("Kuttapan");
        list.stream().filter(t->t.startsWith("A")).forEach(t-> System.out.println(t));
//        list.stream().forEach(t-> System.out.println(t));

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

//        map.forEach((key,value)-> System.out.println(key+" "+value));
//map.entrySet().stream().forEach(obj-> System.out.println(obj));
//
//Consumer<String> consumer=(t)-> System.out.println(t);
//for(String s1:list){
//
//    consumer.accept(s1);
//}
map.entrySet().stream().filter(obj->obj.getKey()%2==0).forEach(obj-> System.out.println(obj));


    }
}
