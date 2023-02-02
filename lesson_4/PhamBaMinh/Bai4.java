import java.util.Scanner;

public class Bai4 {
    //Bài 4. Đổi tất cả các kí tự có trong chuỗi thành chữ thường.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi :");
        String s1 = scanner.nextLine();
        System.out.println("Chuoi sau khi chinh sua:");
        System.out.println(s1.toLowerCase());
    }
}
