package QuanLyCacLoaiSach;

import java.util.Scanner;

public class SachThamKhao extends Sach{
    private float thue;
    private float tienSachThamKhao;

    public SachThamKhao() {
    }

    public SachThamKhao(int maSach, String ngayNhap, int donGia, int soLuong, String nhaXuatBan, float thue, float tienSachThamKhao) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
        this.tienSachThamKhao = (donGia * soLuong)+(donGia * soLuong * thue)/100;
    }

    public float getThue() {
        return thue;
    }

    public void setThue(float thue) {
        this.thue = thue;
    }

    public float getTienSachThamKhao() {
        return tienSachThamKhao;
    }

    public void setTienSachThamKhao(float tienSachThamKhao) {
        this.tienSachThamKhao = tienSachThamKhao;
    }
    //hien thi thong tin
    public void showSachThamKhao(){
        super.showSach();
        System.out.println("Thue:"+thue);
        System.out.println("Thanh tien : "+tienSachThamKhao);
    }
    //nhap thong tin
    public void nhapSachThamKhao(Scanner scanner){
        super.nhapSach(scanner);
        System.out.print("Thue :");
        thue = scanner.nextFloat();
        tienSachThamKhao = (donGia * soLuong)+(donGia * soLuong * thue)/100;
    }
}
