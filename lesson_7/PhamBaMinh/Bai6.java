package PhamBaMinh;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n = scanner.nextInt();
        int[]a = new int[n];
        System.out.println("Nhap vao cac phan tu:");
        for (int i = 0; i <n ; i++) {
            System.out.print("["+i+"]");
            a[i]= scanner.nextInt();
        }
        System.out.println("Mang ban dau la:");
        for (int i:a) {
            System.out.print(i+" ");
        }
        int temp;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n ; j++) {
                if (a[j-1]<a[j]){
                    temp = a[j-1];
                    a[j-1]= a[j];
                    a[j]=temp;
                }

            }
        }
        System.out.println("\nMang sau sap xep la: ");
        for (int i:a) {
            System.out.print(i+" ");
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            if (a[i]>i){
                sum+=a[i];
                a[i+1]=a[i+1]-1;

            }else {
                a[i]=0;
            }

        }
        System.out.println("So lit sua nhieu nhat co the vat duocj la: "+sum);

    }

}
