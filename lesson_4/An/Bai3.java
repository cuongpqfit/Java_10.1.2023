import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Input String s1 : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Input String s2 : ");
        String s2 = sc.nextLine();
        s1 =s1.concat(s2);
        System.out.println(" --> " + s1);
    }
}
