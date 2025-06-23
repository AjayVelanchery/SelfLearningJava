package DSA;

public class Sorting {
    public static void main(String[] args) {


        int[] arr = {2, 1, 4, 3, 5, 6};
for(int nums:arr){
    System.out.print(nums);
}
        int temp=0;
int minIndex=-1;

//  Bubble Sort
//        for(int i=0;i<arr.length;i++){
//
//
//            for(int j=0;j<arr.length-i-1;j++){
//
//                if(arr[j]>arr[j+1]){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//
//                }}}
//        System.out.println();
//for(int nums:arr){
//    System.out.print(nums);
//}
//


        //Selection sort
        for(int i=0;i<arr.length-1;i++){

minIndex=i;
            for(int j=i+1;j<arr.length;j++){
          if(arr[minIndex]>arr[j]){
              minIndex=j;

          }
          temp=arr[minIndex];
          arr[minIndex]=arr[i];
          arr[i]=temp;


            }}
        System.out.println();
        for(int nums:arr){
            System.out.print(nums);
        }


    }
}
