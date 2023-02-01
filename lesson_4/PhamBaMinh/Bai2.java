import java.util.Scanner;

public class Bai2 {
    //Bài 2. Nhập vào một chuỗi, hãy loại bỏ những khoảng trắng thừa trong chuỗi.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");
        String str;
        str= scanner.nextLine();
        System.out.println("Sau khi xoa khoang trang thua:");
        System.out.println(str.replaceAll("\\s+", " ").trim());

    }

}
