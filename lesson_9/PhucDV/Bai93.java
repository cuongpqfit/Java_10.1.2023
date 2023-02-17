package PhucDV;

//Bài 3: Đổi số ở hệ thập phân sang số dạng cơ số B bất ký.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bai93 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập sô muốn chuyển đổi : ");
        int n = scanner.nextInt();
        System.out.println("Nhập cơ số : ");
        int b = scanner.nextInt();
        Deque<Integer> stack = new ArrayDeque<Integer>();
        System.out.println("Kết quả chuyển đổi " + n + " sang cơ số " + b + " là :");
        while (n > 0){
            stack.push(n%b);
            n /= b;
        }
        int a = stack.size();
        for (int i = 0; i <a; i++) {
            System.out.print(stack.pop());
        }
    }
}
