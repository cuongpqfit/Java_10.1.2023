package bqtruong;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi co chu in hoa : ");
        String chuoi = scanner.nextLine();
        System.out.println("Chuoi sau khi doi: " );
        System.out.println(chuoi.toLowerCase());

    }
}
