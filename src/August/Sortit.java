package August;

import java.util.*;

public class Sortit {

    public static void main(String[] args) {


        List<Integer> ls=new ArrayList<>(Arrays.asList(2,32,44,21,32));

        Comparator<Integer> lt=(a, b) -> a.compareTo(b);

        Collections.sort(ls, lt);

        System.out.println("Sorted Ascending (Collections): " + ls);
    }
}
