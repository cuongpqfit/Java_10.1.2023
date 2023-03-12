import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao chuoi s1: ");
        String str1 = sc.nextLine();
        System.out.println("hay nhap vao chuoi s2: ");
        String str2 = sc.nextLine();
        System.out.println(str1.concat(str2));
    }
}
