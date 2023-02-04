package cuongpq.bai1;

import package1.Quare;

public class Bai1 {
    public static void main(String[] args) {
        Phanso objPhanso1 = new Phanso();
        Phanso objPhanso2 = new Phanso();
        Phanso objPhanso3 = new Phanso();

        objPhanso1.nhap();
        objPhanso2.nhap();

        objPhanso3.cong(objPhanso1, objPhanso2);
        objPhanso3.tru(objPhanso1, objPhanso2);
    }
}
