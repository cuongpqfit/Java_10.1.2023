import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi : ");
        chuoi = scanner.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);

            if (Character.isSpace(kyTu)) {
                count++;
            }
        }
        System.out.println("Số khoảng trắng có trong chuỗi : " + count);

    }
}
