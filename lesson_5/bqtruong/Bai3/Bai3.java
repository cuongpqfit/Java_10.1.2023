package bqtruong.Bai3;

import java.util.Scanner;

public class Bai3 {
    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong ve: ");
        int n = scanner.nextInt();

        int[] A = new int[n];
        System.out.print("Nhap so cac tam ve: ");
        for (int i=0; i<n; i++){
            System.out.println(" ");
            A[i] = scanner.nextInt();
        }
        System.out.print("Cac so ve da nhap: ");
        for (int show : A) {
            System.out.print(show + " ");
        }

        int last, j;
        int tmp;
        for (int i=1; i<n; i++) {
            last = A[i];
            j = i;

            while ((j>0) && (A[j-1]%2!=0 && A[j]%2==0 )) {

                tmp = A[j];
                A[j] = A[j-1];
                A[j-1] = tmp;

                j = j - 1;
            }

            A[j] = last;
        }

        System.out.println("\nSo ve sau khi duoc sap xep:");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }

}
