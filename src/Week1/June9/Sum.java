package Week1.June9;

public class Sum {

    public static void main(String[] args) {
        int []arr={3,42,1};
        int sum=0;

        for(int i=0;i<=arr.length-1;i++){


            sum+=arr[i];

        }
        System.out.println(sum);
        System.out.println("Average ="+((float)sum/arr.length));
    }
}
