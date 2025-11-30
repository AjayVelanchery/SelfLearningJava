package MachineTest;

import java.util.*;

public class EvenMap {

    public static void main(String[] args) {


        Map<Character,Integer> mp=new HashMap<>();


        mp.put('a',2);
        mp.put('b',5);

        System.out.println(Arrays.toString(evenkeys(mp)));

    }


    public static int[] evenkeys(Map<Character,Integer>mp){

        List<Integer> evens = new ArrayList<>();

        for(Map.Entry<Character,Integer>entry:mp.entrySet() ) {
            if (entry.getValue() % 2 == 0) {
                evens.add(entry.getValue());
            }
        }
            int[] result = new int[evens.size()];
            for (int i = 0; i < evens.size(); i++) {
                result[i] = evens.get(i);


        }
        return result;
    }
}
