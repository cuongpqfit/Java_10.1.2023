package bqtruong.Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang :");
        int n = scanner.nextInt();
        if (n <= 1 || n >= 105) {
            System.out.println("Hay nhap lai mang");
            return;
        }
        int[] a = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "]");
            a[i] = scanner.nextInt();

        }
        System.out.println("Mang da nhap la :");
        for (int k : a) {
            System.out.print(k + " ");

        }
        long count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;

                }
            }
        }
        System.out.println("\nSo luong cap bang nhau la : " + count);
    }

}
