package An;

import java.util.Scanner;

public class Bt11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In put Height h : ");
        int h = sc.nextInt();
        for (int i = 1; i <= h ; i++) {
            for (int j = 0; j <= h - i ; j++) {
                System.out.println(" ");
            }
            for (int k = 1; k <= 2 * i - 1 ; k++) {
                if (k == 1 || k == 2 * i - 1 || i == h ) {
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println("");
        }
    }
}
