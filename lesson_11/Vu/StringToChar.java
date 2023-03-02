import java.util.ArrayDeque;
import java.util.Deque;

public class StringToChar {

    
    public static void main(String [] agrs) {

        String a = "ABCDE";
        char [] chars = a.toCharArray();

        for (char i: chars)
        System.out.print(i + " ");
        
    //     Deque<String> queue = new ArrayDeque<String>();
        Deque<Character> queue = new ArrayDeque<Character>();

        for ( int i = 0; i < chars.length ; i++ ){
            queue.add(chars[i]);
        }
        System.out.print(queue);



    }
}
