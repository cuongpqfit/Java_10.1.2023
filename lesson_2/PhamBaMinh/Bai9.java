package PhamBaMinh;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        //Bạn hãy viết chương trình tính n! (n!=1*2*3*...*n)
        System.out.println("Nhap so n:");
        Scanner scanner = new Scanner(System.in);
        int n ;
        long f = 1;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            f *=i;

        }
        System.out.println("Ket qua la :" + f);

    }
}
