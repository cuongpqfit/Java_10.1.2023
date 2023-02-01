import java.util.Scanner;

public class BaiTap01 {
    //Bài 1. Đếm có bao nhiêu khoảng trắng trong chuỗi.
    public static String readString() {
        System.out.println("Nhap chuoi ky tu : ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        return a;
    }
    public static void main (String[] args){
        String chuoi = readString();
        System.out.println("Chuoi ki tu doc duoc la : [" + chuoi + "]");
        int count=0;
        char kyTu = ' ';
        for (int i = 0; i < chuoi.length(); i++) {
            if(chuoi.charAt(i)== kyTu){
                count++;
            }
        }
        System.out.println("khoang trang trong chuoi = "+ count);
    }
}