package PhamBaMinh;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        //Bạn hãy nhập vào một số N bất kỳ và kiểm tra xem N có phải số nguyên tố hay không?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri:");
        int n;
        n = scanner.nextInt();
        boolean primeNumber = true;
        if (n < 2) {
            System.out.println("Khong phai la so nguyen to");
        }
        if (n >= 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primeNumber = false;
                    System.out.println("Khong phai la so nguyen to");
                    break;
                }
            }
            if (primeNumber) {
                System.out.println("La so nguyen to");
            }


        }
    }
}
