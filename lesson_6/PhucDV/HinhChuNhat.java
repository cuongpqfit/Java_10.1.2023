package PhucDV;

public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;
    private float chuVi;
    private float dienTich;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat(float chieuDai, float chieuRong, float chuVi, float dienTich) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.chuVi = chuVi;
        this.dienTich = dienTich;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
    public float tinhChuVi(){
        this.chuVi = 2 * (chieuDai + chieuRong);
        return this.chuVi;
    }
    public float tinhDienTich(){
        this.dienTich = chieuDai * chieuRong;
        return this.dienTich;
    }

    public String toString() {
        return "HinhChuNhat : \n" +
                "chieuDai = " + chieuDai +
                ", chieuRong = " + chieuRong +
                ", chuVi = " + chuVi +
                ", dienTich = " + dienTich +
                '}';
    }
}
