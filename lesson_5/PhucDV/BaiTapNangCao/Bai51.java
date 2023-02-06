package PhucDV.BaiTapNangCao;

import java.util.Scanner;

public class Bai51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bạn nam và số bạn nữ : ");
        String s1 = scanner.nextLine();
        System.out.println("Nhâp vào chiều cao các bạn nam : ");
        String s2 = scanner.nextLine();
        String[] str2 = s2.split("\\s++");
        int [] chieuCaoNam = new int[str2.length];
        for (int i = 0; i < str2.length; i++) {
            chieuCaoNam[i] = Integer.parseInt(str2[i]);
        }
        System.out.println("Nhâp vào chiều cao các bạn nữ : ");
        String s3 = scanner.nextLine();
        String[] str3 = s3.split("\\s++");
        int [] chieuCaoNu = new int[str3.length];
        for (int i = 0; i < str3.length; i++) {
            chieuCaoNu[i] = Integer.parseInt(str3[i]);
        }
        sort(chieuCaoNam);
        sort(chieuCaoNu);
        boolean check = false;
        int ketQua = 0;
        for (int i = 0; i < chieuCaoNam.length; i++) {
            for (int k : chieuCaoNu) {
                if (chieuCaoNam[i] > k){
                ketQua = chieuCaoNam.length - i;
                check = true;
                break;
                }
            }
            if(check){
                break;
            }
        }
        if(ketQua > chieuCaoNu.length){
            System.out.println("Số cặp khiêu vũ : " + chieuCaoNu.length);
        }else{
            System.out.println("Số cặp khiêu vũ : " + ketQua);
        }

    }
    public static void sort(int [] str){
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
