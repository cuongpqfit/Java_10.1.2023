public class Leetcode1480 {
    public static void main(String []agrs) {
    
   final int [] nums = {1,2,3,4};
   
    int [] ans = new int [nums.length];

    for (int i =0; i< nums.length; i++){
        int tong = 0;
        for (int j=0; j<=i; j++){
            tong = tong + nums[j];
            ans[i]=tong;
        }
        // ans[i] =(nums[i]+ans[i+1]);
    }
    for ( int i: ans)
    System.out.println(i);
        
   
    
    }
}
