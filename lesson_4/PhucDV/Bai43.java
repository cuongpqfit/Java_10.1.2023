package PhucDV;

import java.util.Scanner;


public class Bai43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi s1 : ");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi s2 : ");
        String s2 = scanner.nextLine();
        s1 = s1.concat(s2);
        System.out.println(s1.trim());
    }
}
