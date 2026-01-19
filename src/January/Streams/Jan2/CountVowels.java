package January.Streams.Jan2;

import java.util.Arrays;

public class CountVowels {

    public static void main(String[] args) {


        String s="I am learning Streams API in Java";

        Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2).forEach(System.out::println);
    }
}
