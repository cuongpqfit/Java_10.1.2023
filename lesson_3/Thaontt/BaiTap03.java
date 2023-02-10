package Thaontt;

import java.util.Scanner;

public class BaiTap03 {
    /*
    3. Nhập vào kích thước và giá trị của từng ma trận. Kiểm tra xem 2 ma trận có cùng kích thước không và in ra màn hình ma trận tổng của 2 ma trận trên.
	Ví dụ:
	Nhap so hang cua matrix1: 3
	Nhap so cot cua matrix1: 3
	Nhap so hang cua matrix2: 3
	Nhap so cot cua matrix2: 3
	Nhap ma tran 1
	Nhap phan tu matrix1[0][0]: 2
	Nhap phan tu matrix1[0][1]: 1
	Nhap phan tu matrix1[0][2]: 2
	Nhap phan tu matrix1[1][0]: 3
	Nhap phan tu matrix1[1][1]: 4
	Nhap phan tu matrix1[1][2]: 5
	Nhap phan tu matrix1[2][0]: 4
	Nhap phan tu matrix1[2][1]: 2
	Nhap phan tu matrix1[2][2]: 0
	Nhap ma tran 2
	Nhap phan tu matrix2[0][0]: 2
	Nhap phan tu matrix2[0][1]: 4
	Nhap phan tu matrix2[0][2]: 5
	Nhap phan tu matrix2[1][0]: 3
	Nhap phan tu matrix2[1][1]: 4
	Nhap phan tu matrix2[1][2]: 5
	Nhap phan tu matrix2[2][0]: 3
	Nhap phan tu matrix2[2][1]: 4
	Nhap phan tu matrix2[2][2]: 5
	Ket qua cua phep cong hai ma tran la:
	4 5 7
	6 8 10
	7 6 5
    */
    public static void showMatrix(int[][] matrix, int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rowOfMatrix1, colOfMatrix1, rowOfMatrix2, colOfMatrix2;
        int[][] matrix1, matrix2;
        System.out.print("Nhap so hang cua ma tran 1 :");
        rowOfMatrix1 = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran 1 :");
        colOfMatrix1 = scanner.nextInt();
        System.out.print("Nhap so hang cua ma tran 2 :");
        rowOfMatrix2 = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran 2 :");
        colOfMatrix2 =scanner.nextInt();
        matrix1 = new int[rowOfMatrix1][colOfMatrix1];
        matrix2 = new int[rowOfMatrix2][colOfMatrix2];
        System.out.println("ma tran 1 :");
        for (int i = 0; i < rowOfMatrix1; i++) {
            for (int j = 0; j < colOfMatrix1; j++) {
                System.out.print("["+i + "][" + j+"]=");
                matrix1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("ma tran 2");
        for (int i = 0; i < rowOfMatrix2; i++) {
            for (int j = 0; j < colOfMatrix2; j++) {
                System.out.print("["+i + "][" + j+"]=");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Show matrix 1 : ");
        showMatrix(matrix1, rowOfMatrix1,colOfMatrix1);
        System.out.println("Show matrix 2 : ");
        showMatrix(matrix2,rowOfMatrix2,colOfMatrix2);
        int[][] sumMatrix = new int[99][99];
        if((rowOfMatrix1 != rowOfMatrix2)||(colOfMatrix1 != colOfMatrix2)){
            System.out.println("khong cong duoc !");
            return;
        }
        for (int i = 0; i < rowOfMatrix1; i++) {
            for (int j = 0; j < colOfMatrix1; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum Matrix : ");
        showMatrix(sumMatrix, rowOfMatrix1,colOfMatrix1);
    }
}
