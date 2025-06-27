package week4.June27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {


        List<Integer> lt=new ArrayList<>(Arrays.asList(2,3,4,2,45,7));
      long a=  lt.stream()
                .count();
        System.out.println(a);
        System.out.println(lt.stream().allMatch(n->n>2));
        System.out.println(lt.stream().anyMatch(n->n>2));
        System.out.println(lt.stream().findFirst());
    }
}
