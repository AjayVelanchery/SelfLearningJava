package June.week4.June24;


import java.util.*;
//8,7,34,56,10,45,10,23,45,34

//random numbers sorted and unique
public class Review {

    public static void main(String[] args) {

//        Set <Integer> num=new TreeSet<>(Arrays.asList(8,7,34,56,10,45,10,23,45,34));
//
//        System.out.println(num);

        String text = "apple banana apple orange banana apple";

        Map<Integer,String> word=new HashMap<>();

        String []arr=text.split(" ");
        System.out.println(Arrays.toString(arr));
int count=0;
     for(int i=0;i<arr.length;i++){

         word.put(i,arr[i]);

     }
     System.out.print(word);


}}
