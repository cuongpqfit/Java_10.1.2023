package bqtruong.Bai2;

import java.util.Scanner;

public class Bai2 {
    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = scanner.nextInt();

        int[] A = new int[n];
        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i=0; i<n; i++){
            System.out.println(" ");
            A[i] = scanner.nextInt();
        }
        System.out.print("Cac phan tu cua mang da nhap: ");
        for (int show : A) {
            System.out.print(show + " ");
        }

        int last, j;
        int tmp;
        for (int i=1; i<n; i++) {
            last = A[i];
            j = i;

            while ((j>0) && (A[j-1] > last)) {

                tmp = A[j];
                A[j] = A[j-1];
                A[j-1] = tmp;

                j = j - 1;
            }

            A[j] = last;
        }

        System.out.println("\nMang sau khi duoc sap xep:");
        for (int i : A) {
            System.out.print(i + " ");
        }

    }
}
