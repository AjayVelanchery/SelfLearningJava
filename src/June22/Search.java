package June22;

public class Search {
    public static void main(String[] args) {


    int[] arr = {2, 3, 6, 4, 2};
    int target = 6;

        System.out.println(linearSearch(arr,target));
        System.out.println(binarySearch(arr,target));

}



    public static int linearSearch(int arr[],int target) {

        for(int i=0;i< arr.length;i++){

            if(arr[i]==target){
                    return i;

            }
        }

        return -1;

    }
  public static int binarySearch(int arr[],int target){



        int left=0;
        int right=arr.length-1;


   while(left<right){
       int mid=left+right/2;
            if (arr[mid]==target){
                return mid;
            }

            else if(arr[mid]>target){
                right=mid-1;


            }
            else{
                left=mid+1;
            }
        }
        return -1;
  }
}


