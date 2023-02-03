package PhamBaMinh;

public class Bai8 {
    //1470.Shuffle the Array
    public static  int[] shuffle(int[] nums, int n) {
        int []arr =new int[2*n];
        for (int i = 0; i <2*n; i++) {
            if (i%2==0){
                arr[i] = nums[i/2];
            }else {
                arr[i] = nums[n+i/2];
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(nums,n);
        for (int i:ans) {
            System.out.print(i+" ");

        }

    }

}
