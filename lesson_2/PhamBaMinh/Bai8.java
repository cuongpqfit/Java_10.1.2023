package PhamBaMinh;

public class Bai8 {
    public static void main(String[] args) {
        //Bạn hãy viết chương trình tính tổng của 20 số 5, 10, 15, ..., 100.
        int sum = 0;
        for (int i = 5; i <= 100; i=i+5) {
            sum += i;
        }
        System.out.println("Tong cua 20 so 5, 10, 15, ..., 100 la:" + sum);
    }
}
