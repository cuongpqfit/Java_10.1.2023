package PhamBaMinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {
    //Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dùng ArrayList.
    //Sắp xếp các phần tử trong mảng theo thứ tự ngược lại
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
        System.out.println("\nKet qua dao nguoc la:");
        for (int i = n-1; i >=0; i--) {
            System.out.print(+arrayList.get(i)+" ");

        }

    }
}
