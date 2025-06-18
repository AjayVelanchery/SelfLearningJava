package Week1.June9;
import  java.util.*;
public class Search {
    public static void main(String[] args) {

Scanner in=new Scanner(System.in);
   int []arr={4,53,3};
   System.out.println("Enter the value to search");

   int sr=in.nextInt();
   int n=0;

   for(int i=0;i<=arr.length-1;i++){
       if(sr==arr[i]){
           System.out.println("Element found ");
           break;
       }else {
           n++;
       }

   }
   if(n==arr.length){
       System.out.println("Element not found");
   }


    }
}
