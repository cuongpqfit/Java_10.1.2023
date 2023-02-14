import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson8_Object {
    static class Row {
        Integer[] data = { 5, -2, 23, 7, 87, -42, 509 };
        public Row() {

        }

        @Override
        public String toString() {
            return "Row{" +
                    "data=" + Arrays.toString(data) +
                    '}';
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        List<Integer> colList = new ArrayList();
        for (int i: arr) colList.add(i);

        colList.forEach((i) -> System.out.println(i + " " + i.hashCode()));


        System.out.println("Day 2");
        Integer[] arr1 = { 5, -2, 23, 7, 87, -42, 509 };
        List<Row> colList1 = new ArrayList<>();
        Row row1 = new Row();
        colList1.add(row1);
        colList1.add(row1);

        colList1.forEach((i) -> System.out.println(i + " " + i.hashCode()));

    }
}
