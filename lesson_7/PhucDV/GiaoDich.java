package PhucDV;

import java.util.Date;

public class GiaoDich {
    private int maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private int soLuong;

    public GiaoDich() {
    }

    public GiaoDich(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong) {
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

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
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

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich = " + maGiaoDich +
                ", ngayGiaoDich = " + ngayGiaoDich +
                ", donGia = " + donGia +
                ", soLuong = " + soLuong +
                '}';
    }
}
