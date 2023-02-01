import java.util.*;

public class Bai2 {
    //loai bo nhung khoang trang
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Hay nhap chuoi ");
        String chuoi=sc.nextLine();
        
        chuoi = chuoi.replaceAll(" ", ""); //文字の間の半角スペースを空文字に変換
        System.out.println("chuoi moi la : " + chuoi + "");
    }
}
