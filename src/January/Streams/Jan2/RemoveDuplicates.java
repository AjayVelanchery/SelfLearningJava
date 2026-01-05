package January.Streams.Jan2;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {


        String s="dabcadefg";


        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
