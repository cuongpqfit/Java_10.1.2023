import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bai105 {
// Bài 5. Đổi tất cả các kí tự trong chuỗi sang chữ in hoa
    public static void main (String [] agrs){

        FileInputStream fileInput = null;

        int count=0;

        try {
            fileInput =new FileInputStream("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//input5.fdsg");
            
            Scanner scn = new Scanner(fileInput);
            String a = scn.nextLine();
            scn.close();

            //in ra noi dung trong file vua doc vao
            System.out.println(a);

            a = a.toLowerCase();

            // xuat ra file output.txt
            System.out.println("XU LY CHU HOA --> thuong :" + a );

            PrintWriter writer = new PrintWriter("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//output5.txt");

            writer.write(a);
            writer.flush();

        } catch (FileNotFoundException ex) {
            /// TODO: handle exception
        }catch (NullPointerException ex){

        } finally {
            try {
                fileInput.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        
    }
}


