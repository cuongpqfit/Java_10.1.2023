package QuanLyCacGiaoDich;

import java.util.Scanner;

public class GiaoDich {
    public int maGiaoDich;
    public String ngayGiaoDich=" ";
    public double donGia;
    public  int soLuong;

    public GiaoDich() {
    }

    public GiaoDich(int maGiaoDich, String ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    //hien thi thong tin
    public void showGiaoDich(){
            System.out.println("Ma giao dich : " + maGiaoDich);
            System.out.println("Ngay giao dich :" + java.time.LocalDate.now());
            System.out.println("Don gia : " + donGia);
            System.out.println("So Luong :" + soLuong);

    }
    //nhap thong tin
    public void nhapGiaoDich(Scanner scanner){
        System.out.println("Nhap ma giao dich :");
        maGiaoDich = scanner.nextInt();
        System.out.println("Nhap don gia :");
        donGia = scanner.nextDouble();
        System.out.println("Nhap so luong :");
        soLuong = scanner.nextInt();
    }

}
