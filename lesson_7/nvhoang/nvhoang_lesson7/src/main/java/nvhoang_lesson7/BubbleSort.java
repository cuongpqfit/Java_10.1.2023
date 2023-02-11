package nvhoang_lesson7;
import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args) {
            int[] list = {5, 3, 8, 1, 9, 4};

            bubbleSort(list);

            System.out.println("Sorted list: " + Arrays.toString(list));
        }

        public static void bubbleSort(int[] list) {
            int n = list.length;
            int temp;

            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (list[j] > list[j+1]) {
                        temp = list[j];
                        list[j] = list[j+1];
                        list[j+1] = temp;
                    }
                }
            }
        }
    }

}
