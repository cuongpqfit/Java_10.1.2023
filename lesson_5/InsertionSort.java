public class InsertionSort {

    public static void main(String[] args) {
        int[] A = {5, 4, 3, 2, 1};
        // Số chẵn thì đứng trước, còn s
        // 2, 4, 5, 3, 1
        // 4, 2 3 5 1
        int n = A.length;

        System.out.println("Day so input");
        for (int i : A) {
            System.out.print(i + " ");
        }

        //Thu hien thuat toan sap xep chen
        int last, j;
        int tmp;
        for (int i=1; i<n; i++) {
            last = A[i];
            j = i;

            //duyet cac phan tử trước i để đưa giá trị A[i] về đúng vị trí
            while ((j>0) && (A[j-1] > last)) {

                //Đổi chỗ 2 phần tử
                tmp = A[j];
                A[j] = A[j-1];
                A[j-1] = tmp;

                j = j - 1;
            }

            A[j] = last;
        }


        System.out.println("\nDay so sau khi sắp xếp:");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
