package QuanLyCacGiaoDich;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich{
    private String loaiTienTe = "Vietnam" ;
    private float tiGia;
    private double tienGiaoDichTienTe;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(int maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, String loaiTienTe, float tiGia, double tienGiaoDichTienTe) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiTienTe = " ";
        this.tiGia = tiGia;
        this.tienGiaoDichTienTe = donGia * soLuong * tiGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public double getTienGiaoDichTienTe() {
        return tienGiaoDichTienTe;
    }

    public void setTienGiaoDichTienTe(double tienGiaoDichTienTe) {
        this.tienGiaoDichTienTe = tienGiaoDichTienTe;
    }
    //hien thi thong tin

    public void showGiaoDichTienTe(){
        super.showGiaoDich();
        System.out.println("Loai tien te :"+loaiTienTe);
        System.out.println("Thanh tien : "+tienGiaoDichTienTe);
        if(Objects.equals(loaiTienTe, "Vietnam")){
            Locale locale =new Locale("vi","VN");
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
            String c = numberFormat.format(tienGiaoDichTienTe);
            System.out.println("Thanh tien : "+c);
        }else if(Objects.equals(loaiTienTe, "USD")){
            Locale locale =new Locale("en","EN");
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
            String c = numberFormat.format(tienGiaoDichTienTe);
            System.out.println("Thanh tien : "+c);
        }else {
            Locale locale =new Locale("de","DE");
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
            String c = numberFormat.format(tienGiaoDichTienTe);
            System.out.println("Thanh tien : "+c);
        }
    }
    //nhap thong tin
    public void nhapGiaoDichTienTe(Scanner scanner){
        super.showGiaoDich();
        System.out.print("Nhap loai tien te (Vietnam/USD/Euro) :");
        loaiTienTe = scanner.next();
        tiGia = scanner.nextFloat();
        if(Objects.equals(loaiTienTe, "Vietnam")){
            tienGiaoDichTienTe = soLuong * donGia;
        }else {
            tienGiaoDichTienTe = soLuong * donGia * tiGia;
        }
    }
}
