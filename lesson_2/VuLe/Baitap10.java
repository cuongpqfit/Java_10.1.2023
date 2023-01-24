import java.util.Scanner;

public class Baitap10 {

    public static void main (String[] args) {

        System.out.println("Nhap so nguyen N: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if(a<=2){
        System.out.println(a +"la so nguyen to");
        } else {
            for (int i=2; i <a ; i++ ){
                if (a%i==0){
                System.out.println(a + " khong phai la so nguyen to");
                return;

                }

            }
            System.out.println(a + " la so nguyen to");
                   
        }
           
    }
    
}
