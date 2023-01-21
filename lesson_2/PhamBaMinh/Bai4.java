package PhamBaMinh;

public class Bai4 {
    public static void main(String[] args) {
        //In ra các số từ 99 đến 1 mà chia hết cho 7
        System.out.println("Cac so chia het cho 7 tu 99 den 1 la: ");
        for (int i = 99; i >=1 ; i--) {
            if (i%7==0){
                System.out.println(i);
            }

        }
    }
}
