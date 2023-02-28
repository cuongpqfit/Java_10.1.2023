import java.util.ArrayDeque;
import java.util.Deque;

class Deque_Queue{

    public static void main(String[]agrs) {
        Deque<String> queue = new ArrayDeque<String>();
        queue.add("a");
        queue.add("b");
        queue.add("c");

        System.out.println(queue);
        System.out.println("-------------");

        Deque<String> stack = new ArrayDeque<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack);
        System.out.println("-------------");
    
    
    }

}