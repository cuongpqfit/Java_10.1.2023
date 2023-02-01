package Lesson3;

public class Bai8 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        show(shuffle(nums, n));
    }
    public static int[] shuffle(int[] nums, int n) {
        int output[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                output[i] = nums[i/2];
            }else{
                output[i] = nums[n + i/2];
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
