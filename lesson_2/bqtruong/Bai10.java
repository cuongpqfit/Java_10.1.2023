package bqtruong;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n : ");
        int n = scanner.nextInt();

        int i;
        for (i=2;i<=n;i++){
            if (n<=2){
                System.out.println(n +" la so nguyen to");
            }
            else if (n%i==0){
                System.out.println(n +"k la so nguyen to");
            }

        }
        System.out.println(n +" la so nguyen to");
    }

}
