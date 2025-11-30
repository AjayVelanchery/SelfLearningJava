package MachineTest;

public class Multiplesof3 {


    public static void main(String[] args) {
        int []arr={1, 3, 8, 5, 9};
        System.out.println(Multiplesof3.multiple(arr));
    }


    public static int multiple(int[]arr){

        int sum=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%3==0){
                sum+=arr[i];
            }
        }

    return sum;
    }
}
