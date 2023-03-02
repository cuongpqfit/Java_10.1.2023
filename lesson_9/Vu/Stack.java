import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public static void main(String[]agrs){
        // Scanner scn = new Scanner(System.in);
        // System.out.println("nhap so he co so 10 : ");
        // int n = scn.nextInt();
        // System.out.println("nhap he co so muon chuyen doi B (2-16 ): ");
        // int b = scn.nextInt();
    
        // int thuong = -1;
    
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(0);
        stack.push(1);
        stack.push(0);
        stack.push(0);
        stack.push(1);

        while (!stack.isEmpty()) {
            System.out.println("Gia tri: " + stack.pop());
        }

    
}

}