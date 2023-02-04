package PhucDV.BaiTapNangCao;

import java.util.Scanner;

public class Bai52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng các căn nhà : ");
        String s = scanner.nextLine();
        int soLuong = Integer.parseInt(s);
        System.out.println("Nhập vào dãy số thể hiện địa chỉ của các căn nhà : ");
        String s1 = scanner.nextLine();
        String[] str = s1.split("\\s++");
        if (soLuong != str.length) {
            System.out.println("Nhập sai dữ liệu.");
        }else {
            int[] diaChi = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                diaChi[i] = Integer.parseInt(str[i]);
            }
            sort(diaChi);
            int min = diaChi[1] - diaChi[0];
            for (int i = 2; i < diaChi.length; i++) {
                int tmp = diaChi[1] - diaChi[0];
                if (min < tmp) {
                    min = tmp;
                }
            }
            System.out.println("Khoảng cách giữa 2 căn nhà gần nhau nhất là : " + min);
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
