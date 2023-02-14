package bqtruong.Bai1;

import java.util.Scanner;

public class PhanSo {
    private int tuSo,mauSo;

    public PhanSo(){

    }
    public PhanSo (int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public void inputPS(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu so : ");
        this.tuSo = scanner.nextInt();

        System.out.println("Nhap mau so : ");
        this.mauSo = scanner.nextInt();

    }

    public void congPS(PhanSo ps1, PhanSo ps2){
        int tuSo = (ps1.tuSo * ps2.mauSo) + (ps2.tuSo * ps1.mauSo);
        int mauSo = (ps1.mauSo * ps2.mauSo);
        System.out.println("Ket qua phep cong la : " + tuSo + "/" + mauSo);

    }
    public void truPs(PhanSo ps1, PhanSo ps2){
        int tuSo = (ps1.tuSo * ps2.mauSo) - (ps2.tuSo * ps1.mauSo);
        int mauSo = (ps1.mauSo * ps2.mauSo);

        PhanSo ans = new PhanSo(tuSo , mauSo);
        System.out.println("Ket qua phep tru la : " + tuSo + "/" + mauSo);

        ans.show();
    }
    public void nhan(PhanSo ps1, PhanSo ps2){
        int tuSo = (ps1.tuSo * ps2.tuSo);
        int mauSo = (ps1.mauSo * ps2.mauSo);
        System.out.println("Ket qua phep nhan la : " + tuSo + "/" + mauSo);

    }
    public void chia(PhanSo ps1, PhanSo ps2){
        int tuSo = (ps1.tuSo * ps2.mauSo);
        int mauSo = (ps1.mauSo * ps2.tuSo);
        System.out.println("Ket qua phep chia la : " + tuSo + "/" + mauSo);

    }
    public void show(){
        if (tuSo==0){
            System.out.println("Ket qua : " + 0 );
        }

    }

}
