import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Bai101r {
    /*ĐỌC TỪ FILE INPUT.TXT GHI KẾT QUẢ RA FILE OUTPUT.TXT
Bài 1. Đếm có bao nhiêu khoảng trắng trong chuỗi. */

    public static void main (String [] agrs){

        FileInputStream fileInput = null;

        int count=0;

        try {
            fileInput =new FileInputStream("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//input.txt");
            InputStreamReader in = new InputStreamReader(fileInput, "SJIS");
            // fileInputStream = new FileInputStream("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//input.txt");
            
            Scanner scn = new Scanner(in);
            String a = scn.nextLine();
            scn.close();

            //in ra noi dung trong file vua doc vao
            System.out.println(a);

            for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' ')
              count++;
            }
            // xuat ra file output.txt
            System.out.println("so khoang trang la " + count);

            PrintWriter writer = new PrintWriter("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//output1.txt");

            writer.write("so khoang trang la " + count);
            writer.flush();

        } catch (FileNotFoundException ex) {
            /// TODO: handle exception

        } catch (UnsupportedEncodingException ex){

        } finally {
            try {
                fileInput.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        
    }
}