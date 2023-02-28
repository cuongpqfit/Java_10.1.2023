package Thaontt;

public class BaiTap08 {
    public static void main(String[] args) {
        //8. Bạn hãy viết chương trình tính tổng của 20 số 5, 10, 15, ..., 100.
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i%5==0) {
                sum += i;
            }
        }
        System.out.println("tong cua 20 so 5, 10, 15, ..., 100. la : " + sum);
    }
}
