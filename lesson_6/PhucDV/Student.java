package PhucDV;

public class Student {
    private int maSV;
    private String tenSV;
    private float diemLT;
    private  float diemTH;

    public Student() {
    }

    public Student(int maSV, String tenSV, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhTB(){
        float diemTB;
        diemTB = (this.diemLT + this.diemTH) / 2;
        return diemTB;
    }
}
