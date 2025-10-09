package KhunalDSA.out.production.KhunalDSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {
int[]arr={2,3,4,4,5};
        System.out.println(linearSearch(arr,4,0));

        ArrayList<Integer>ans=search(arr,4,0,new ArrayList<>());
        System.out.println(ans);
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

    static ArrayList<Integer> search(int []arr,int target,int index,ArrayList<Integer>list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }
}
