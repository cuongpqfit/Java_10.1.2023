package PhucDV;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(super.getDonGia());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str2 = simpleDateFormat.format(super.getNgayGiaoDich());
        return "GiaoDich {" +
                "mã giao dịch = " + super.getMaGiaoDich() +
                ", ngày giao dịch = " + str2 +
                ", đơn giá = " + str1 +
                ", số lượng = " + super.getSoLuong() +
                ", Loại Vàng = " + loaiVang +
                '}';
    }
}
