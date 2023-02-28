package PhamBaMinh;

import java.util.Scanner;

public class Phanso {
    private int tuSo;
    private   int mauSo;

    public Phanso(){

    }
    public Phanso(int tuSo, int mauSo){
    this.tuSo = tuSo;
    this.mauSo = mauSo;

    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    //Nhap phan so:
    public void nhapPs(Scanner scanner) {
        int a;
        int b;

        do {
            System.out.println("Nhap vao tu so: ");
            a = scanner.nextInt();
            System.out.println("Nhap vao mau so: ");
            b = scanner.nextInt();
            if (b == 0) {
                System.out.println("Hay nhap lai");
            } else {
                tuSo = a;
                mauSo = b;
            }

        }while (b==0);
    }


    // tim USCLN:
   public int timUSCLN(int a, int b){
        if (b==0){
            return a;
        }else {
            return timUSCLN(b, a%b);
        }
    }
    //
    //toi gian phan so
    public void toiGianPhanSo(){
        int i = timUSCLN(this.tuSo,this.mauSo);
        this.setTuSo(this.tuSo / i);
        this.setMauSo(this.mauSo / i);
    }
    public void cong(Phanso ps1, Phanso ps2){
        int ts = ps1.getTuSo() * ps2.getMauSo() + ps1.getMauSo() * ps2.getTuSo();
        int ms = ps1.getMauSo()*ps2.getMauSo();
        Phanso tongPhanso = new Phanso(ts, ms);
        tongPhanso.toiGianPhanSo();
        System.out.println("Ket qua phep cong 2 phan so  la: "+tongPhanso.tuSo+"/"+ tongPhanso.mauSo);
    }
    public void tru(Phanso ps1, Phanso ps2){
        int ts = ps1.getTuSo() * ps2.getMauSo() - ps1.getMauSo() * ps2.getTuSo();
        int ms = ps1.getMauSo()*ps2.getMauSo();
        Phanso hieuPhanso = new Phanso(ts, ms);
        hieuPhanso.toiGianPhanSo();
        System.out.println("Ket qua phep tru 2 phan so la: "+hieuPhanso.tuSo+"/"+ hieuPhanso.mauSo);
    }
    public void nhan(Phanso ps1, Phanso ps2){
        int ts = ps1.getTuSo() *  ps2.getTuSo();
        int ms = ps1.getMauSo()*ps2.getMauSo();
        Phanso nhanPhanso = new Phanso(ts, ms);
        nhanPhanso.toiGianPhanSo();
        System.out.println("Ket qua phep nhan 2 phan so la: "+nhanPhanso.tuSo+"/"+ nhanPhanso.mauSo);
    }
    public void chia(Phanso ps1, Phanso ps2){
        int ts = ps1.getTuSo() *  ps2.getMauSo();
        int ms = ps1.getMauSo()*ps2.getTuSo();
        Phanso chiaPhanso = new Phanso(ts, ms);
        chiaPhanso.toiGianPhanSo();
        System.out.println("Ket qua phep chia  2 phan so la: "+chiaPhanso.tuSo+"/"+ chiaPhanso.mauSo);
    }

}
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Phanso ps1 = new Phanso();
        Phanso ps2 = new Phanso();
        Phanso ps3 = new Phanso();

        System.out.println("Nhap vao ps1:");
        ps1.nhapPs(scanner);
        System.out.println("Nhap vao ps2:");
        ps2.nhapPs(scanner);

        ps3.cong(ps1, ps2);
        ps3.tru(ps1, ps2);
        ps3.nhan(ps1, ps2);
        ps3.chia(ps1, ps2);

    }
}