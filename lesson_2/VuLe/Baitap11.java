import java.util.Scanner;

public class Baitap11 {
    public static void main (String[] args) {

        System.out.print("Nhap chieu cao tam giac: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
   
        for (int i=0; i<n-1; i++ ){
             
            for (int j=1; j<=(n*2-1); j++){
            if (i+j==n || j-i == n){
                System.out.print("*");
            } else 
                System.out.print(" ");            
            } 
            System.out.println();
            }

        for (int j=0; j<=n-1; j++){
                System.out.print("* ");
                
            } 
            System.out.println();

        }

        }

        
    


