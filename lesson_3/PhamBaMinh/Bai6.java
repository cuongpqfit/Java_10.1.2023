package PhamBaMinh;

public class Bai6 {
   //1920.Build Array from Permutation
   public static int[] buildArray(int[] nums){
       int n = nums.length;
       int[] ans = new int[n];
       for (int i = 0; i < n; i++) {
           ans[i] = nums[nums[i]];
       }
       return ans;
   }
    public static void main(String[] args) {
       int [] nums = { 0,2,1,5,3,4};
       int[]arr = buildArray(nums);
        for (int i: arr) {
            System.out.print(i+ " ");

        }
    }

}
