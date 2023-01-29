package Thaontt;

import java.util.Scanner;

public class BaiTap11 {
    public static void main(String[] args) {
        //11. Nhập vào một số tự nhiên n, in ra màn hình tam giác cân rỗng có chiều cao là n được tạo thành từ những dấu *, có sử dụng vòng lặp.
        System.out.print("nhap so nguyen : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2*n-1); j++) {
                if (i==n || j== n + 1 -i || j == n - 1 +i ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println();

    }
}
