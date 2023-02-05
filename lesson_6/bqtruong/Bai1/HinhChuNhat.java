package bqtruong.Bai1;

import java.util.Scanner;

public class HinhChuNhat {
    public double chieuDai, chieuRong;

    public HinhChuNhat(){
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public void inputHCN(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        this.setChieuDai(scanner.nextInt());

        System.out.println("Nhap chieu rong: ");
        this.setChieuRong(scanner.nextInt());

    }
    public double dienTich() {
        double dienTich = getChieuDai() * getChieuRong();
        System.out.println("Dien tich hinh chu nhat la : " + dienTich );
        return dienTich;
    }
    public double chuVi(){
        double chuVi = ( getChieuDai() + getChieuRong() ) * 2;
        System.out.println("Chu vi hinh chu nhat la : " + chuVi );
        return chuVi;
    }
    public String toString(){
        return   chieuDai + " " + chieuRong + " " + dienTich() + " " + chuVi();

    }
}
