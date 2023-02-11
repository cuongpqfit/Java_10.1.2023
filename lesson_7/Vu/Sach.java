import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;
import java.util.Locale;
    
public class Sach {
    int maSach;
    Date ngayNhap;
    double donGia;
    int soLuong;
    String nhaXuatBan;

    // Date ngayInput = new Date(maSach, soLuong, maSach)
    //     Calendar cal = Calendar.getInstance();
    //     cal.clear();
    //     cal.set(Calendar.YEAR, 2011);
    // cal.set(Calendar.MONTH, 1);
    // cal.set(Calendar.DATE, 1);
    // Date ngaynhap = cal.getTime();

    //setter & gettter

    // method thanhTien
    
    // contructor
    public Sach(int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }
    public int getMaSach() {
        return maSach;
    }
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }
    public Date getNgayNhap() {
        return ngayNhap;
    }
    public void setNgayNhap(Date ngayNhap) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str2 = df.format(ngayNhap);
        this.ngayNhap = ngayNhap;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    
    @Override
    public String toString() {
        Locale locale = new Locale.Builder().setLanguage("vi").setRegion("VN").build();
        NumberFormat numberFormat= NumberFormat.getCurrencyInstance(locale);
        String str1 = numberFormat.format(donGia);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str2 = df.format(ngayNhap);
        return "Sach [maSach=" + maSach + ", ngayNhap=" + str2 + ", donGia=" + str1 + ", soLuong=" + soLuong
                + ", nhaXuatBan=" + nhaXuatBan + "]";
    }
    public static void main(String [] agrs) {
        Sach sach1 = new Sach(1234, (2022,may,10), 50000, 10, "KD");
        
        System.out.println(sach1);
        
    }
  

}




//toString(){} 
// xay dung class SachGiaoKhoa

// //class sach tham khao
// public sachThamKhao exends Sach{
// double thue;
// thanhTien(){
// =soLuong*donGia +Thue
// }

//main class 
// public static void main (String [ ] agrs) {
// SachGiaoKhoa sgk1 = new SachGiaKhoa (int maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan,String tinhtrang);
// SachGiaoKhoa sgk2 = new SachGiaKhoa ();
// SachGiaoKhoa sgk3 = new SachGiaKhoa ();
// SachGiaoKhoa sgk1 = new SachGiaKhoa ();



// }
//     // Thực hiện các yêu cầu sau:
    //      Xây dựng các lớp với chức năng thừa kế(Lớp SÁCH GIÁO KHOA, SÁCH THAM KHẢO kế thừa từ lớp SÁCH).
    //      Nhập xuất danh sách các loại sách.
    //      Tính tổng thành tiền cho từng loại.
    //      Tính trung bình cộng đơn giá của các sách tham khảo.
    //      Xuất ra các sách giáo khoa của nhà xuất bản X.
    

