package PhamBaMinh;

import javax.xml.crypto.Data;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySX;
    private Date hanSD;

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date hanSD) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.hanSD = hanSD;
    }

    public HangThucPham() {
    }

    public HangThucPham(String maHang) {
        this.maHang = maHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getHanSD() {
        return hanSD;
    }

    public void setHanSD(Date hanSD) {
        this.hanSD = hanSD;
    }

    public String toString(){
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        String s1 = numberFormat.format(locale);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String s2 = simpleDateFormat.format(ngaySX);
        String s3 =  simpleDateFormat.format(hanSD);


        return "Ma Hang"+this.maHang+"Ten Hang"+this.tenHang+"Don gia"+s1+"Ngay SX"+s2+"HanSD"+s3;
    }
    //Viet phuong thuc kiem tra da het han chua
    public void kiemTraHan(){
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String s1 = simpleDateFormat.format(today);
        if(this.getHanSD().compareTo(today)<0){
            System.out.println("Hom nay la: "+s1+ "Hang van con han su dung");
        }else {
            System.out.println("Hom nay la: "+s1+"Hang da het han su dung");
        }
    }
    public void setNSX(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        this.ngaySX = calendar.getTime();
    }
    public void setHSD(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        this.hanSD = calendar.getTime();
    }

    public static void main(String[] args) {
        HangThucPham thucPham1 = new HangThucPham();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma hang:");
        thucPham1.setMaHang(scanner.nextLine());
        System.out.println("Nhap ten hang:");
        thucPham1.setTenHang(scanner.nextLine());
        System.out.println("Nhap don gia:");
        thucPham1.setDonGia(scanner.nextDouble());
        System.out.println("Nhap nam thang ngay SX");
        thucPham1.setNSX(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println("Nhap nam thang ngay hanSD");
        thucPham1.setHSD(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        System.out.println("Thong tin thuc pham"+thucPham1);
        System.out.println("Kiem tra han su dung:");
        thucPham1.kiemTraHan();




    }



}
