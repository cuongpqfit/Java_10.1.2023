import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao 1 chuoi: ");
        String str = sc.nextLine();
        System.out.println("chuoi chua luoc bo khoang trang: "+"\n" + str);
        System.out.println("chuoi da luoc bo khoang trang: " + "\n" + str.replaceAll("\\s\\s+", " ").trim());
    }
}
