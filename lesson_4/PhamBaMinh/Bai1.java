import java.util.Scanner;

public class Bai1 {
    //Bài 1. Đếm có bao nhiêu khoảng trắng trong chuỗi.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");
        String s ;
        char k;
        int cout=0;
        s=scanner.nextLine();
        for (int i = 0; i <s.length() ; i++) {
            k=s.charAt(i);
            if (k ==' '){
                cout++;
            }
        }
        System.out.println("So khoang trang la:"+cout);

    }

}
