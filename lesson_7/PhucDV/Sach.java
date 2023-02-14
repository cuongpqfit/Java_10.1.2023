package PhucDV;

import java.util.Calendar;
import java.util.Date;

public class Sach {
    private String maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXB;

    public Sach() {
    }

    public Sach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXB) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXB = nhaXB;
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

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", ngayNhap=" + ngayNhap +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", nhaXB='" + nhaXB + '\'' +
                '}';
    }
}
