package PhamBaMinh;

public class Bai9 {
    //1480. Running Sum of 1d Array
    public static  int[] runningSum(int[] nums) {
        int []arr = new  int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            if (i==0){
                arr[0]=nums[0];
            }else {
                arr[i] = arr[i-1]+nums[i];
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] ans = runningSum(nums);
        for (int i:ans) {
            System.out.print(i +" ");

        }
    }
}
