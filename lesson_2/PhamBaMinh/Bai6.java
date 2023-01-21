package PhamBaMinh;

public class Bai6 {
    public static void main(String[] args) {
        //Bạn hãy viết chương trình tính tổng của 50 số 50, 49, 48, ..., 1.
        int sum = 0;
        for (int i = 50; i >= 0 ; i--) {
            sum += i;

        }
        System.out.println("Tong cua 50 so tu 50 den 1 la: " +sum);
    }
}
