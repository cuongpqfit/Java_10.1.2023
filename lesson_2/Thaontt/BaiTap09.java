package BaiTap;

import java.util.Scanner;

public class BaiTap09 {
    public static void main(String[] args) {
        //9. Bạn hãy viết chương trình tính n! (n!=1*2*3*...*n)
        System.out.print("nhap co so : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n==0) {
            System.out.println("giai thua cua 0 = 1");
        } else {
            int ketQua = 1;
            for (int i = 1; i <= n; i++) {
                ketQua *= i;
            }
            System.out.println("giai thua cua "+ n + " = " + ketQua);
        }
    }
}
