import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackJava {

    public static void main(String[] args) {
        //Stack<Integer> integerStack = new Stack<>();
        Deque<Integer> stack = new ArrayDeque<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Method top: " + stack.peek());
        System.out.println("Method size: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("Gia tri: " + stack.pop());
        }
    }
}
