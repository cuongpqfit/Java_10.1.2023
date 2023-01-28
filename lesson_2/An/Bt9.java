package An;

import java.util.Scanner;

public class Bt9 {

    public static void main(String[] args) {
        int n  ;
        long T  = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("In Put");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            T = T * i;
        }
        System.out.println("Giai Thừa của " + n + " là  : " + T );
    }
}
