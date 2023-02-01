package PhamBaMinh;

import java.util.Scanner;

public class Bai1 {
    // in ra màn hình giá trị lớn nhất, nhỏ nhất của mảng vừa nhập.
    public static void main(String[] args) {
        System.out.println("Nhap vao so luong phan tu cua mang:");
        Scanner scanner = new Scanner(System.in);
        int n, min, max;
        int [] arr;
        n = scanner.nextInt();
        min = Integer.MAX_VALUE;
        max = 0;
        arr = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhap vao cac phan tu cua mang "+i);
            arr[i] = scanner.nextInt();
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i]>max){
                max = arr[i];
            }
            }
        System.out.println("-----------------------");
        System.out.println("Max cua mang la :"+max);
        System.out.println("Min cua mang la :"+min);
        }

    }

