package Thaontt;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap01 {
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
        //float average;
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + list.get(i);
        }
        float average = sum / n;
        System.out.println("Gia tri trung binh cua mang da nhap la : "+average);
    }
}