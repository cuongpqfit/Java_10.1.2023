package PhamBaMinh;

public class GiaoDichTienTe extends GiaoDich{
    private double tiGia;
    private int number;

    private String loaiTien;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(double tiGia, int number, String loaiTien) {
        this.tiGia = tiGia;
        this.number = number;
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }
    public String kieuTienTe(int x){
        switch (number){
            case 1:
                loaiTien = "USD"+"Euro";
                break;
            case 2:
                loaiTien = "VND";
                break;
            default:
                break;

        }
        return loaiTien;

    }
    public void nhapGD(int x){
        super.nhapGD();
        System.out.println("Ti gia");
        tiGia= scanner.nextDouble();
        System.out.println("Nhap loai tien te");
        number = scanner.nextInt();
    }

    public String toString(){
        return super.toString()+"tiGia"+this.tiGia+"Loai tien te"+this.kieuTienTe(number);
    }
}
