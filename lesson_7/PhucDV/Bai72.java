package PhucDV;

import java.util.Scanner;

public class Bai72 {
    public static void main(String[] args) {
    HangThucPham tP = new HangThucPham();
        Scanner scanner = new Scanner(System.in);
        boolean checkMaHang;
        boolean checktenHang;
        boolean checkDonGia = false;
        boolean checkHSD = false;

        do {
            System.out.println("Nhập mã hàng : ");
            String maHang = scanner.nextLine();
            tP.setMaHang(maHang);
            checkMaHang = tP.checkMaHang();
        }while(!checkMaHang);
        do {
            System.out.println("Nhập tên hàng : ");
            String tenHang = scanner.nextLine();
            tP.setTenHang(tenHang);
            checktenHang = tP.checkTenHang();
        }while(!checktenHang);
        do {
            System.out.println("Nhập đơn giá : ");
            double donGia = scanner.nextDouble();
            if (donGia <= 0) {
                System.out.println("nhập sai.");
            } else {
                tP.setDonGia(donGia);
                checkDonGia = true;
            }
        }while (!checkDonGia);

        System.out.println("Nhập ngày sản xuất.");
        System.out.println("Nhập ngày : ");
        int day = scanner.nextInt();
        System.out.println("Nhập tháng : ");
        int month = scanner.nextInt();
        System.out.println("Nhập năm : ");
        int year = scanner.nextInt();
        tP.setNSX(year, month, day);

        do{
            System.out.println("Nhập hạn sử dụng.");
            System.out.println("Nhập ngày : ");
            int day1 = scanner.nextInt();
            System.out.println("Nhập tháng : ");
            int month1 = scanner.nextInt();
            System.out.println("Nhập năm : ");
            int year1 = scanner.nextInt();
            tP.setHSD(year1, month1, day1);
            if(tP.checkDate()) {
                checkHSD = true;
            }
        }while(!checkHSD);

        System.out.println(tP);

        tP.checkHanSuDung();
    }
}
