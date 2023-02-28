public class BtLC1365 {

    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        // int [] a = new int[n];

        for (int i = 0; i <n ; i++){
            for (int j=i+1; j<n ; j++){
                if (nums[i] % 2 != 0 && nums[j] %2==0){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]= temp;
                }
            }

            }
            return nums;

        }
        public static void main (String []agrs){
            int [] nums = {3,1,2,4};
            for (int i:nums)
            System.out.print(i + " ");

            int [] ans = sortArrayByParity(nums);

            for (int i:ans)
            System.out.print(i + " ");


        }
        


    }

    

