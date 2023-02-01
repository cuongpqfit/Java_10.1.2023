package cuongpq;

import java.util.Scanner;

public class Bai4 {
    public static void showMatrix(float[][] matrix, int m, int n) {
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        float[][]matrix1, matrix2, matrix;
        System.out.println("Nhap cap cua ma tran");
        n = scanner.nextInt();
        matrix = new float[n][n];
        System.out.println("Ma tran1");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("["+i+"]"+"["+j+"]");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Show matrix:");
        showMatrix(matrix, n, n);

        boolean check = false;
        float tmp;
        int dem = 0;

        for (int i=0; i<n; i++) {
            if (matrix[i][i] == 0) {
                check = false;

                for (int j=i+1; j<n; j++) {
                    if (matrix[i][j] != 0 ) {
                        for (int k=0; k<n; k++) {
                            tmp = matrix[k][i];
                            matrix[k][i] = matrix[k][j];
                            matrix[k][j] = tmp;
                        }

                        dem++;
                        check = true;
                    }
                }

                if (!check)  {
                    System.out.println("Dinh thuc matrix: " + 0);
                    return;
                }
            }

            for (int j=i+1; j<n; j++) {
                float current = matrix[j][i]/matrix[i][i];

                for (int k=0; k<n; k++) {
                    matrix[j][k] = matrix[j][k] - ((current * matrix[i][k]));
                }
            }
        }

        float det = 1;
        for (int i=0; i<n; i++) det = det*matrix[i][i];
        if (dem % 2 == 1) det = -det;

//        System.out.println("Show matrix:");
//        showMatrix(matrix, n, n);
        System.out.println("Dinh thuc matrix: " + det);

    }
}
