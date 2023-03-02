import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;
// package lesson_5.Vu;

public class PhanSo {

    private int tuSo;
    private int mauSo;
 
    //Ham khởi tạo không tham số
    PhanSo (){}

    //Hàm khởi tạo có 2 tham số
    PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    // Method input
    public void inputPhanSo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap tu so = ");
        tuSo = sc.nextInt();
        System.out.print("Hay nhap mau so =");
        mauSo =sc.nextInt();
        }
    // output phan so vua nhap
    public void showPhanSo(){
        System.out.print( tuSo +" / "  +mauSo);
    }
    //Output kêt quả phép cộng
    public void cong( PhanSo ps1, PhanSo ps2){
        int a;
        int  b;
        a = ps1.tuSo*ps2.mauSo + ps1.mauSo*ps2.tuSo;
        b = ps1.mauSo*ps2.mauSo;

        PhanSo ans = new PhanSo(a, b);
        System.out.print(" ket qua phep cong la ");
        ans.showPhanSo();
        System.out.println();

    }

    //Output kêt quả tru
    public void tru( PhanSo ps1, PhanSo ps2){
        int a;
        int  b;
        a = ps1.tuSo*ps2.mauSo - ps1.mauSo*ps2.tuSo;
        b = ps1.mauSo*ps2.mauSo;

        PhanSo ans = new PhanSo(a, b);
        System.out.print(" ket qua phep tru la ");
        ans.showPhanSo();
        System.out.println();

    }
 //Output kêt quả phép nhan
 public void nhan( PhanSo ps1, PhanSo ps2){
    int a;
    int  b;
    a = ps1.tuSo*ps2.tuSo;
    b = ps1.mauSo*ps2.mauSo;

    PhanSo ans = new PhanSo(a, b);
    System.out.print(" ket qua phep nhan la ");
    ans.showPhanSo();
    System.out.println();

 }
 //Output kêt quả phép chia
 public void chia( PhanSo ps1, PhanSo ps2){
    int a;
    int  b;
    a = ps1.tuSo*ps2.mauSo ;
    b = ps1.mauSo*ps2.tuSo;

    PhanSo ans = new PhanSo(a, b);
    System.out.print(" ket qua phep chia la ");
    ans.showPhanSo();
    System.out.println();

 }



 }




