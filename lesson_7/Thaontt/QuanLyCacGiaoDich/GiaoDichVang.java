package QuanLyCacGiaoDich;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang = " ";
    private double tienGiaoDichVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(int maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, String loaiVang, double tienGiaoDichVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
        this.tienGiaoDichVang = soLuong * donGia;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public double getTienGiaoDichVang() {
        return tienGiaoDichVang;
    }

    public void setTienGiaoDichVang(double tienGiaoDichVang) {
        this.tienGiaoDichVang = tienGiaoDichVang;
    }
    //hien thi thong tin
    public void showGiaoDichVang(){
        super.showGiaoDich();
        System.out.println("Loai vang :"+ loaiVang);
        Locale locale =new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String c = numberFormat.format(tienGiaoDichVang);
        System.out.println("Thanh tien : "+c);
    }
    //nhap thong tin
    public void nhapGiaoDichVang(Scanner scanner){
        super.showGiaoDich();
        System.out.print("Loai vang :");
        loaiVang = scanner.next();
        tienGiaoDichVang = donGia * soLuong;
    }
}
