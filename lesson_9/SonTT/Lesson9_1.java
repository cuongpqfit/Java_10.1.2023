import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        int NumA = 0;
        int NumB = 0;
        do {
            try {
                System.out.println("nhập vào số 2 số thực");
                System.out.print("số thực a là: ");
                NumA = sc.nextInt();
                System.out.print("số thực b là: ");
                NumB = sc.nextInt();
                a = true;
            } catch (InputMismatchException ex) {
                System.out.println("hãy nhập số thực");
                a = false;
                sc.nextLine();
            }
        } while (!a);
        try {
            System.out.println("Số a chia số B:  " + NumA / NumB);
        } catch (Exception ex) {
            System.out.println("số chia là không hợp lệ");
            System.exit(0);
        }
    }
}
