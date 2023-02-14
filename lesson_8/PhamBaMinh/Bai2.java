package PhamBaMinh;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    //Bài 2: Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương dùng LinkedList.
    //Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang:");
        int n = scanner.nextInt();
        LinkedList<Integer>linkedList = new LinkedList<Integer>();
        for (int i = 0; i <n ; i++) {
            System.out.println("So phan tu " + i + ":");
            linkedList.add(scanner.nextInt());
        }
        System.out.println("Ket qua la : "+linkedList.toString());

        int max  = Collections.max(linkedList);
        System.out.println( "Gia tri lon nhat la : "+ max);

        System.out.println("----------------------");
        System.out.println("\nSau khi sap xep");
        Collections.sort(linkedList);
        linkedList.forEach((i) -> System.out.print(i + " "));
        System.out.println("\nGia tri lon nhat la: "+linkedList.get(n-1));



    }



    }
