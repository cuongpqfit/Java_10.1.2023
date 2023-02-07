package bqtruong.Bai1;

public class Test {
    public static  void main(String[] args){
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo ps3 = new PhanSo();

        ps1.inputPS();
        ps2.inputPS();

        ps3.congPS(ps1, ps2);
        ps3.truPs(ps1, ps2);
        ps3.nhan(ps1, ps2);
        ps3.chia(ps1, ps2);
    }
}
