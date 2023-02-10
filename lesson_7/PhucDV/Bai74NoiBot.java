package PhucDV;

//    Bài 4: Viết code giải thuật sắp xếp nổi bọt

public class Bai74NoiBot {
    public static void main(String[] args) {
        int [] matrix = {3,2,4,6,9,7,8};
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 1; j < matrix.length - i ; j++) {
                if(matrix[j] < matrix[j-1]){
                    int tmp = matrix[j];
                    matrix[j] = matrix [j-1];
                    matrix[j-1] = tmp;
                }
            }
        }
        for (int j : matrix) {
            System.out.print(j + " ");
        }
    }
}
