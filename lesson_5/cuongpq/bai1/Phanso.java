package cuongpq.bai1;

//Thuộc Tính: tuso, mauso.

import java.util.Scanner;

public class Phanso {
    private int tuSo;
    private int mauSo;

    //ko tham so khoi tao
    public Phanso() {}

    //co ko tham so khoi tao
    public Phanso(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Tu so");
        this.tuSo = scanner.nextInt();

        System.out.println("Nhap Mau so");
        this.mauSo = scanner.nextInt();
    }

    public void cong(Phanso ps1, Phanso ps2) {
        int tuSo = (ps1.tuSo* ps2.mauSo) + (ps2.tuSo* ps1.mauSo);
        int mauSo = (ps1.mauSo * ps2.mauSo);

        System.out.println("Ket qua cong: " + tuSo + "/" + mauSo);
    }
    public void tru(Phanso ps1, Phanso ps2) {
        int tuSo = (ps1.tuSo* ps2.mauSo) - (ps2.tuSo* ps1.mauSo);
        int mauSo = (ps1.mauSo * ps2.mauSo);

        Phanso ans = new Phanso(tuSo, mauSo);

        System.out.println("Ket qua tru: ");
        ans.show();
    }

    public void show() {
        if (tuSo == 0) {
            System.out.println("Ket qua: " + 0);
            return;
        }
        System.out.println("Ket qua: " + tuSo + "/" + mauSo);
    }
    //...
}
