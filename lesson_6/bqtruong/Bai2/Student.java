package bqtruong.Bai2;

public class Student {

    private int maSV;
    private String hoTen;
    private  float diemLT;
    private float diemTH;

    public  Student(){
    }
    public  Student (int maSV, String hoTen, float diemLT, float diemTH){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this. diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public int getMaSV() {
        return maSV;
    }
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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
    public float diemTB(){
        float diemTB = (( diemLT + diemTH ) / 2);
        return diemTB;
    }
    public String toString (){
        return maSV + " "+hoTen+" "+ diemLT+" "+diemTH+" "+diemTB();
    }
    public void show(){
        System.out.printf("| "+"%06d"+" | "+"%-15s"+"|"+"%6.0f"+" |"+"%7.0f"+" |"+"%7.1f"+" |",getMaSV(),getHoTen(),getDiemLT(),getDiemTH(),diemTB());
        System.out.println();

    }
}
