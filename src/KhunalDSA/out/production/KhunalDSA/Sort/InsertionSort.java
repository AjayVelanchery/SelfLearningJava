package KhunalDSA.out.production.KhunalDSA.Sort;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {
int []arr={4,5,1,2,3};
int []arr1={0,-23,56,18};
insertionSort(arr);
        System.out.println(Arrays.toString((arr)));
insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void insertionSort(int []arr){

        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j>0;j--){

if(arr[j]<arr[j-1]){
    swap(arr,j,j-1);
}else {
    break;
}
            }
        }

    }
    static void swap(int []arr,int j,int i){

        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }


}
