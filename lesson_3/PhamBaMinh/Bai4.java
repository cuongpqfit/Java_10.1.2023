package PhamBaMinh;

import java.util.Scanner;

public class Bai4 {
    public static void  showMatrix(int[][]matrix, int m , int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[][]matrix;
        System.out.println("Nhap cap cua matran");
        n=scanner.nextInt();
        matrix = new int[n][n];
        System.out.println("Ma tran");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "][" + j + "]");
                matrix[i][j]=scanner.nextInt();


            }

        }
        System.out.println("show matrix:");
        showMatrix(matrix,n,n);
    }


}
