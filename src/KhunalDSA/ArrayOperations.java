import java.util.Arrays;

public  class ArrayOperations {

    public static void main(String[] args) {

        int []arr={1,3,23,9,18};
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));

        System.out.println("maximum element="+max(arr));

        reverse(arr);
        System.out.println("New Array"Arrays.toString(arr));
    }


    static void swap(int []arr1,int a,int b){
        int temp=arr1[a];
        arr1[a]=arr1[b];
        arr1[b]=temp;

    }

    static void reverse(int []arr1){
        int start=0;
        int end=arr1.length-1;
       while(start<end){
        int temp=arr1[start];
        arr1[start]=arr1[end];
        arr1[end]=temp;
        start++;
        end--;
    }}

    static int max(int []arr1){
        int max=arr1[0];
        for(int i=0;i<arr1.length;i++){
           if(arr1[i]>max){
               max=arr1[i];
           }
        }
        return max;
    }
}