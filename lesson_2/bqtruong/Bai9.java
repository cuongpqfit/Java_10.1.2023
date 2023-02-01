package bqtruong;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n : ");
        int n = scanner.nextInt();
        int i;
        int f=1;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Giai thua cua n la:" +f );
    }
}
