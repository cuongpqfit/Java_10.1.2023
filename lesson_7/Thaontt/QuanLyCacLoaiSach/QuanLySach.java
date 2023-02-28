package QuanLyCacLoaiSach;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SachGiaoKhoa sgk = new SachGiaoKhoa();
        SachThamKhao stk = new SachThamKhao();

        System.out.println("Nhap thong tin sach giao khoa !");
        sgk.nhapSachGiaoKhoa(scanner);
        System.out.println("*****************************");
        System.out.println("Nhap thong tin sach tham khao !");
        stk.nhapSachThamKhao(scanner);
        System.out.println("*****************************");

        System.out.println("Danh sach sach giao khoa vua nhap la :");
        sgk.showSachGiaoKhoa();
        System.out.println("*****************************");
        System.out.println("Danh sach sach tham khao vua nhap la :");
        stk.showSachThamKhao();
    }
}
