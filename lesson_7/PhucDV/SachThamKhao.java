package PhucDV;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SachThamKhao extends Sach{
    private double thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXB, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXB);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(super.getDonGia());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str2 = simpleDateFormat.format(super.getNgayNhap());

        return "Sach Tham Khảo {" +
                "maSach = '" + super.getMaSach() + '\'' +
                ", ngayNhap = " + str2 +
                ", donGia = " + str1 +
                ", soLuong = " + super.getSoLuong() +
                ", nhaXB = '" + super.getNhaXB() + '\'' +
                ", thuế = '" + thue + '\'' +
                '}';
    }
}