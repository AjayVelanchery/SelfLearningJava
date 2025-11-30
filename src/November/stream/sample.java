package November.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class sample {


    public static void main(String[] args) {


        ArrayList<Integer> sample=new ArrayList<>(Arrays.asList(1,2,3,4,5,5,66,4));

        sample.stream().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);

    }
}
