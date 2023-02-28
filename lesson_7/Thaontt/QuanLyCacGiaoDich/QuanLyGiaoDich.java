package QuanLyCacGiaoDich;

import java.util.Scanner;

public class QuanLyGiaoDich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GiaoDichVang gdv = new GiaoDichVang();
        GiaoDichTienTe gdt = new GiaoDichTienTe();

        System.out.println("Nhap thong tin giao dich tien te !");
        gdt.nhapGiaoDichTienTe(scanner);
        System.out.println("*****************************");
        System.out.println("Nhap thong tin giao dich vang !");
        gdv.nhapGiaoDichVang(scanner);
        System.out.println("*****************************");

        System.out.println("Thong tin giao dich tien te vua nhap la :");
        gdt.showGiaoDichTienTe();
        System.out.println("*****************************");
        System.out.println("Thong tin giao dich vang vua nhap la :");
        gdv.showGiaoDichVang();
    }
}
