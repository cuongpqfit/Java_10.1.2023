import java.util.Scanner;

public class NguyenToSingle {
    public static void main(String[] args) {
        //Bạn hãy nhập vào một số N bất kỳ và kiểm tra xem N có phải số nguyên tố hay không?
        long lBeign = System.currentTimeMillis();

        int[] input = new int[1000000];
        int n = 900000;

        System.out.print("Mang input ");
        for (int i = 0; i<n; i++) {
            input[i] = i + 1;
            //System.out.print(i+1 + " ");
        }
        System.out.println();

        for (int j=2; j<n; j++) {
            boolean primeNumber = true;
            for (int i = 2; i < input[j]; i++) {
                if (input[j] % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                System.out.println("La so nguyen to: " + input[j]);
            }

        }

        long lEnd = System.currentTimeMillis();
        System.out.println("Thoi gian thuc hien: " + (lEnd - lBeign));
    }
}
