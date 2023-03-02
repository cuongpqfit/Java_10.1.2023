// package lesson_14.Vu;

import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        String ten = null;

        
        do {
            String usernamePattern = "\\w+";
            System.out.print("Input user name: ");
            String input = sc.next();
            flag = input.matches(usernamePattern);
            if (!flag) System.out.println("username khong hop le");
            ten = input;

        } while (!flag);

        System.out.println("Username duoc chap nhan");
        System.out.println(" username la :" + ten);

    }
}
