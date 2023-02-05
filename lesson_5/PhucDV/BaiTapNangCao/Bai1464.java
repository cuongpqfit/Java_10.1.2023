package PhucDV.BaiTapNangCao;
//Leetcode : 1464. Maximum Product of Two Elements in an Array

import java.util.Arrays;

public class Bai1464 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
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
        output = (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        return output;
    }
}
