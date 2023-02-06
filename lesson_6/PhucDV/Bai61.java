package PhucDV;

import java.util.Scanner;

public class Bai61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong : ");
        float chieuRong = scanner.nextFloat();

        System.out.println("Nhap chieu dai : ");
        float chieuDai = scanner.nextFloat();

        HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);

        float chuVi = hinhChuNhat.tinhChuVi();
        float dienTich = hinhChuNhat.tinhDienTich();

        System.out.println(hinhChuNhat.tinhChuVi());
        System.out.println(hinhChuNhat.tinhDienTich());

        HinhChuNhat hinhChuNhat1 = new HinhChuNhat(chieuDai, chieuRong,chuVi,dienTich);
        System.out.println(hinhChuNhat1);
    }

}
