package PhucDV;
//Bài 5: Viết code giải thuật tìm kiếm nhị phân

public class Bai75NhiPhan {
    public static void main(String[] args) {
        int [] matrix = {3,2,4,6,9,7,8};
        int target = 5;
        sort(matrix);
        System.out.println();
        int lowerBound = 1;
        int upperBound = matrix.length;
        boolean check = false;
        int mid = 0;
        while (upperBound > lowerBound){
            mid = lowerBound + (upperBound - lowerBound) / 2;
            if(matrix[mid] > target){
                upperBound = mid - 1;
            }else if(matrix[mid] < target){
                lowerBound = mid + 1;
            }else{
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("vị trí của " + target + " trong mảng là " + mid);
        }else{
            System.out.println("Không tồn tại " + target);
        }


    }
    public static void sort(int[] matrix){
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
