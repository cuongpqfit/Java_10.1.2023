package BaiTap;

public class BaiTap04 {
    public static void main(String[] args){
        //4. In ra các số từ 99 đến 1 mà chia hết cho 7.
        System.out.println("cac so tu 99 den 1 chia het cho 7 : ");
        for (int i = 1; i < 99; i++) {
            if (i%7==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
