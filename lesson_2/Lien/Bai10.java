import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("nhap so : ");
            int n = s.nextInt();
            if (isPrime(n)) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong la so nguyen to");
            }
        }

        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }


}
