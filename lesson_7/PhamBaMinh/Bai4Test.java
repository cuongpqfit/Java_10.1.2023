package PhamBaMinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4Test {
    //    Nhập xuất danh sách các giao dịch.
    //     Tính tổng số lượng cho từng loại.
    //     Tính trung bình thành tiền của giao dịch tiền tệ.
    //     Xuất ra các giao dịch có đơn giá > 1 tỷ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GiaoDichVang> arrVang = new ArrayList<>();
        ArrayList<GiaoDichTienTe> arrTien = new ArrayList<>();
        int soDGV,soDGTT,tongDGVang=0,tongDGTT=0;
        double tongTienTe=0, tBTienTe=0, tongThanhTienVang=0;

        System.out.println("Nhap so DG vang:");
        soDGV=scanner.nextInt();
        System.out.println("Nhap so DG tien te:");
        soDGTT=scanner.nextInt();


        System.out.println("Nhap thong tin DG vang");
        for (int i = 1; i < soDGV; i++) {
            System.out.println("Nhap thong tin DG thu"+i);
            GiaoDichVang giaoDichVang = new GiaoDichVang();
            giaoDichVang.nhapGD();
            arrVang.add(giaoDichVang);
        }
        System.out.println("Nhap thong tin DG TT");

        for (int i = 1; i < soDGTT; i++) {
            System.out.println("Nhap thong tin DG thu"+i);
            GiaoDichTienTe giaoDichTienTe = new GiaoDichTienTe();
            giaoDichTienTe.nhapGD();
            arrTien.add(giaoDichTienTe);
        }

        //     Tính tổng số lượng cho từng loại.

        for (int i = 0; i < arrVang.size(); i++) {
            tongDGVang+=arrVang.get(i).getSoLuong();
        }
        System.out.println("Tong So luong Giao dich Vang la "+tongDGVang);

        for (int i = 0; i < arrTien.size(); i++) {
            tongDGTT+=arrTien.get(i).getSoLuong();

        }
        System.out.println("Tong So luong Giao dich TT la "+tongDGTT);

        //     Tính trung bình thành tiền của giao dịch tiền tệ.

        for (int i = 0; i < arrTien.size(); i++) {
            if (arrTien.get(i).getNumber()==1){
                tongTienTe += arrTien.get(i).getSoLuong()*arrTien.get(i).getDonGia()*arrTien.get(i).getTiGia();
                tBTienTe = tongTienTe/arrTien.get(i).getSoLuong();
            }else {
                tongTienTe += arrTien.get(i).getSoLuong()*arrTien.get(i).getDonGia();
                tBTienTe = tongTienTe/arrTien.get(i).getSoLuong();
            }
        }
        System.out.println("Tong thanh tien cua dg Tien te la: "+tongTienTe);
        System.out.println("TB thanh tien cua gd Tien te la "+tBTienTe);

        //Tong tien cua gido dich vang la:
        for (int i = 0; i < arrVang.size(); i++) {
            tongThanhTienVang+=arrVang.get(i).getSoLuong()*arrVang.get(i).getDonGia();
        }
        System.out.println("Tong thanh tien GD vang la : "+tongThanhTienVang);



        //    Nhập xuất danh sách các giao dịch.
        for (int i = 0; i < arrVang.size(); i++) {
            System.out.println("Dang sach giao dich Vang la"+arrVang.get(i).toString());
        }

        for (int i = 0; i < arrTien.size(); i++) {
            System.out.println("Dang sach giao dich Vang la"+arrTien.get(i).toString());
        }

    }
}
