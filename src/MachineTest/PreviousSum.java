package MachineTest;

import java.util.Arrays;

public class PreviousSum {

    public static void main(String[] args) {
int []arr={5, 10, 15};
        System.out.println(Arrays.toString(PreviousSum.previoussum(arr)));
    }

    public static int[] previoussum(int[]arr){


        int []newArr=new int[arr.length];
        newArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){

            newArr[i]=arr[i]+newArr[i-1];


        }

        return newArr;

    }
}
