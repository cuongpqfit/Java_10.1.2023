import java.util.Scanner;

public class BaiTap03 {
    //Bài 3. Nhập vào hai chuỗi s1 và s2, nối chuỗi s2 vào s1. Xuất chuỗi s1 ra mànhình
    public static String readString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chuoi 1 :");
        String a = in.nextLine();
        System.out.println("nhap chuoi 2 :");
        String b = in.nextLine();
        String c = a.concat(b);
        return c;
    }
    public static void main (String[]args){
        String chuoi = readString();
        System.out.println("Chuoi doc duoc : [" + chuoi + "]");
    }
}