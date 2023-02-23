package PhamBaMinh;

public class SachGiaoKhoa extends Sach{
    private String tinhTrang;
    private double thanhTien;
    private int number;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String tinhTrang, int number) {super();
        this.tinhTrang = tinhTrang;
        this.number = number;
       }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public String tinhTrangSach(int x) {
        switch (number) {
            case 0:
                tinhTrang = "cũ";
                break;
            case 1:
                tinhTrang = "mới";
                break;
            default:
                break;
        }
        return tinhTrang;
    }
    public void nhapSach() {
        super.nhapSach();
        System.out.print("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
        number = scanner.nextInt();
    }
    public String toString(){
    return super.toString()+"Tinh trang sach"+this. tinhTrangSach(number);
    }
  }
