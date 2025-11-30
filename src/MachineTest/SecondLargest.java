package MachineTest;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 5, 66};
        System.out.println(SecondLargest(arr)); // Output: 34
    }

    static int SecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max; // update second largest
                max = num;       // update largest
            } else if (num > secondMax && num != max) {
                secondMax = num; // update second largest if smaller than max
            }
        }

        return secondMax;
    }
}
