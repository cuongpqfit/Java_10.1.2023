package PhucDV.BaiTapNangCao;

import java.util.Arrays;

//Leetcode : 1365-How Many Numbers Are Smaller Than the Current Number

public class Bai1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            output[i] = count;
        }
        return output;
    }
}
