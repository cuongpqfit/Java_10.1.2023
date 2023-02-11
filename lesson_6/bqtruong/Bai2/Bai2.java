package bqtruong.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){

        Student sv1 = new Student(00001, "Nguyen Van A", 10,8);
        Student sv2 = new Student(00002, "Nguyen Van B", 9,8);
        Student sv3 = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        sv3.setMaSV(scanner.nextInt()); scanner.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        sv3.setHoTen(scanner.nextLine());
        System.out.println("Nhap diem LT : ");
        sv3.setDiemLT(scanner.nextFloat());
        System.out.println("Nhap diem TH : ");
        sv3.setDiemTH(scanner.nextFloat());

        System.out.println("+--------+--------------+---------+---------+---------+");
        System.out.println("|  MSSV  |    ho ten    | diem LT | diem TH | diem TB |");
        System.out.println("+--------+--------------+---------+---------+---------+");

        sv1.show();
        sv2.show();
        sv3.show();
        System.out.println("+--------+--------------+---------+---------+---------+");

    }
}
