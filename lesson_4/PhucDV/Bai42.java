package PhucDV;

import java.util.Scanner;

public class Bai42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi : ");
        String str = scanner.nextLine();
        String [] strTmp = str.split("\\s++");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strTmp) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
