import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;
import javax.swing.text.StyledEditorKit;

public class TestPhanSo{

    public static void main(String[]agrs) {
        Scanner sc = new Scanner(System.in);
    PhanSo objPhanso1 = new PhanSo();
    PhanSo objPhanso2 = new PhanSo();
    PhanSo objPhanso3 = new PhanSo();

        //nhap phanso
        System.out.println("---phan so thu 1---");
        System.out.println("hay nhap phan so thu 1");
        objPhanso1.inputPhanSo();
        System.out.println("---phan so thu 2---");
        System.out.println ("hay nhap phan so thu 2");
        objPhanso2.inputPhanSo();
     
        // cong phanso
        
        objPhanso3.cong(objPhanso1, objPhanso2);
        // System.out.println(" ket qua phep cong la ");
        // objPhanso3.showPhanSo();
        objPhanso3.tru(objPhanso1, objPhanso2);
        objPhanso3.nhan(objPhanso1, objPhanso2);
        objPhanso3.chia(objPhanso1, objPhanso2);

    }
}
