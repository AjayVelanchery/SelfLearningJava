package KhunalDSA.out.production.KhunalDSA.BinarySearch;

public class InfiniteSortedArray {
    public static void main(String[] args) {

        int []arr={3,5,7,9,10,98,100,130,140,160,170};
        int target=10;
        System.out.println(infiniteSortedArray(arr,target));
    }

    static int infiniteSortedArray(int []arr,int target){

        int start=0;
        int end=1;

        while (target>arr[end]){
            int newStart=end+1;
//double the box value
            end=end+(end-start+1)*2;
            start=newStart;

        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch (int []arr,int target,int start,int end){


        int left=0;
        int right=arr.length;

        while(left<=right){


            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]<target){
                left=mid+1;
            }
            else {
                right=mid-1;
            }

        }
        return -1;
    }
}
