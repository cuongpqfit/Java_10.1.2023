package BaiTap;

public class BaiTap03 {
    public static void main(String[]args){
        //3. In ra các số từ 1 đến 100 mà chia hết cho 3.
        System.out.println("cac chu so duoi 100 chia het cho 3 la : " );
        for (int i = 1; i <= 100; i++) {
            if (i%3==0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }
}
