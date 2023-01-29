package PhucDV;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        float[][] matrix = createMatrix();
        showMatrix(matrix);
        System.out.println("Định thức của ma trận đã nhập là: ");
        System.out.println(calDet(matrix));
    }

//    Tạo matrix
    public static float[][] createMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cấp ma trận : ");
        int n = scanner.nextInt();
        System.out.println();
        float [][] matrix = new float[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print("Nhập phần tử matrix"+"["+ i + "]"+"["+ j + "]" + ": ");
                matrix[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        return matrix;
    }

//    Show matrix
    public static float[][] showMatrix(float[][] matrix){
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

//    Tính định thức. phương pháp biến đổi về dạng tam giác trên. Định thức sẽ bằng tích đường chéo.
    public static float calDet(float[][] matrix){
        int det = 1;
        int doiDau = 1;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int k = i + 1; k < matrix.length; k++) {

//                Xét vị trí matrix[i][i]. nếu bằng 0 thì đổi cột, và kéo theo giá trị định thức đổi dấu.

                if (matrix[i][i] == 0) {
                    if(matrix[i][k] != 0){
                        for (int j = 0; j < matrix.length; j++) {
                            float tmp = matrix[j][i];
                            matrix[j][i] = matrix[j][k];
                            matrix[j][k] = tmp;
                        }
                        doiDau *= -1;
                    }else{
                        det = 0;
                    }
                }
                    float tmp = -(float) (matrix[k][i]) / matrix[i][i];
                    for (int j = 0; j < matrix.length; j++) {
                        matrix[k][j] = matrix[k][j] + (tmp * matrix[i][j]);
                    }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            det *= matrix[i][i];
        }
        det = doiDau * det;
        return det;
    }
}
