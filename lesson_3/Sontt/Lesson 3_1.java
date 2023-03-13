import java.util.Scanner;

public class Lesson3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, min, max;
        System.out.println("hay nhap phan tu mang: ");
        n = sc.nextInt();
        int[] arrs = new int[n];
        max = arrs[0];
        min = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(min);
        for (int i = 0; i < n; i++) {
            System.out.print("hay nhap so thu " + (i + 1) + ": ");
            arrs[i] = sc.nextInt();
            if (max < arrs[i]) {
                max = arrs[i];
            }
            if (min > arrs[i]) {
                min = arrs[i];
            }
        }
        System.out.println("gia tri max la: " + max);
        System.out.println("gia tri min la: " + min);
    }
}
