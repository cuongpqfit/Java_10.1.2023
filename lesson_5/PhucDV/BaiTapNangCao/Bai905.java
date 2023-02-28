package PhucDV.BaiTapNangCao;
//Leetcode :  905-Sort Array By Parity

import java.util.Arrays;

public class Bai905 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] output = new int[nums.length];
        if(nums.length == 1) {
            return nums;
        }else{
            int first = 0;
            int last = nums.length - 1;
            for (int i = 0; i <nums.length; i++) {
                if(nums[i] % 2 == 0){
                    output[first] = nums[i];
                    first++;
                }if(nums[i] % 2 != 0){
                    output[last] = nums[i];
                    last--;
            }
        }
        return output;
    }
    }
}
