import java.util.Scanner;

public class BaiTap04 {
    //Bài 4. Đổi tất cả các kí tự có trong chuỗi thành chữ thường.
    public static String readString() {
        System.out.println("Nhap chuoi ky tu : ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        return a;
    }
    public static void main (String[] args){
        String chuoi = readString();
        System.out.println("Chuoi ky tu chu thuong :[" + chuoi.toLowerCase() +"]");
    }
}