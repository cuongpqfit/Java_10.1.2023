//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package PhamBaMinh;

import java.util.Scanner;

public class Bai3 {
    public Bai3() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so cot cua ma tran1");
        int row1 = scanner.nextInt();
        System.out.println("Nhap so hang cua ma tran1");
        int col1 = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran2");
        int row2 = scanner.nextInt();
        System.out.println("Nhap so hang cua ma tran2");
        int col2 = scanner.nextInt();
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        int[][] matrix = new int[row1][col1];
        System.out.println("Ma tran1 ");

        int i;
        int j;
        for(i = 0; i < row1; ++i) {
            for(j = 0; j < col1; ++j) {
                System.out.print("[" + i + "][" + j + "]");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma tran2 ");

        for(i = 0; i < row2; ++i) {
            for(j = 0; j < row2; ++j) {
                System.out.print("[" + i + "][" + j + "]");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for(i = 0; i < row1; ++i) {
            for(j = 0; j < col1; ++j) {
                System.out.println("[" + i + "][" + j + "]");
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        if (row1!=row2 || col1!=col2){
            System.out.println("Khong cong duoc 2 ma tran");
            return;
        }

        System.out.println("Ma tran tong la:");

        for(i = 0; i < row1; ++i) {
            for(j = 0; j < col1; ++j) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println("");
        }

    }
}
