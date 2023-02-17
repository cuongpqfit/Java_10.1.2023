package Thaontt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap04 {
    /*
     Bài tập 4: Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dùng ArrayList.
Sắp xếp các phần tử trong mảng theo thứ tự ngược lại
     */
    public static void main (String[] args){
        // nhap mang
        System.out.println("Nhap so phan tu cua mang : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println();
        System.out.println("Nhap cac phan tu cua mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cua phan tu thu "+(i+1)+": ");
            list.add(scanner.nextInt());
        }
        System.out.println("Input : ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        //sap xep mang
        System.out.print("List sap xep theo thu tu giam dan :");
        //Arrays.sort(list, Collections.reverseOrder());
        Collections.sort(list, Collections.reverseOrder());
        for(int num :list){
            System.out.print( num + " ");
        }
        System.out.println();
        System.out.print("List sap xep theo thu tu tang dan :");
        Collections.sort(list);
        for(int num :list){
            System.out.print( num + " ");
        }
    }
}
