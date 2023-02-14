package PhamBaMinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    //Bài 1:Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dùng ArrayList.
   // Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu");
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for (int i = 0; i < n; i++) {
            System.out.print("moi ban nhap vao so thu"+(i+1)+":");
            arrayList.add(scanner.nextInt());
        }
        System.out.println("Ket qua la:"+arrayList.toString());
        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong+=arrayList.get(i);

        }
        double tB = tong/n;
        System.out.println("Gia tri trung binh la:" +tB);


    }
}
