package Lesson3;

public class Bai6 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        show(buildArray(nums));

    }
    public static int[] buildArray(int[] nums) {
        int [] output = new int[nums.length];
        for ( int i = 0; i < nums.length; i++){
            output[i] = nums[nums[i]];
        }
        return output;
    }
    public static void show(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
