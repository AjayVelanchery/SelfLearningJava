//
//
//Given an integer array nums,
//find three numbers whose product is maximum and return the maximum product.
//        Example 1: Input: nums = [1,2,3] Output: 6 Example 2: Input: nums = [1,2,3,4] Output: 24 Example 3: Input: nums = [-1,-2,-3] Output: -6



public class Maxnumbers {

    public static void main(String[] args) {

        int []nums={-1,-2,-3};
        int max1=0;
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=i+1;j<nums.length-1;j++){

                max=nums[i]*nums[j]*nums[j+1];
                max1=Math.max(max1,max);
            }
        }
        System.out.println(max1);

    }

}
