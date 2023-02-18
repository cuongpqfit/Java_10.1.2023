import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();

        //Nap du lieu vao queue
        queue.add("String 1");
        queue.add("String 2");
        queue.add("String 3");
        queue.add("String 4");
        queue.add("String 5");

        System.out.println("Show Queue " + queue);
        queue.remove();

        System.out.println("Show Queue after Remove() " + queue);

        System.out.println("Show Queue the first after Remove() " + queue.peek());
        System.out.println("Show Queue the first after Remove() " + queue);

        System.out.println("Show Queue Size() " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println("Show Queue poll() " + queue.poll());
        }
    }
}
