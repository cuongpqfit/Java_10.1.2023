// package lesson_8.Vu;

import java.util.HashMap;
import java.util.Scanner;

public class Bai85 {
    /*Bài tập 5: Viết chương trình cho phép nhập vào n,
     sau đó nhập vào n phần tử số (0 <= ai <= 9), 
     sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ dùng HashSet.
     VD: 1 -> Một, 2 -> Hai, … */
     public static void main(String[]agrs) {
        HashMap<Integer, String> data = new HashMap<>();
        data.put(0, "Khong");
        data.put(1, "Mot");
        data.put(2, "Hai");
        data.put(3, "Ba");
        data.put(4, "Bong");
        data.put(5, "Nam");
        data.put(6, "Sau");
        data.put(7, "Bay");
        data.put(8, "Tam");

        //nhap n
        System.out.print("Ban hay nhap mot so tu 0 den 9 : ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //output

        String s = data.get(n);
        System.out.println("n = " + n + " -> " + s );
        
     }
    
}
