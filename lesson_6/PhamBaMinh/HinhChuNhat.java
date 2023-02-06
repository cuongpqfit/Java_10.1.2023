package PhamBaMinh.Bai1;

import java.util.Scanner;

public class HinhChuNhat {
    private double chieudai;
    private double chieurong;
    public HinhChuNhat(){

    }
    public HinhChuNhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        this.chieudai = scanner.nextDouble();
        System.out.println("Nhap vao chieu rong: ");
        this.chieurong = scanner.nextDouble();

    }
    public double dienTich() {
        return chieurong*chieudai;
    }
    public double chuVi(){
        return (chieudai+chieurong)* 2;}
    public String toString(){
        return chieudai + " "+chieurong +" "+dienTich() +" "+chuVi();
    }
}
class KiemNghiem{
    public static void main(String[] args) {
    HinhChuNhat hinhChuNhat = new HinhChuNhat();
    Scanner scanner = new Scanner(System.in);
    hinhChuNhat.nhap();

    System.out.println("Chu vi cua hinh chu nhat la: "+hinhChuNhat.chuVi());
    System.out.println("Dien tich hinh chu nhat la: "+hinhChuNhat.dienTich());
    }
}
