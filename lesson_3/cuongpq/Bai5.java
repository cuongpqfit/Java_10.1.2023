package cuongpq;

public class Bai5 {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] output = new int[nums.length * 2];
        int a = 0;
        for (int i=0; i<nums.length*2; i++) {
            //i > n;
            if (i>=n) {
                output[i] = nums[a];
                a++;
            } else {
                output[i] = nums[i]; // i<n;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = getConcatenation(nums);

        for (int i : ans) {
            System.out.print(ans[i] + " ");
        }
    }
}
