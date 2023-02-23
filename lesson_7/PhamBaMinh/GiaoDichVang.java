package PhamBaMinh;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang() {
        super();
    }

    public GiaoDichVang(String loaiVang) {
        super();
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public String toString() {
        return super.toString()+"LoaiVang"+this.loaiVang;
    }
    public void nhapGD(){
        super.nhapGD();
        System.out.println("Nhap loai vang:");

        loaiVang = scanner.nextLine();
    }
}
