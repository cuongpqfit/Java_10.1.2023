public class Bai8 {
    //Leetcode1470

    public static void main(String []agrs) {
        // final String [] nums = {"x1","x2","x3","x4","y1","y1","y3","y4"};
        // final int [] nums = {1,3,5,7,2,4,6,8};
        final int [] nums = {1,2,3,4,4,3,2,1};
    
        // final int [] nums = {0,1,2,3,4,5,6,7};
        int l = nums.length;
        int n = l/2;
        int [] ans = new int [l];
        int temp;
        System.out.println (" l =" +l);
        System.out.println (" n =" +n);

        for ( int i: nums)
         System.out.print(i+ " ");
         System.out.println();

        // System.out.print ( n);

        ans[0] = nums[0];
        ans[l-1]= nums[l-1];
        
        System.out.println (ans[0]+"             "+ ans[l-1] );
          for (int i =1; i< n; i++){
            System.out.println("----");
            System.out.println("i= "+i);

             for (int j=i; j<n; j++){
                temp = nums[j];
                nums[j] = nums[j+n-i];
                nums[j+n-i] = temp;
                
            //  System.out.println("temp="+temp);
            //  System.out.println("j: " +j);
             }
             
             ans[i] = nums[i];
             ans[l-1-i]=nums[l-1-i];
         }
         
         for ( int i: ans)
         System.out.print(i+ " ");
}

}