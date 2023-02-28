package PhucDV.BaiTapNangCao;

//Leetcode :1913. Maximum Product Difference Between Two Pairs

public class Bai1913 {
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));

    }
    public static int maxProductDifference(int[] nums) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]){
                int tmp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = tmp;
                j--;
            }
        }
        output = (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
        return output;
    }
}
