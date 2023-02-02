package package1;

public class Quare {
    //THuoc tinh Private: biến instance
    private int chieuDai;

    public int chieuRong;

    //Kieu truy cập default
    int chieuCao;

    public Quare() {
    }

    //Phương thức Private
    private int dienTich() {
        return chieuDai*chieuDai;
    };

    //Get-Set không được đặt quyền truy cập là private
    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        if (chieuDai<0) return;

        //chieudai2 là biến local
        int chieudai2 = 10;

        chieudai2 = 12;

        this.chieuDai = chieuDai;
    }
}
