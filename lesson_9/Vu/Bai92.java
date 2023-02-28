package lesson_9.Vu;

import java.util.Scanner;

public class Bai92 {
    /*Bài 2:
Khai báo 1 mảng có n phần tử các số nguyên, 
viết hàm nhập các phần tử cho mảng. 
Bắt ngoại lệ nếu nhập phần từ có giá trị
là 100 thì in ra các phần tử đã nhập và kết thúc chương trình.
 */
public static void main(String[]agrs){
    Scanner scn = new Scanner(System.in);
    System.out.println("ban muon tao mang co bao nhieu phan tu N = ");
    int n = scn.nextInt();

    int [] a = new int[n];
    System.out.println("nhap cac phan tu cua mang nao ");

    public static void validate(int n){
        try{
            if (n == 100) throw new ArithmeticException("not valid");

        } catch (ArithmeticException) {
        //
        }


    }
    try {
        for( int i = 0; i < n ; i++){
        
        
        }
            
    } catch (Exception e) {
        // TODO: handle exception
    }


    }




    }
