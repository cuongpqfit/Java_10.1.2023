package Vu;

import java.util.*;

// public class Square {
//     private int width;
//     private int height;

//     public Square(int width, int height){
//         this.width = width;
//         this.height = height;
//     }

//     // public String toString(){
//     //     System.out.print("chieu rong la " +width);
//     // }

//     public void inform(){
//         System.out.print("chieu rong la " +width);
//         System.out.print("chieu dai la " +height);
//     }

//     public int tinhDienTich(){
//         return width*height;
//     }
class Square{
    // 幅
    private double width;
    // 高さ
    private double height;
    // コンストラクタ
    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // 情報出力メソッド
    public void inform() {
        System.out.println("この四角形の幅は" + width + "、高さは" +
                    height + "です。");
    }
    // 面積算出メソッド
    public double getArea() {
        return width * height;
    }
    // 幅増加メソッド
    public void addWidth(double delta) {
        width += delta;
    }

}
