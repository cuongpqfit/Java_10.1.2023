package PhucDV;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GiaoDichTienTe extends GiaoDich{
    private double tyGia;
    private int loaiTienTe;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, double tyGia, int loaiTienTe) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tyGia = tyGia;
        this.loaiTienTe = loaiTienTe;
    }

    public double getTyGia() {
        return tyGia;
    }

    public void setTyGia(double tyGia) {
        this.tyGia = tyGia;
    }

    public int getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(int loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
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
                ", tỷ giá = " + tyGia +
                '}';
    }
}

