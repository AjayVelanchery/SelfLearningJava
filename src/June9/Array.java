package June9;
import java.util.*;

public class Array {

    public static void main(String[] args) {



        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");

           int n=in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the values into the array");
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }

//        int max=arr[0];
//           for(int i=1;i<n;i++){
//               if(arr[i]>max){
//                    max=arr[i];
//               }
//
//           }
//           System.out.println(max);
//
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(min);






    }
}
