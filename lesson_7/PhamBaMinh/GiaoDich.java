package PhamBaMinh;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class GiaoDich {
    private String maGD;
    private int ngayGD;
    private double donGia;
    private int soLuong;

    Scanner scanner = new Scanner(System.in);
    public GiaoDich() {
    }

    public String getMaGD() {
        return maGD;
    }

    public GiaoDich(String maGD, int ngayGD, double donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public int getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(int ngayGD) {
        this.ngayGD = ngayGD;
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
    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String s = simpleDateFormat.format(ngayGD);
        return "MaGD"+this.maGD+"NgayGD"+s+"DonGIa"+this.donGia+"SOLuong"+this.soLuong;
    }
    public void nhapGD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma GD");
        maGD = scanner.nextLine();
        System.out.println("Nhap ngay GD");
        ngayGD= scanner.nextInt();
        System.out.println("Nhap don gia");
        donGia= scanner.nextDouble();
        System.out.println("Nhap so luong");
        soLuong= scanner.nextInt();
    }
}
