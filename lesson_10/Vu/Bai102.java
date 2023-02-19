import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bai102 {
// Bài 2. Nhập vào một chuỗi, hãy loại bỏ những khoảng trắng thừa trong chuỗi.
    public static void main (String [] agrs){

        FileInputStream fileInput = null;

        int count=0;

        try {
            fileInput =new FileInputStream("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//input1.inp");
            
            Scanner scn = new Scanner(fileInput);
            String a = scn.nextLine();
            scn.close();

            //in ra noi dung trong file vua doc vao
            System.out.println(a);

            a = a.replaceAll(" ", ""); //文字の間の半角スペースを空文字に変換
            System.out.println("chuoi moi la : " + a + "");

            // xuat ra file output.txt

            PrintWriter writer = new PrintWriter("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//output2.opt");

            writer.write("chuoi moi sau khi bo khoang trang : " + a);
            writer.flush();

        } catch (FileNotFoundException ex) {
            /// TODO: handle exception

        } finally {
            try {
                fileInput.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        
    }
}
