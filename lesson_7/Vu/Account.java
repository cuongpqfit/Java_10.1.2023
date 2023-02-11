 import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account{
    //thong tin 
    private long stk;
    private String name;
    private double soDuTaiKhoan;
    //contructor
    Account (){
        this.soDuTaiKhoan = 50;
    };
    Account (long stk, String name, double soDuTaiKhoan){
    this.stk = stk;
    this.name = name;
    this.soDuTaiKhoan = soDuTaiKhoan;
    soDuTaiKhoan = 50;
    }
    //setter & getter
    public long getStk() {
        return stk;
    }
    public void setStk(long stk) {
        this.stk = stk;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMoney() {
        return soDuTaiKhoan;
    }
    public void setMoney(double soDuTaiKhoan) {
        this.soDuTaiKhoan = soDuTaiKhoan;
    }

    @Override
    public String toString() {
        Locale locale = new Locale.Builder().setLanguage("vi").setRegion("VN").build();
        NumberFormat numberFormat= NumberFormat.getCurrencyInstance(locale);
        String str1 = numberFormat.format(soDuTaiKhoan);
        return "Account [Tai Khoan :" + stk + ", name=" + name + ", soDuTaiKhoan=" + str1 + "]";
    }
    
    //extra 
        
    final private double LAISUAT = 0.035;
    final private float LEPHIGIAODICH = 10;
    Scanner scn = new Scanner(System.in);
    
    public  void napTien (){
    System.out.print("\n nhap so tien ban muon nap : ");    
    double tienNap = scn.nextDouble();
    soDuTaiKhoan = soDuTaiKhoan + tienNap;
    System.out.println("\n Giao dich thanh cong");    
    }

    public  void rutTien (){
        System.out.print("\n nhap so tien ban muon rut : ");    
        double tienRut = scn.nextDouble();
        if ( tienRut  > soDuTaiKhoan -LEPHIGIAODICH) {
            System.out.println(" So tien ban khong du de thuc hien giao dich");
            return ;
        } else soDuTaiKhoan = soDuTaiKhoan - tienRut -LEPHIGIAODICH;
        System.out.println("\n Giao dich thanh cong");    
        }

    public  void chuyenKhoan (Account tk1){
        System.out.print("\n nhap so tien ban muon chuyen khoan : ");    
        double tienChuyenKhoan = scn.nextDouble();
        if ( tienChuyenKhoan  > this.soDuTaiKhoan -LEPHIGIAODICH) {
            System.out.println(" So tien ban khong du de thuc hien giao dich");
            return ;
        } else {
            this.soDuTaiKhoan = this.soDuTaiKhoan - tienChuyenKhoan -LEPHIGIAODICH;
            tk1.soDuTaiKhoan = tk1.soDuTaiKhoan + tienChuyenKhoan;
            System.out.println("\n Giao dich thanh cong");    
        }    
    }
    public  void daoHan (){
        System.out.println("\n Tai khoan ban den ky dao han : ");    
        System.out.println(" Loi tuc = " + soDuTaiKhoan*LAISUAT);    
        soDuTaiKhoan = soDuTaiKhoan + soDuTaiKhoan*LAISUAT;
        }

    public static void main (String [] agrs){
        Account tk0 = new Account();
        Account tk1 = new Account(1234, "Nguyen Van A", 20000000);
        Account tk2 = new Account(12345, "Nguyen Van B", 10000000);

        System.out.print(tk0);
        
        System.out.print(tk1);
        tk1.napTien();
        System.out.print(tk1);

<<<<<<< HEAD
        tk2.rutTien();
        System.out.print(tk2);
        tk2.daoHan();
        System.out.print(tk2);
=======
         tk2.rutTien();
         System.out.print(tk2);
         tk2.daoHan();
         System.out.print(tk2);
>>>>>>> 34fe0a0652c7d4fc2ec74dbb340954f0eb25127a

        tk1.chuyenKhoan(tk2);
        System.out.println(tk1);
        System.out.println(tk2);
    }
}
    

 /*
 Bài 1. Ngân hàng ABC muốn lưu trữ thông tin của mỗi tài khoản như sau:
Mỗi tài khoản chứa các thông tin:
     Số tài khoản ( Kiểu long),
     Tên tài khoản (kiểu chuỗi),
     Số tiền trong tài khoản (kiểu double)
(a). Thiết kế lớp Account để lưu trữ các thông tin, lớp bao gồm các phương thức sau:
     Constructor: Có 2 constructor ( mặc định và đầy đủ tham số)
     Các phương thức get, set cho từng thuộc tính
     Phương thức toString để trả về chuỗi chứa toàn bộ thông tin tài khoản, yêu cầu định dạng tiền
    tệ.
(b). Thêm các thông tin sau vào lớp Account
     Hằng số lãi suất có giá trị khởi tạo 0.035
     Constructor có 2 đối số: số tài khoản, tên tài khoản. Constructor này sẽ khởi tạo số tiền mặc định
    là 50.
     Phương thức nạp tiền vào tài khoản: Lấy số tiền hiện tại trong tài khoản + số tiền nạp vào
     Phương thức rút tiền: Lấy số tiền hiện tại trong tài khoản – (số tiền muốn rút+phí rút tiền)
     Phương thức đáo hạn: Mỗi lần đến kỳ đáo hạn thì số tiền trong tài khoản = số tiền trong tài
    khoản + số tiền trong tài khoản * LAISUAT
     Phương thức chuyển khoản từ tài khoản này sang tài khoản khác
Chú ý: Mỗi thao tác phải kiểm tra số tiền nạp, rút, chuyển có hợp lệ hay không? (VD: tiền
nhập vào <0, tiền rút nhiều hơn tiền trong tài khoản thì thông báo không hợp lệ và yêu cầu nhập lại)
 */       

