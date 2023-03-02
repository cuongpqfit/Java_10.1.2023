// package lesson_9.Vu;

import java.util.Scanner;
import java.util.Stack;

public class Bai93 {
    /* Bài 3: Đổi số ở hệ thập phân sang số dạng cơ số B bất ký.
Yêu cầu nhập vào 2 số N(Cơ số 10) và B(2-16). Đổi số N sang cơ số B.
Hướng dẫn:*/

public void ChuyenStr (int n){
    Integer i = Integer.valueOf(n);
    String str = i.toString();
}
public static void main(String[]agrs){
    Scanner scn = new Scanner(System.in);
    System.out.println("nhap so he co so 10 : ");
    int n = scn.nextInt();
    System.out.println("nhap he co so muon chuyen doi B (2-16 ): ");
    int b = scn.nextInt();

    int thuong = -1;
    ChuyenStr str = new ChuyenStr();
    // Integer i = Integer.valueOf(n);
    // String str = i.toString();

    Stack<String> stack = new Stack<String>();
 
//neu 2 <= b <=10

    while( thuong != 0){
        int tmp = n%b;
        thuong = n/b;
        n = thuong;
        
        stack.push(str.ChuyenStr(tmp));

    }

    System.out.print("so" + n + " chuyen sang he co so " + b + " = " );
    while (!stack.isEmpty()) {
    System.out.print(stack.pop());

    }

    /*
     * 14 /2
     * 7 0
     * 3 1
     * 1 1
     * 0 1
     * 0 2 4 8 
     */

    //neu b>10 
    if (n >10 && n <= 16){
    while( thuong != 0){
        int tmp = n%b;
        // char letter = 'A' ;
        if (tmp <= 10){
            thuong = n/b;
            n = thuong;
            stack.push(tmp);

        } else { 
        char letter = 'A' ;
        switch (tmp) {
            case 11 : letter = 'A'; break;
            case 12 : letter = 'B'; break;
            case 13 : letter = 'C'; break;
            case 14 : letter = 'D'; break;
            case 15 : letter = 'E'; break;
            case 16 : letter = 'F'; break;
        } 
            stack.push(letter);
        }

    }

    }
    /* he so 16//
     * 11 - A
     * 12 - B
     * 13 - C
     * 14 - D
     * 15 - E
     * 16 - F
     */
}
}