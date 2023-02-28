package PhucDV;

import java.util.Scanner;

public class Bai63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử : ");
        String s = scanner.nextLine();
        int soLuong = Integer.parseInt(s);

        System.out.println("Nhập vào dãy số : ");
        String s1 = scanner.nextLine();
        String[] str = s1.split("\\s++");
        int[] daySo = new int[str.length];
        if (soLuong != str.length) {
            System.out.println("Nhập sai dữ liệu.");
        } else {
            for (int i = 0; i < str.length; i++) {
                daySo[i] = Integer.parseInt(str[i]);
            }
        }
        long count = 0;
        for (int i = 0; i < daySo.length; i++) {
            for (int j = i+1; j < daySo.length; j++) {
                if (daySo[i] == daySo[j]) {
                    count++;
                }
            }
        }
        System.out.println("Số lượng các cặp bằng nhau : " + count);
    }
}
