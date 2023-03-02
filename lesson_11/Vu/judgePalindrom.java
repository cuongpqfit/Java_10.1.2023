import java.util.ArrayDeque;
import java.util.Deque;

public class judgePalindrom {
    
    public static void testPalindrom(String chars){

        char[] ch = chars.toCharArray();
        
        Deque<Character> queue = new ArrayDeque<Character>();
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < chars.length ; i++){
            queue.add(chars[i]);
            stack.push(chars[i]);
        }
        if(queue.remove().equals(stack.pop())) {
            System.out.println("Palindrom");
        }else {
            System.out.println("Not Palindrom");
        }
    }

    public static void main (String [] agrs){
        Character [] a = {'A','B','B','A','D'};
        testPalindrom(a);

       
    }
}