package January.Streams.Jan2;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestLength {


    public static void main(String[] args) {


    String s="I am learning Streams API in Java";
String ans=Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(0).findFirst().get();

        System.out.println(ans);

        int length=0;
        for(int i=s.length()-1;i<s.length();i--){

            if(!Character.isWhitespace(s.charAt(i))){
                length++;

            }


        }
}}
