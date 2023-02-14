public class SelectionSort {
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

        int min, tmp;
        for (int i=0; i<n; i++) {
            min = i;

            //Tim phan thu j mà A[j] là nhỏ nhất
            for (int j=i+1; j<n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }

            tmp = A[i];
            A[i] = A[min];
            A[min] = tmp;
        }

        System.out.println("\nDay so sau khi sắp xếp:");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
