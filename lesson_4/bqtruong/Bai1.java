package bqtruong;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args ){

        int dem = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String chuoi = scanner.nextLine();

        for (int i=0; i<chuoi.length(); i++){
            char kyTu = chuoi.charAt(i);

            if (Character.isSpace(kyTu)){
                dem++;
            }
        }

        System.out.println("So khoang trang trong chuoi la: " + dem );
    }
}
