package KhunalDSA.out.production.KhunalDSA.Sort;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int arr[]={3,4,2,1,3,5};
        int n=arr.length;

        System.out.println(Arrays.toString(bubbleSort(arr,n)));

    }


    static int[] bubbleSort(int []arr,int n){

        for(int i=0;i<n;i++){

            for(int j=1;j<n-i;j++){

                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
