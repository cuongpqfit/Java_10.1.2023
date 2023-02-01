package Lesson3;

public class Bai9 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        show(runningSum(nums));
    }
    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            output[i] = nums[i] + output[i-1];
        }
        return output;
    }
    public static void show(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
