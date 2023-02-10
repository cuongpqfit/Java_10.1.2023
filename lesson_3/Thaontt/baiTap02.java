package Thaontt;

import java.util.Scanner;

public class baiTap02 {
    // nhap phan tu mang
    public static int readInteger(){
        System.out.print("Nhap so phan tu cua mang : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println();
        return a;
    }
    public static void main (String[]args){
        //nhap gia tri mang
        int n = 0;
        n = readInteger();
        int input;
        int[] A = new int[n];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri phan tu thu "+ i + ": ");
            input = in.nextInt();
            A[i] = input;
        }
        //in mang
        System.out.print("In ra mang da doc duoc : ");
        for(int i : A){
            System.out.print(i + " ");

        }
        System.out.println();
        //Tìm phần tử có tần suất xuất hiện nhiều nhất
        int max = 1;
        int b;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(A[i] == A[j])
                    count++;
            }
            if(max < count){
                max = count;
                max = A[i];
            }
        }
        System.out.println("So lan xuat hien la : " + max);
        System.out.println("phan tu xuat hien nhieu nhat trong mang la : " );
        for (int i = 0; i < A.length; i++) {
            if(A[i]==max)
                System.out.println(A[i]);
        }
    }
}
