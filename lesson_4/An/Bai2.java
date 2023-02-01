import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Input String : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("*" + a + "*");
        a = a.trim();
        System.out.println("*" + a + "*");
    }
}
