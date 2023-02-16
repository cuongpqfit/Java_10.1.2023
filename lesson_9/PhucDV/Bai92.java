package PhucDV;

import java.util.Scanner;

public class Bai92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[0];
        try {
            System.out.println("Nhập vào số phần tử mảng.");
            int n = scanner.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập phần tử arr" + "[" + i + "] : ");
                int a = scanner.nextInt();
                if (a == 100) throw new ArithmeticException("not valid");
                arr[i] = a;
            }
        } catch (ArithmeticException ex) {
            System.out.println("Mảng đã nhập: ");
            for (int i : arr) {
                System.out.print (i + " ");
            }
        }
    }
}
