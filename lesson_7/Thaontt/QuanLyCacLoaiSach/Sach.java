package QuanLyCacLoaiSach;

import java.util.Scanner;

public class Sach {
    public int maSach;
    public String ngayNhap=" ";
    public int donGia;
    public  int soLuong;
    public String nhaXuatBan=" ";

    public Sach() {
    }

    public Sach(int maSach,String ngayNhap, int donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
    //hien thi thong tin
    public void showSach(){
        System.out.println("Ma sach : "+ maSach);
        System.out.println("Ngay nhap :"+ java.time.LocalDate.now());
        System.out.println("Don gia : "+ donGia);
        System.out.println("So Luong :"+ soLuong);
        System.out.println("Nha xuat ban : "+nhaXuatBan);
    }
    //nhap thong tin
    public void nhapSach(Scanner scanner){
        System.out.print("Nhap ma sach :");
        maSach = scanner.nextInt();
        System.out.print("Nhap don gia :");
        donGia = scanner.nextInt();
        System.out.print("Nhap so luong :");
        soLuong = scanner.nextInt();
        System.out.print("Nhap nha xuat ban :");
        nhaXuatBan = scanner.next();
    }
}
