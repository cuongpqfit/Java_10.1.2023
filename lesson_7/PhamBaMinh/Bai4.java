package PhamBaMinh;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n = scanner.nextInt();
        System.out.println("Nhap cac phan tu cua mang:");
        int[]arr = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("["+i+"]"+" ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang la ");
        for (int i:arr) {
            System.out.println(i+" ");
        }
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <n ; j++) {
                if (arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Mang sau sap xep la:");
        for (int i:arr) {
            System.out.print(i+" ");

        }

    }
}
