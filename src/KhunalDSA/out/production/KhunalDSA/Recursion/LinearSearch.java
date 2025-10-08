package KhunalDSA.out.production.KhunalDSA.Recursion;

public class LinearSearch {

    public static void main(String[] args) {
int[]arr={2,3,1,4,5};
        System.out.println(linearSearch(arr,4,0));
    }
    static int linearSearch(int []arr,int target,int index){

        if(index==arr.length-1){
            return -1;
        }
if(arr[index]==target){
    return index;
}
        return linearSearch(arr,target,index+1);
    }
}
