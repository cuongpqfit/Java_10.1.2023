package PhucDV;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do{
            try {
                System.out.println("Nhập vào 2 số thực : ");
                System.out.println("nhập a: ");
                int a = scanner.nextInt();
                System.out.println("nhập b: ");
                int b = scanner.nextInt();
                check = true;
                try {
                    System.out.println("a/b + " + a/b);
                }catch (ArithmeticException ex){
                    System.out.println(ex);
                    System.out.println("Không thể chia cho 0.");
                }
            }catch (InputMismatchException ex) {
                System.out.println("Nhap sai roi nhap lại nha :");
                check = false;
                scanner.nextLine();
            }
        }while (!check);

    }
}
