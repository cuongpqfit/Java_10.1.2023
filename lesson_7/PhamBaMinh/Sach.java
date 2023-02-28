package PhamBaMinh;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Sach {
    private String maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaSX;

    Scanner scanner = new Scanner(System.in);

    public Sach() {
    }

    public Sach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaSX) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaSX = nhaSX;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
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

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }
    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String s1 = simpleDateFormat.format(ngayNhap);
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        String s2 = numberFormat.format(donGia);
        return"Ma Sach"+maSach+"Ngay nhap"+s1+"Don gia"+s2+"So luong"+soLuong+"Nha xuat ban"+nhaSX ;
    }
    public void nhapSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        nhaSX = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập số lượng: ");
        soLuong = scanner.nextInt();
    }

}
