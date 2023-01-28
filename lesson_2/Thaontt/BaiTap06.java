package BaiTap;

public class BaiTap06 {
    public static void main(String[] args) {
        // 6. Bạn hãy viết chương trình tính tổng của 50 số 50, 49, 48, ..., 1.
        int sum = 0;
        for (int i = 50; i >0; i--) {
            sum += i;
        }
        System.out.println("tong cua 50 so 50, 49, 48, ..., 1. la : "+sum);
    }
}
