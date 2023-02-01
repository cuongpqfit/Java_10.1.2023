package Thaontt;

import java.util.Scanner;

public class BaiTap10 {
    public static void main(String[] args) {
        //10. Bạn hãy nhập vào một số N bất kỳ và kiểm tra xem N có phải số nguyên tố hay không?
        System.out.print("nhap so nguyen : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 2) {
            System.out.println(n + " khong phai la so nguyen to");
        }else{
            int demUocSo = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    demUocSo++;
                }
            }
            if (demUocSo >= 1) {
                System.out.println(n + " khong phai la so nguyen to");
            } else {
                System.out.println(n + " la so nguyen to");
            }
        }
    }
}
