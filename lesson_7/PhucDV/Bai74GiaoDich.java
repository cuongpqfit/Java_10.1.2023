package PhucDV;

import java.util.*;

public class Bai74GiaoDich {
    public static void main(String[] args) {

        List<GiaoDichVang> listGiaoDichVang = new ArrayList<>();
        List<GiaoDichTienTe> listGiaoDichTienTe = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String s,s1;

//        Nhập giao dịch vàng

        do {
            System.out.println("Nhập giao dịch vàng.");
            System.out.println("Nhập mã giao dịch : ");
            int maGiaoDich = scanner.nextInt();
            System.out.println("Ngày giao dịch.");
            System.out.println("Nhập ngày : ");
            int day = scanner.nextInt();
            System.out.println("Nhập tháng : ");
            int month = scanner.nextInt();
            System.out.println("Nhập năm : ");
            int year = scanner.nextInt();
            System.out.println("Nhập đơn giá : ");
            double donGia = scanner.nextDouble();
            System.out.println("Nhập số lượng : ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập loại vàng : ");
            String loaiVang = scanner.nextLine();

            GiaoDichVang giaoDichVang = new GiaoDichVang(maGiaoDich, setNgayNhap(year, month, day), donGia, soLuong, loaiVang);
            listGiaoDichVang.add(giaoDichVang);
            scanner.nextLine();
            System.out.println("Bạn có muốn nhập thêm giao dich vàng y/n???");
            s = scanner.nextLine();

        } while (Objects.equals(s, "y"));

//        Nhập giao dịch tiền tệ

        do {
            System.out.println("Nhập giao dịch tiền tệ.");
            System.out.println("Nhập mã giao dịch : ");
            int maGiaoDich = scanner.nextInt();
            System.out.println("Ngày giao dịch.");
            System.out.println("Nhập ngày : ");
            int day = scanner.nextInt();
            System.out.println("Nhập tháng : ");
            int month = scanner.nextInt();
            System.out.println("Nhập năm : ");
            int year = scanner.nextInt();
            System.out.println("Nhập đơn giá : ");
            double donGia = scanner.nextDouble();
            System.out.println("Nhập số lượng : ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập tỷ giá : ");
            double tyGia = scanner.nextDouble();
            System.out.println("Loại tiền tệ");
            System.out.println("1. VND \n 2. USD và EUR");
            int loaiTienTe = scanner.nextInt();

            GiaoDichTienTe giaoDichTienTe = new GiaoDichTienTe(maGiaoDich, setNgayNhap(year, month, day), donGia, soLuong, tyGia,loaiTienTe);
            listGiaoDichTienTe.add(giaoDichTienTe);
            System.out.println("Bạn có muốn nhập thêm giao dich tiền tệ y/n???");
            s1 = scanner.nextLine();

        } while (Objects.equals(s1, "y"));

        int sumSoLuongGiaoDichLuongVang = 0;
        for (GiaoDichVang giaoDichVang: listGiaoDichVang) {
            sumSoLuongGiaoDichLuongVang += giaoDichVang.getSoLuong();
            System.out.println(giaoDichVang);
        }

        int sumSoLuongGiaoDichTienTe = 0;
        double tongTien = 0;
        for (GiaoDichTienTe giaoDichTienTe: listGiaoDichTienTe) {
            System.out.println(giaoDichTienTe);
            sumSoLuongGiaoDichTienTe += giaoDichTienTe.getSoLuong();
            switch (giaoDichTienTe.getLoaiTienTe()){
                case 1:
                    tongTien += giaoDichTienTe.getDonGia()*giaoDichTienTe.getDonGia();
                case 2:
                    tongTien += giaoDichTienTe.getSoLuong()*giaoDichTienTe.getDonGia()*giaoDichTienTe.getTyGia();
            }
        }

        System.out.println("Tổng số lượng giao dịch vàng : " + sumSoLuongGiaoDichLuongVang);
        System.out.println("Tổng số lượng giao dịch tiền tệ : " + sumSoLuongGiaoDichTienTe);
        System.out.println("Trung bình thành tiền của giao dịch tiền tê : " + tongTien/sumSoLuongGiaoDichTienTe);

        System.out.println("giao dịch có đơn giá > 1 tỷ : " );
        for (GiaoDichVang giaoDichVang: listGiaoDichVang) {
            if(giaoDichVang.getDonGia()*giaoDichVang.getSoLuong() > 1000000000){
                System.out.println(giaoDichVang);
            }
        }
    }

    public static Date setNgayNhap(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }
}
