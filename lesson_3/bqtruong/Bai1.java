package bqtruong;

import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang:");
        int number = scanner.nextInt();
        int[] a = new int[number];
        for (int i =0; i<a.length; i++){
            System.out.print("Nhap phan tu a"+"[" + i + "] ");
            a[i]= scanner.nextInt();
            System.out.println();
        }
        System.out.print("Cac phan tu cua mang da nhap: ");
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
        int max = a[0];
        int min = a[0];
        for (int i=1; i<a.length; i++){
            if (max<a[i]) {
                max = a[i];
            }
            if (min>a[i]){
                min= a[i];
            }
        }
        System.out.println("Gia tri lon nhat cua mang la: " +max);
        System.out.println("Gia tri nho nhat cua mang la: " +min);
    }
}
