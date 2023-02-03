package bqtruong;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Chuoi ban dau : " + chuoi);

        chuoi = chuoi.replaceAll("\\s", "");
        System.out.println("Chuoi sau khi da xoa khoang trang la:" +chuoi);

    }
}
