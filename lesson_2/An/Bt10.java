package An;

import java.util.Scanner;

public class Bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Put : ");
        int n = sc.nextInt();
        if (isPrimeNumber(n) ) {
            System.out.println(n + " ís Prime Number");
        } else {
            System.out.println(n + " ís not a Prime Number");
        }
    }

    public  static boolean isPrimeNumber(int n){
        if (n < 2) {
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