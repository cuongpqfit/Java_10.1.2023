package PhucDV;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private long soTK;
    private String tenTK;
    private double soTien;

     public static final double laiSuat = 0.035;

    public Account() {
    }

    public Account(long soTK, String tenTK, double soTien) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public Account(long soTK, String tenTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = 50;
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

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public double getLaiSuat() {
        return laiSuat;
    }
    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(soTien);
        return "Account{" +
                " soTK = " + soTK +
                ", tenTK = " + tenTK + '\'' +
                ", soTien = " + str1 +
                '}';
    }

    public void napTien(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền nạp : ");
        double tienNap = scanner.nextDouble();
        if(tienNap < 0){
            System.out.println("Nhập lỗi.");
        }else {
            this.soTien += tienNap;
            System.out.println("Nạp thành công.");
            System.out.println(this);
        }
    }

    public void rutTien(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền rút : ");
        double tienRut = scanner.nextDouble();
        if(tienRut < 0 || tienRut > this.soTien){
            System.out.println("Nhập lỗi.");
        }else {
            this.soTien -= tienRut;
            System.out.println("Rút thành công.");
            System.out.println(this);
        }
    }

    public void daoHan(){
        System.out.println("Số tiền sau khi đáo hạn kì này: ");
        this.soTien += this.soTien * laiSuat;
        System.out.println(this);
    }

    public void chuyenTien(Account account){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền chuyển : ");
        double tienChuyen = scanner.nextDouble();
        if(tienChuyen < 0 || tienChuyen > this.soTien){
            System.out.println("Nhập lỗi.");
        }else {
            this.soTien -= tienChuyen;
            account.soTien += tienChuyen;
            System.out.println("chuyển tiền thành công.");
            System.out.println(this);
            System.out.println(account);
        }
    }
}
