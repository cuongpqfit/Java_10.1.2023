package PhamBaMinh;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    public static void main(String[] args) {
        ArrayList<SachGiaoKhoa> arrSGK = new ArrayList<>();
        ArrayList<SachThamKhao> arrSTK = new ArrayList<>();
        int soSGK, soSTK;
        double tongTienSGK = 0, tongTienSTK = 0, tBCongDonGiaSTK=0, tongDonGiaSGK=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so SGK:");
        soSGK = scanner.nextInt();
        System.out.println("Nhap so SGK:");
        soSTK = scanner.nextInt();

        System.out.println("Nhap thong tin SGK:");
        for (int i = 1; i < soSGK; i++) {
            System.out.println("Nhap thong tin sach thu " + i + ":");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapSach();
            arrSGK.add(sachGiaoKhoa);
        }
        System.out.println("Nhap thong tin STK:");
        for (int i = 1; i < soSTK; i++) {
            System.out.println("Nhap thong tin sach thu " + i + ":");
            SachThamKhao sachThamKhao = new SachThamKhao();
            sachThamKhao.nhapSach();
            arrSTK.add(sachThamKhao);
        }

        for (int i = 0; i < arrSGK.size(); i++) {
            if (arrSGK.get(i).getNumber() == 0) {
                tongTienSGK += arrSGK.get(i).getSoLuong() * arrSGK.get(i).getDonGia();
            } else {
                tongTienSGK += arrSGK.get(i).getSoLuong() * arrSGK.get(i).getDonGia() * 50 / 100;
            }

        }
        System.out.println("Tong tien sach GK la: " + tongTienSGK);
        for (int i = 0; i <arrSTK.size() ; i++) {
            tongTienSTK +=arrSTK.get(i).getSoLuong()*arrSTK.get(i).getDonGia()+arrSTK.get(i).getThue();
        }
        System.out.println("Tong tien sach TK la :"+tongTienSTK);
        for (int i = 0; i < arrSTK.size(); i++) {



        }
        System.out.println("Thong tin SGK la: ");
        for (int i = 0; i <arrSGK.size() ; i++) {
            System.out.println(arrSGK.get(i).toString());
        }
        System.out.println("Thong tin STK la: ");
        for (int i = 0; i <arrSTK.size(); i++) {
            System.out.println(arrSTK.get(i).toString());
        }
        for (int i = 0; i <arrSTK.size() ; i++) {
            tongDonGiaSGK += arrSGK.get(i).getDonGia();
            tBCongDonGiaSTK = tongDonGiaSGK/arrSGK.get(i).getSoLuong();
        }
        System.out.println("TB cong don gia cua STK la : "+tBCongDonGiaSTK);
        System.out.println("Cac SGK cua nha xuat Ban X la: ");
        for (int i = 0; i < arrSGK.size(); i++) {
            if (arrSGK.get(i).getNhaSX().equalsIgnoreCase("X")){
                System.out.println(arrSGK.get(i).toString());
            }

        }

    }


}
