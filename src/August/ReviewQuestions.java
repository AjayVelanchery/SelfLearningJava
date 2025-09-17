package August;

import java.util.Arrays;

public class ReviewQuestions {

    public static void main(String[] args) {


        int[] arr = {3, 2, 44, 1, 4, 5};
        System.out.println(secondLargestNumber(arr));
        System.out.println(Arrays.toString(sortedArray(arr)));
    }


    static int secondLargestNumber(int []arr){

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(max<arr[i]){
                secondMax=max;
                max=arr[i];
            }else if(secondMax<arr[i]&&arr[i]!=max){

secondMax=arr[i];
}
        }
    return secondMax;
    }

    static int[] sortedArray(int []arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    return arr;
    }
}
