import java.util.*;

public class Lesson8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> vector1 = new Vector<>();


        ArrayList<Integer> arrayList = new ArrayList<>(100);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(5);

        System.out.println(arrayList);

        int x = arrayList.get(1);
        System.out.println(x);

        ArrayList<Integer> arrayList2 = new ArrayList<>(100);
        System.out.println("arrayList2");
        System.out.println(arrayList2);
        arrayList2.addAll(arrayList);

        System.out.println("arrayList2 add all");
        System.out.println(arrayList2);

//        arrayList2.removeAll(arrayList);
//        System.out.println("arrayList2 remove all");
//        System.out.println(arrayList2);

        System.out.println("arrayList2 SIZE");
        System.out.println(arrayList2.size());

        System.out.println("arrayList2 Container");
        System.out.println(arrayList2.contains(3));
        System.out.println(arrayList2.contains(10));

        System.out.println("arrayList2 isEmpty");
        System.out.println(arrayList2.isEmpty());

        System.out.println("arrayList2 equals");
        System.out.println(arrayList2.equals(arrayList));


        System.out.println("arrayList2 containerAll");
        System.out.println(arrayList2.containsAll(arrayList));

        System.out.println("arrayList2 removeAll");
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));


        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(5);

        System.out.println("linkedList");
        linkedList.forEach((i) -> System.out.println(i));

        linkedList.remove(1);

        System.out.println("linkedList sau khi remove");
        linkedList.forEach((i) -> System.out.println(i));

    }

}
