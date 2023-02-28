package QuanLyCacLoaiSach;

import java.util.Objects;
import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang = "moi" ;
    private float tienSachGiaoKhoa;
/*Nếu tình trạng sách là mới thì: thành tiền = số lượng * đơn giá.
        Nếu tình trạng sách là cũ thì: thành tiền = số lượng * đơn giá * 50%*/
    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(int maSach, String ngayNhap, int donGia, int soLuong, String nhaXuatBan, String tinhTrang, float tienSachGiaoKhoa) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang=" ";
        if(Objects.equals(tinhTrang, "moi")){
            this.tienSachGiaoKhoa = soLuong * donGia;
        }else {
            this.tienSachGiaoKhoa = (float) (soLuong * donGia * 50)/100;
        }
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public float getTienSachGiaoKhoa() {
        return tienSachGiaoKhoa;
    }

    public void setTienSachGiaoKhoa(float tienSachGiaoKhoa) {
        this.tienSachGiaoKhoa = tienSachGiaoKhoa;
    }

    //hien thi thong tin
    public void showSachGiaoKhoa(){
        super.showSach();
        System.out.println("Tinh trang sach :"+tinhTrang);
        System.out.println("Thanh tien : "+tienSachGiaoKhoa);
    }
    //nhap thong tin
    public void nhapSachGiaoKhoa(Scanner scanner){
        super.nhapSach(scanner);
        System.out.print("Nhap tinh trang sach (moi/cu) :");
        tinhTrang = scanner.next();
        if(Objects.equals(tinhTrang, "moi")){
            tienSachGiaoKhoa = soLuong * donGia;
        }else {
            tienSachGiaoKhoa = (float) (soLuong * donGia * 50)/100;
        }
    }
}
