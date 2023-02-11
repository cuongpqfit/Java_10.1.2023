package PhucDV;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date nSX;
    private Date hSD;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, double donGia, Date nSX, Date hSD) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.nSX = nSX;
        this.hSD = hSD;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getnSX() {
        return nSX;
    }

    public void setnSX(Date nSX) {
        this.nSX = nSX;
    }

    public Date gethSD() {
        return hSD;
    }

    public void sethSD(Date hSD) {
        this.hSD = hSD;
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(donGia);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str2 = simpleDateFormat.format(nSX);
        String str3 = simpleDateFormat.format(hSD);
        return "HangThucPham { " +
                "mã hàng = '" + maHang + '\'' +
                ", tên sản phầm = '" + tenHang + '\'' +
                ", đơn giá = " + str1 +
                ", NSX = " + str2 +
                ", HSD = " + str3 +
                '}';
    }

    public void setNSX(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nSX = calendar.getTime();
    }

    public void setHSD(int year, int month, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.hSD = calendar.getTime();
    }


    public boolean checkTenHang(){
        if(Objects.equals(this.getTenHang(), "") || this.getTenHang().isEmpty()){
            System.out.println("tên hàng không được để trống : ");
            System.out.println("vui lòng nhập lại.");
            return false;
        }
        return true;
    }

    public boolean checkMaHang(){
        if(Objects.equals(this.getMaHang(), "") || this.getMaHang().isEmpty()){
            System.out.println("mã hàng không được để trống : ");
            System.out.println("vui lòng nhập lại.");
            return false;
        }
        return true;
    }

    public boolean checkDate(){
        if(this.gethSD().compareTo(this.getnSX()) < 0){
            System.out.println("nhập sai ngày hết hạn.");
            return false;
        }
        return true;
    }

    public void checkHanSuDung(){
        Date today = new Date();
        if(this.gethSD().compareTo(today) > 0){
            System.out.println("sản phẩm còn hạn sử dụng.");
        }else{
            System.out.println("Sản phầm hết hạn sử dụng.");
        }
    }
}
