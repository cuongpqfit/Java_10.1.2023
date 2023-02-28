package PhamBaMinh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    //Khai báo 1 mảng có n phần tử các số nguyên, viết hàm nhập các phần tử cho mảng. Bắt ngoại lệ nếu nhập phần từ có giá trị
    //là 100 thì in ra các phần tử đã nhập và kết thúc chương trình.
//    static void validate(int n) {
//        try {
//            if (n == 100) throw new ArithmeticException("not valid");
//        } catch (ArithmeticException) {
//            //TODO: CODE HERE
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.println("nhap vao so nguyen n");
        n= scanner.nextInt();
        int[] a= new int[n];
        try {
            for (int i = 0; i < n; i++) {
                System.out.print(+i+" ");
                a[i]= scanner.nextInt();
                if (a[i]== 100) throw new ArithmeticException("not valid");
            }
        }
        catch (ArithmeticException ex){
            for (int i:a) {
                System.out.print(+i+" ");
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}

