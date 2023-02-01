package PhamBaMinh;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int n;
        int[] arr,res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        n = scanner.nextInt();
        arr = new int[n];
        res = new int[n*2];
        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
            System.out.print("["+i+"]");
            arr[i] = scanner.nextInt();
        }
        int tmp = 0;
        for (int i = 0; i <n*2 ; i++) {
            if (i>=n){
                res[i]= arr[tmp];
                tmp++;
                }
            else {
            res[i]= arr[i];}
            }
        System.out.println("Mang moi la:");
        for (int i = 0; i <n*2; i++) {
            System.out.print(+res[i]+" ");

        }

        }

    }




