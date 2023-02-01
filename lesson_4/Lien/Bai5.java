import java.util.Locale;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi  : ");
        String str = scanner.nextLine();
        str = str.toUpperCase();
        System.out.println(str);
    }
}
