package PhucDV;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Matrix 1: ");
        int[][] matrix1 = createMatrix();
        System.out.println("Matrix 2: ");
        int[][] matrix2 = createMatrix();
        System.out.println("Matrix1 : ");
        showMatrix(matrix1);
        System.out.println("Matrix2 : ");
        showMatrix(matrix2);
        sumMatrix(matrix1, matrix2);
    }

//    Create Matrix
    public static int[][] createMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng matrix : ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột matrix : ");
        int col = scanner.nextInt();
        System.out.println();
        int [][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print("Nhập phần tử matrix"+"["+ i + "]"+"["+ j + "]" + ": ");
                matrix[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        return matrix;
    }

//    Tổng 2 matrix
    public static void sumMatrix(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            System.out.println("Hai ma trận không cùng kích thước.");
        }else{
            int [][] sumMatrix = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length ; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("kết quả phép cộng 2 matrix : ");
            showMatrix(sumMatrix);
        }
    }

//    Show mảng
    public static int[][] showMatrix(int[][] matrix){
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
}
