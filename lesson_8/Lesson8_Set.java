import java.util.HashSet;
import java.util.Set;

public class Lesson8_Set {
    public static void main(String[] args) {
        // Create set
        Set<String> items = new HashSet<>();
        items.add("A02"); // Add new item
        items.add("D03");
        items.add("D03"); // item is ignored
        items.add("01");
        items.add("04");



        for (String item: items) {
            System.out.print(item + " ");
        }

        System.out.println("\nRemove");
        items.remove("D03");

        for (String item: items) {
            System.out.print(item + " ");
        }


        System.out.println("\nClear");
        items.clear();
        System.out.print(items);
    }

}
