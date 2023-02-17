package PhamBaMinh;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bai3 {
    //Bài 3: Đổi số ở hệ thập phân sang số dạng cơ số B bất ký.
    //Yêu cầu nhập vào 2 số N(Cơ số 10) và B(2-16). Đổi số N sang cơ số B.
    public static void main(String[] args) {
        Deque<Integer> stackSoDu = new ArrayDeque<Integer>();
        Scanner scanner= new Scanner(System.in);
        int a,b;
        System.out.println("Nhap vao 2 so a,b");
        a=scanner.nextInt();
        b=scanner.nextInt();
        while (a>0&&b>=2&b<=16){
            int soDu = a%b;
            stackSoDu.push(soDu);
            a=a/b;

        }
        System.out.println("So b phan la:");
        int k=stackSoDu.size();
        for (int i = 0; i < k; i++) {
            System.out.print(stackSoDu.pop());
        }







    }

}
