package PhamBaMinh;

public class Bai7 {
    public static void main(String[] args) {
        //Bạn hãy viết chương trình tình tổng của 50 số chẵn bắt đầu từ 2.
        int n = 100;
        int sum = 0;
        for (int i = 2; i <n ; i=i+2) {
            sum += i;

        }
        System.out.println("Tong cua 50 so chan bat dau tu 2 la: " + sum);
    }
}
