package Lesson3;

public class Bai5 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        show(getConcatenation(nums));

    }
    public static int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];
        for (int i = 0; i < output.length; i++){
            if(i >= nums.length){
                output[i] = nums[(2*i - output.length)/2];
            }else{
                output[i] = nums[i];
            }
        }
        return output;
    }
    public static void show(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
