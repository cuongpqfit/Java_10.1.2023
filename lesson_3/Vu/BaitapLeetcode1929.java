import java.util.Scanner;

public class BaitapLeetcode1929 {
    public static void main (String[] args) {

        // System.out.print("Nhap so phan thu mang n: ");
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int [] nums= {1,2,3,4};

        int [] ans = new int[nums.length*2];

        for (int i:ans)
        System.out.print(ans[i]);
        System.out.println();



        for(int i=0; i<nums.length*2; i++){
            if(i<nums.length){
                ans[i]=nums[i];
            } else {
                ans[i]=nums[i-nums.length];
        
            } 
        }

        for (int i=0; i <nums.length*2;i++){
            System.out.print(ans[i]);
        }
            System.out.println();
    }
}

        
    


