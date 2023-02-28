package Thaontt;

public class BaiTap05 {
    public static void main(String[] args){
        //5. Bạn hãy viết chương trình tính tổng của 50 số 1, 2, 3, ..., 50.
        System.out.println("tong so nguyen tu 1 den 50 la : ");
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
