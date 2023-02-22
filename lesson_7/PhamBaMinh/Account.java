package PhamBaMinh;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;

    public Account() {
    }

    public Account(long soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }

    public Account(long soTK, String tenTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK=50;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoTienTrongTK() {
        return soTienTrongTK;
    }

    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }
    public String toString(){
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormatVN = NumberFormat.getNumberInstance(locale);
        String s1 = numberFormatVN.format(soTienTrongTK);
        return "SoTK"+this.soTK+"tenTK"+this.tenTK+"So tien trong tk"+s1;
    }
    //Phuong thuc nap tien vao tk:
    public void napTien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien ban muon nap:");
        double nap = sc.nextDouble();
        if (nap>0){
            soTienTrongTK +=nap;
            System.out.println("Ban vua nap"+nap+ "vao tai khoan");
            System.out.println("So tien trong tk cua ban la: "+soTienTrongTK);

        }else{
            System.out.println("So tien ban nap ko dung");
        }

    }
    public void rutTien(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so tien ban muon rut:");
        double rut = sc.nextDouble();
        int phi = 5000;
        if (rut<soTienTrongTK-phi){
            soTienTrongTK-=phi;
            System.out.println("So tien trong tai khoan cua ban la:"+soTienTrongTK);

        }else {
            System.out.println("So tien trong tk cua ban khong du de rut!!!");
        }
    }
    public void daoHan(){
        double laiSuat = 0.035;
        soTienTrongTK = soTienTrongTK+soTK*laiSuat;
        System.out.println("Tai khoan cua ban da dao han.So tien trong tk cua ban la: "+soTienTrongTK);
    }
    public void chuyenTien(Account account){
        Scanner sc = new Scanner(System.in);
        double chuyen = sc.nextDouble();
        if (chuyen<0||chuyen<soTienTrongTK){
            this.soTienTrongTK-=chuyen;
            account.soTienTrongTK = soTienTrongTK+chuyen;

            System.out.println("Ban da chuyen thanh cong"+chuyen);
            System.out.println("So tien trong tai khoan cua ban la:"+this.soTienTrongTK);
            System.out.println("Ban da nhan duoc "+chuyen);
            System.out.println("So tien trong tai khoan cua ban la :"+account.soTienTrongTK);

        }else {
            System.out.println("Tai khoan cua ban khong du de chuyen tien!!!");
        }
    }
    

}
