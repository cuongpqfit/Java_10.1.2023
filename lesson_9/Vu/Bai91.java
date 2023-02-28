// package lesson_9.Vu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai91 {
    /*Bài 1:
Viết chương trình nhập vào 2 số thực. Bắt ngoại lệ để khi nhập vào không phải là số 
và bắt người dùng phải nhập lại chođến khi là số.
Cài đặt hàm chia, trong đó bắt ngoại lệ nếu số chia là 0 thì thông báo phép chia
 không hợp lệ và kết thúc chương trình.
 */
    public static void main(String[]agrs){
        Scanner scn = new Scanner(System.in);
        while(true){
            double d1;
            double d2;

        try {
        System.out.println("nhap vao 2 so thuc");

            d1 = scn.nextDouble();
            d2 = scn.nextDouble();

        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("nhap sai roi , nhap lai so thuc di ");

        }

        finally{
            // System.out.println("nhap lai khong ? ( Y: Yes/ N: No)");
            // String retry = scn.nextLine();
            if (d1.hasNextDouble()) 
                break;

        
        // System.out.println("so thuc vua nhap vao la " + d1);

    }
}
}
}