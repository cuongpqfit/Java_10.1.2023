import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập vào chuỗi  : ");
                String str = scanner.nextLine();
        str=str.replaceAll("\\s\\s+", " ").trim();
        System.out.println(str);

    }
}
