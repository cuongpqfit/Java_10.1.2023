import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson8_SortCollection {
    public static void main(String[] args) {
        Integer[] arr = {5, -2, 23, 7, 87, -42, 509};
        System.out.println("Mang goc");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nTruoc khi sap xep");
        List<Integer> colList = new ArrayList(Arrays.asList(arr));
        colList.forEach((i) -> System.out.print(i + " "));

        System.out.println("\nSau khi sap xep");
        Collections.sort(colList);
        colList.forEach((i) -> System.out.print(i + " "));


        Integer[] arr2 = { 5, -2, 23, 7, 87, -42, 509 };
        List<Integer> colList2 = new ArrayList(Arrays.asList(arr2));
        System.out.println("\nMang sap xep giam");
        Collections.sort(colList2, Collections.reverseOrder());
        colList2.forEach((i) -> System.out.print(i + " "));
    }
}
