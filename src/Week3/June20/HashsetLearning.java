package Week3.June20;
import  java.util.HashSet;
import java.util.Iterator;

public class HashsetLearning {

    public static void main(String[] args) {
        HashSet hs=new HashSet();
//        HashSet hs=new HashSet(100);

//        HashSet hs=new HashSet(100,(float) 0.90);
//
//        HashSet<Integer>hs=new HashSet<Integer>();


//        Add elements

          hs.add(100);
          hs.add("welcome");
        hs.add(16.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);
//        System.out.println(hs);


//        remove


        hs.remove(16.4);

//        System.out.println(hs);


//contains


        System.out.println(hs.contains("welcome"));
        System.out.println(hs.isEmpty());



//Reading

//        for(Object e:hs){
//            System.out.println(e);
//        }

        Iterator it=hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
