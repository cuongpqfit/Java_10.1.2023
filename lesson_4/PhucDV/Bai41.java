package PhucDV;

import java.util.Scanner;

public class Bai41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi : ");
        String str = scanner.nextLine();
        int count = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(Character.isSpaceChar(c)){
                count++;
            }
        }
        System.out.print("Khoảng trắng trong chuỗi là : " + count);
    }
}
