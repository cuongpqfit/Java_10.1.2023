import java.util.Scanner;

public class BaiTap05 {
    //Bài 5. Đổi tất cả các kí tự trong chuỗi sang chữ in hoa
    public static String readString() {
        System.out.println("Nhap chuoi ky tu : ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        return a;
    }
    public static void main (String[] args){
        String chuoi = readString();
        System.out.println("Chuoi ky tu chu in hoa :[" + chuoi.toUpperCase()+"]");
    }
}