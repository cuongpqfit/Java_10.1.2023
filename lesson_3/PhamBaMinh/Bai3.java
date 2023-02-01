package PhamBaMinh;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row1, col1, row2, col2, row, col;
        int[][]matrix1, matrix2, matrix;
        System.out.println("Nhap so cot cua ma tran1");
        row1 = scanner.nextInt();
        System.out.println("Nhap so hang cua ma tran1");
        col1 = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran2");
        row2 = scanner.nextInt();
        System.out.println("Nhap so hang cua ma tran2");
        col2 = scanner.nextInt();
        matrix1 = new int[row1][col1];
        matrix2 = new int[row2][col2];
        matrix = new int[row1][col1];
        System.out.println("Ma tran1 ");
        for (int i = 0; i <row1 ; i++) {
            for (int j = 0; j <col1 ; j++) {
                System.out.print("["+i+"]"+"["+j+"]");
                matrix1[i][j] = scanner.nextInt();
            }

        }
        System.out.println("Ma tran2 ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j <row2 ; j++) {
                System.out.print("["+i+"]"+"["+j+"]");
                matrix2[i][j] = scanner.nextInt();

            }

        }


    }
}
