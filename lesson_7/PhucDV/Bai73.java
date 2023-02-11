package PhucDV;

import java.util.*;

public class Bai73 {
    public static void main(String[] args) {
        List<SachGiaoKhoa> listSachGiaoKhoa = new ArrayList<>();
        List<SachThamKhao> listSachThamKhao = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String s,s1;
        do {
            System.out.println("Nhập sách giáo khoa.");
            System.out.println("Nhập mã sách : ");
            String maSach = scanner.nextLine();
            System.out.println("Ngày nhập sách.");
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
            System.out.println("Nhập nhà xuất bản : ");
            String nhaXB = scanner.nextLine();
            System.out.println("Nhập tình trạng : ");
            String tinhTrang = scanner.nextLine();
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa(maSach, setNgayNhap(year, month, day), donGia, soLuong, nhaXB, tinhTrang);
            listSachGiaoKhoa.add(sachGiaoKhoa);
            System.out.println("Bạn có muốn nhập thêm sách giáo khoa y/n???");
            s = scanner.nextLine();

        } while (Objects.equals(s, "y"));

        do {
            System.out.println("Nhập sách tham khảo.");
            System.out.println("Nhập mã sách : ");
            String maSach = scanner.nextLine();
            System.out.println("Ngày nhập sách.");
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
            System.out.println("Nhập nhà xuất bản : ");
            String nhaXB = scanner.nextLine();
            System.out.println("Nhập thuế : ");
            double thue = scanner.nextDouble();
            SachThamKhao sachThamKhao = new SachThamKhao(maSach, setNgayNhap(year, month, day), donGia, soLuong, nhaXB, donGia*(thue/100));
            listSachThamKhao.add(sachThamKhao);
            scanner.nextLine();
            System.out.println("Bạn có muốn nhập thêm sách tham khảo y/n???");
            s1 = scanner.nextLine();

        } while (Objects.equals(s1, "y"));

        for (SachGiaoKhoa sachGiaoKhoa: listSachGiaoKhoa) {
            System.out.println(sachGiaoKhoa.toString());
        }
        for (SachThamKhao sachThamKhao: listSachThamKhao) {
            System.out.println(sachThamKhao.toString());
        }
        double tongTienSachGiaoKhoa = 0;
        for (SachGiaoKhoa sachGiaoKhoa: listSachGiaoKhoa) {
            if(Objects.equals(sachGiaoKhoa.getTinhTrang(), "moi")){
            tongTienSachGiaoKhoa += sachGiaoKhoa.getDonGia()*sachGiaoKhoa.getSoLuong();
            }if(Objects.equals(sachGiaoKhoa.getTinhTrang(), "cu")){
                tongTienSachGiaoKhoa += sachGiaoKhoa.getDonGia()*sachGiaoKhoa.getSoLuong()*0.5;
            }
        }

        System.out.println("Tổng tiền sách giáo khoa : " + tongTienSachGiaoKhoa);

        double tongTienSachThamKhao = 0;
        double trungBinhCong = 0;
        int tongSoLuong = 0;
        for (SachThamKhao sachThamKhao: listSachThamKhao) {
        tongTienSachThamKhao += sachThamKhao.getDonGia()*sachThamKhao.getSoLuong() + sachThamKhao.getThue()*sachThamKhao.getSoLuong();
        tongSoLuong += sachThamKhao.getSoLuong();
        }
        trungBinhCong = tongTienSachThamKhao/tongSoLuong;

        System.out.println("Tổng tiền sách tham khảo : " + tongTienSachThamKhao);
        System.out.println("trung bình cộng đơn giá của các sách tham khảo : " + trungBinhCong);

        System.out.println("Nhập tên nhà xuất bản muốn in ra: ");
        String str = scanner.nextLine();

        System.out.println("Các sách giáo khoa của nhà xuất bản " + str + " : ");
        for (SachGiaoKhoa sachGiaoKhoa: listSachGiaoKhoa) {
            if(sachGiaoKhoa.getNhaXB().equals(str)){
                System.out.println(sachGiaoKhoa);
            }
        }

    }
    public static Date setNgayNhap(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }
}
