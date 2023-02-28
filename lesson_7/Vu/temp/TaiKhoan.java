import java.util.Scanner;

public class TaiKhoan{
        //thong tin 
        private long stk;
        private String name;
        private double soDuTaiKhoan;

        final private double LAISUAT = 0.035;
        final private double LEPHIGIAODICH = 10;

        Scanner scn = new Scanner(System.in);
        //contructor
        public TaiKhoan (){}
        public TaiKhoan (long stk, String name, double soDuTaiKhoan){
            this.stk = stk;
            this.name = name;
            this.soDuTaiKhoan = soDuTaiKhoan;
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
                if (soDuTaiKhoan <0) 
                System.out.print(" nhap lai tien di ban");
            }

        @Override
        public String toString() {
            return "TaiKhoan [stk=" + stk + ", name=" + name + ", soDuTaiKhoan=" + soDuTaiKhoan + "]";
        }

        public void napTien(){
        double soDuTaiKhoan = getMoney();
        System.out.print("ban muon nap bao nhieu tien  ");
        double tienNap = scn.nextDouble();
        soDuTaiKhoan = soDuTaiKhoan + tienNap;
        System.out.println("So tien trong tai khoan " + soDuTaiKhoan );

        }

        public double rutTien (double tienRut){
            System.out.print("muon rut bao nhieu tien ban ");
            double soDuTaiKhoan = getMoney();
    
            Scanner scn = new Scanner(System.in);
            tienRut = scn.nextDouble();
            if (tienRut > soDuTaiKhoan)
            System.out.println("So tien hien tai cua ban khong du de thuc hien giao dich nay ");
            else soDuTaiKhoan = soDuTaiKhoan - tienRut - LEPHIGIAODICH; 
            System.out.println("So tien hien tai " + soDuTaiKhoan );
               
            return soDuTaiKhoan;
            }
        public void daoHan (){
            double soDuTaiKhoan = getMoney();
            soDuTaiKhoan= soDuTaiKhoan + soDuTaiKhoan*LAISUAT;
            System.out.println("So tien hien tai " + soDuTaiKhoan );
            }
            
            public void chuyenKhoan(TaiKhoan tk1, TaiKhoan tk2){
            double a = tk1.getMoney();
            System.out.println("Nhap so tien muong chuyen tu tai khoan" + tk1.getName() + " den tai khoan " + tk2.getName());
            Scanner scn = new Scanner(System.in);
            double tienChuyenKhoan = scn.nextDouble() ;

            }

            public class TestBaiNganHang {
 
                public static void main (String [] args){
                    TaiKhoan tk1 = new TaiKhoan (100, "A", 200);
                    TaiKhoan tk2 = new TaiKhoan (200, "B", 300);
                    
                    System.out.println(tk1);
                    System.out.println(tk2);

                    tk1.rutTien(15);
            
                }
            }

    }

  
        

