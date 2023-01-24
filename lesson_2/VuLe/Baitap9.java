import java.util.Scanner;

public class Baitap9 {
    
    public static void main (String[] args) {

        System.out.println("Nhap so nguyen N: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int tich =1;
        for (int i=1; i<=a; i++ ){
            tich *= i;
        }
        System.out.println("Giai thua " + a+ "! = "+ tich );
           

    }
}
