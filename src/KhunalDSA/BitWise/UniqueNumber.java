package KhunalDSA.BitWise;

public class UniqueNumber {
    public static void main(String[] args) {

        int arr[]={2,3,4,1,2,1,3,6,4};
        System.out.println( uniqueNumber(arr));
    }

    static int uniqueNumber(int []arr){
int j=0;
        for(int i=0;i<arr.length;i++){
            j^=arr[i];
        }

        return j;
    }


}
