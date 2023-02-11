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
        Account tk2 = new Account(12345, "Nguyen Van B", 100);

        System.out.print(tk0);
        
        System.out.print(tk1);
        tk1.napTien();
        System.out.print(tk1);

        // tk2.rutTien();
        // System.out.print(tk2);
        // tk2.daoHan();
        // System.out.print(tk2);

        // tk1.chuyenKhoan(tk2);
        // System.out.println(tk1);
        // System.out.println(tk2);
    }
}
    

        

