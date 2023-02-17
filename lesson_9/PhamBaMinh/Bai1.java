package PhamBaMinh;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        while (true) {
            try {
                System.out.println("Nhap vao so a");
                a= scanner.nextDouble();
                System.out.println("Nhap vao so b");
                b= scanner.nextDouble();
                try {
                    if (b != 0) {
                        System.out.println("Gia tri a chia b la : "+a/b);
                    }else {
                        System.out.println("Phep chia khong hop le.");
                        return;
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
                break;
            }catch (InputMismatchException ex ){
                System.out.println("Moi ban nhap lai");
                scanner.nextLine();
            }

        }


    }

}
