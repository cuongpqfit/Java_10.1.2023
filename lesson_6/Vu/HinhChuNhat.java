// package LeThanhThienVu;

import java.util.Scanner;
import java.util.Set;

public class HinhChuNhat{
    private int length; 
    private int width;

    public HinhChuNhat(){}
    public HinhChuNhat(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int  getLength(){
    return  length;
    }

    public int  getWidth(){
        return  width;
    }
    
    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    //input chieu dai, rong
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap chieu dai = ");    
        length = sc.nextInt();
        System.out.println("Hay nhap chieu rong = ");    
        width = sc.nextInt();
    }
    //method tinh dien tich
    public  int tinhDienTich(){
        int dienTich = length* width;
        // System.out.println(" Dien tich =" +dienTich);
        return dienTich;
        }
    //method tinh chu vi
        public int tinhChuVi(){
        int chuVi = (length +width) * 2;
        // System.out.println(" Chu vi =" + chuVi);
        return chuVi;
        }


    //method toString
    public String toString(){
        return  "Thong tin cua hinh chu nhat la" + "\nChieu dai = " + getLength() + "\nChieu rong = " + getWidth() +"\nDien tich la = " + tinhDienTich() + "\nChu vi la = " + tinhChuVi();


    }

}

