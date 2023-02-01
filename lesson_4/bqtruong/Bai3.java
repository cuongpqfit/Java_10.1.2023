package bqtruong;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi S1: ");
        String S1 = scanner.nextLine();

        System.out.println("Nhap vao chuoi S2: ");
        String S2 = scanner.nextLine();

        String S3 = S1.concat(S2);
        System.out.println("Chuoi sau khi noi la:" +S3);

    }
}
