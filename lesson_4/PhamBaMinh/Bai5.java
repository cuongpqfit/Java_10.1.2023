import java.util.Scanner;

public class Bai5 {
    //Bài 5. Đổi tất cả các kí tự trong chuỗi sang chữ in hoa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi :");
        String str = scanner.nextLine();
        System.out.println("Chuoi sau khi sua:");
        System.out.println(str.toUpperCase());
    }
}
