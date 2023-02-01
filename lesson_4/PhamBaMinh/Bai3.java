import java.util.Scanner;

public class Bai3 {
    //Bài 3. Nhập vào hai chuỗi s1 và s2, nối chuỗi s2 vào s1. Xuất chuỗi s1 ra mànhìn
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi s1:");
        String s1 = scanner.nextLine();
        System.out.println("Nhap vao chuoi s2:");
        String s2 = scanner.nextLine();
        s1=s1.concat(s2);
        System.out.println("Chuoi sau khi ghep:"+s1);

    }
}
