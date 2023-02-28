import java.util.Scanner;

public class Bai3 {
    public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào chuỗi S1 :  ");
            String S1  = scanner.nextLine();
            System.out.print("Nhập vào chuỗi S2 : ");
            String S2= scanner.nextLine();
            String S3 =  S1 + S2;
            System.out.println(S3);
        }
    }

