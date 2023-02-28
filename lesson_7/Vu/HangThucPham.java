import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class HangThucPham {

private double maHang;
private String tenMonHang;
private double donGia;
private Date ngaySanXuat;
private Date ngayHetHan;

// SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

// public class Date{
//     private int day;
//     private int month;
//     private int year; 

//     Date(int day, int month, int year){
//         if (day >0 && day <=31) this.day = day;
//         if (month >0 && month <= 12) this.month = month;
//     this.year = year;
// }

// }

//     - Viết các phương thức setters/getters.

public double getMaHang() {
    return maHang;
}
public String getTenMatHang() {
    return tenMonHang;
}
public void setTenMonHang(String tenMonHang) {
    this.tenMonHang = tenMonHang;
}
public double getDonGia() {
    return donGia;
}
public void setDonGia(double donGia) {
    if ( donGia>0)
    this.donGia = donGia;
}
public Date getNgaySanXuat(Date ngaySanXuat) {
SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
ngaySanXuat = df.format();
    return ngaySanXuat;
}
public void setNgaySanXuat(Date ngaySanXuat) {
    if (ngayHetHan.before(ngaySanXuat))
    this.ngaySanXuat = ngaySanXuat;
}
public Date getNgayHetHan() {
    return ngayHetHan;
}
public void setNgayHetHan(Date ngayHetHan) {
    this.ngayHetHan = ngayHetHan;
}
final public void setMaHang(double maHang) {
    // if (maHang != null) {
    this.maHang = maHang;
}

public void checkNgayHetHan(Date ngayHetHan){
    Date currenDate = new Date();
    if ( ngayHetHan.before(currenDate))
    System.out.println("mat hang da het han");

}

public HangThucPham(){}

public HangThucPham(double maHang, String tenMonHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
    this.maHang = maHang;
    this.tenMonHang = tenMonHang;
    if (donGia >0) this.donGia = donGia;
    this.ngaySanXuat = ngaySanXuat;
    if (ngayHetHan.after(ngaySanXuat)) this.ngayHetHan = ngayHetHan;
}
@Override
public String toString() {
    return "HangThucPham [maHang=" + maHang + ", tenMonHang=" + tenMonHang + ", donGia=" + donGia + ", ngaySanXuat="
            + ngaySanXuat + ", ngayHetHan=" + ngayHetHan + "]";
}

// lop test 
public static void main(String [] agrs) {
    HangThucPham thucPham1 = new HangThucPham();
    thucPham1.setMaHang(123456);
    thucPham1.setDonGia(500000);
    thucPham1.setTenMonHang("Sua Ong Tho");
    thucPham1.setNgaySanXuat(22-2-2022);
    

    //  HangThucPham thucPham1 = new HangThucPham(123456, "Sua Ong Tho",500000, 2022,10,11, 2023,10,11);
 System.out.println(thucPham1);   
}    
 
}
// Ràng buộc chặt chẽ các ràng buộc trên các trường dữ liệu. Nếu dữ liệu không hợp lệ thì gán giá trị mặc định cho phép
// tương ứng của trường đó.
//     - Tạo 1 constructor có đầy đủ tham số, 1 constructor có tham số là mã hàng.
//     - Viết phương thức kiểm tra một hàng thực phẩm đã hết hạn chưa?
//     - Phương thức toString, trả về chuỗi chứa thông tin của hàng thực phẩm. Trong đó: Định dạng
//     đơn giá có phân cách hàng nghìn. Định dạng kiểu ngày là dd/MM/yyyy.
    

