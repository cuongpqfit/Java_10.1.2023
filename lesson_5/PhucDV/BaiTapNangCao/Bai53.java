package PhucDV.BaiTapNangCao;

import java.util.Scanner;

public class Bai53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng viên gạch : ");
        String s = scanner.nextLine();
        int soLuong = Integer.parseInt(s);
        System.out.println("Nhập vào dãy số thể hiện độ cứng lần lượt là : ");
        String s1 = scanner.nextLine();
        String[] str = s1.split("\\s++");
        if (soLuong != str.length) {
            System.out.println("Nhập sai dữ liệu.");
        } else {
            int[] doCung = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                doCung[i] = Integer.parseInt(str[i]);
            }
            sort(doCung);
            int max = doCung[0];
            for (int i = 1; i < doCung.length; i++) {
                if(max < doCung[i]){
                    max = doCung[i];
                }
            }
            System.out.println("Chiều cao cao nhất của chồng gạch là : " + max);
        }
    }
    public static void sort(int[] str){
        for (int i = 1; i < str.length; i++) {
            int j = i;
            while(j > 0 && str[j - 1] > str[j]){
                int tmp = str[j - 1];
                str[j - 1] = str[j];
                str[j] = tmp;
                j--;
            }
        }
    }
}
