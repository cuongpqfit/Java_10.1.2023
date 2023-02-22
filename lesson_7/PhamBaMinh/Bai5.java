package PhamBaMinh;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[]agrs) {

        System.out.println( " Nhap vao so nguyen n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int [n];

        System.out.println( " Nhap cac phan tu trong mang: ");
        for (int i= 0; i <n ; i ++){
            a[i] = scanner.nextInt();
        }

        for (int i : a)
            System.out.print( i + " ") ;

        System.out.println( "Nhap vao so ban muon tim x: ");
        int x = scanner.nextInt();

        int lowerBound = 0;
        int upperBound = n-1;
        while (lowerBound<=upperBound){
            int mid = lowerBound+(upperBound-lowerBound)/2;
            if (a[mid]<x ){
                lowerBound = mid+1;
            }
            if (a[mid]>x){
                upperBound = mid -1;
            }
            if (a[mid]==x){
                System.out.println("Vi tri can tim la: "+mid);
            }

        }if (lowerBound>upperBound){
            System.out.println("x khong ton tai");
        }

    }
}

