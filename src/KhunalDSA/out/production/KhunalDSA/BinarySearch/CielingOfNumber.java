package KhunalDSA.out.production.KhunalDSA.BinarySearch;

public class CielingOfNumber {

    public static void main(String[] args) {

int []arr={2,3,5,9,14,16,18};
int target=17;
        System.out.println(cielingNumber(arr,target));
        System.out.println(floorNumber(arr,target));
    }

    static int cielingNumber(int []arr,int target){


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
        return arr[left];
    }

    static int floorNumber(int []arr,int target){


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
        return arr[right];
    }
}
