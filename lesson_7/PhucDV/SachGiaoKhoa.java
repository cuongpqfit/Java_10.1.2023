package PhucDV;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SachGiaoKhoa extends Sach{
    private String tinhTrang;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXB, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXB);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(super.getDonGia());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str2 = simpleDateFormat.format(super.getNgayNhap());

        return "Sach Giao Khoa {" +
                "maSach = '" + super.getMaSach() + '\'' +
                ", ngayNhap = " + str2 +
                ", donGia = " + str1 +
                ", soLuong = " + super.getSoLuong() +
                ", nhaXB = '" + super.getNhaXB() + '\'' +
                ", tình trạng = '" + tinhTrang + '\'' +
                '}';
    }
}
