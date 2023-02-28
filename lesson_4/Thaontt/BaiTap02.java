import java.util.Scanner;

public class BaiTap02 {
    //Bài 2. Nhập vào một chuỗi, hãy loại bỏ những khoảng trắng thừa trong chuỗi.
    public static String readString() {
        System.out.println("Nhap chuoi ky tu : ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        return a;
    }
    public static void main (String[] args){
        String chuoi = readString();
        System.out.println("Chuoi ki tu doc duoc la : [" + chuoi + "]");
        chuoi = chuoi.replaceAll("\\s", "");
        System.out.println("Chuoi sau khi xoa khoang trang : [" + chuoi + "]");
    }
}