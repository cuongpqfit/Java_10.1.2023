package Thaontt;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class BaiTap02 {
    /*
     Bài 2: Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương dùng LinkedList.
Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
    */
    public static void main (String[] args) {
        //nhap mang
        System.out.println("Nhap so phan tu mang : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Nhap cac phan tu cua mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cua phan tu thu "+(i+1)+": ");
            list.add(scanner.nextInt());
        }
        System.out.print("Input : ");
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println();
//        int max = list.get(0);
//        for (int i = 0; i < n; i++) {
//            if(max < list.get(i)) max =list.get(i);
//        }
       Integer max = Collections.max(list);
        System.out.print("Gia tri lon nhat cua mang : " + max);
    }
}
