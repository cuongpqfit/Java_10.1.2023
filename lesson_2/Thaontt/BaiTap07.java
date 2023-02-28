package Thaontt;

public class BaiTap07 {
    public static void main(String[] args) {
        //7. Bạn hãy viết chương trình tình tổng của 50 số chẵn bắt đầu từ 2.
        int sum = 0;
        for (int i = 2; i <= 50; i++) {
            if (i%2==0) {
                sum += i;
            }
        }
        System.out.println("tong cua 50 so chan bat dau tu 2 la : " + sum);
    }
}
