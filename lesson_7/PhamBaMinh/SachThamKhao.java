package PhamBaMinh;

public class SachThamKhao extends Sach{
    private double thue, thanhTien;

    public SachThamKhao() {
        super();
    }

    public SachThamKhao(double thue) {
        super();
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
    public void nhapSach(){
        super.nhapSach();
        System.out.println("Nhap thue");
        thue = scanner.nextDouble();
    }
    public String toString(){
        return super.toString()+"Thue"+this.thue;

    }
}
