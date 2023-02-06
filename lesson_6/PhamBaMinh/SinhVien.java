package PhamBaMinh;

import java.util.Scanner;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public  SinhVien(){

    }

    public SinhVien(int maSinhVien, String hoTen, float diemLT, float diemTH) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    public float diemTB(){
        return (diemLT+diemTH)/2;
    }
    public String toString (){
        return maSinhVien + " "+hoTen+" "+ diemLT+" "+diemTH+" "+diemTB();
    }
    public void show(){
        System.out.printf("%6d %-30s %7.2f %7.2f %7.2f \n",maSinhVien,hoTen,diemTH,diemLT,diemTB());
    }

}
class Test{
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(000001 ,"Nguyen Van A", 10, 8);
        SinhVien sv2 = new SinhVien(000002, "Nguyen Van B",9, 8);
        SinhVien sv3 = new SinhVien();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma SV: ");
        sv3.setMaSinhVien(scanner.nextInt());scanner.nextLine();
        System.out.println("Nhap Ho va Ten SV: ");
        sv3.setHoTen(scanner.nextLine());
        System.out.println("Nhap diem lt: ");
        sv3.setDiemLT(scanner.nextFloat());
        System.out.println("Nhap diem th: ");
        sv3.setDiemTH(scanner.nextFloat());

        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        System.out.println("----------------------------------------------------------");
        System.out.printf("%6s %-30s %7s %7s %7s \n","MaSinh","TenSinhVien","DiemLT","DiemTH","DiemTB");
        sv1.show();
        sv2.show();
        sv3.show();
    }
}
