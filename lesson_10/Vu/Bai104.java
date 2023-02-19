import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bai104 {
     /*Bài 3. Nhập vào hai chuỗi s1 và s2, nối chuỗi s2 vào s1. Xuất chuỗi s1 ra file
 */
    public static void main (String [] agrs){

        FileInputStream fileInput = null;
        FileInputStream fileInput2 = null;

        int count=0;

        try {
            fileInput =new FileInputStream("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//input.txt");
            
            // fileInputStream = new FileInputStream("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//input.txt");
            
            Scanner scn = new Scanner(fileInput);
            String a = scn.nextLine();
            scn.close();

            //in ra noi dung trong file vua doc vao
            System.out.println(a);

            // a = a.toUpperCase();

            // xuat ra file output.txt
            System.out.println("xu ly chu thuong --> HOA: " + a.toUpperCase() );

            PrintWriter writer = new PrintWriter("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//output4.txt");

            writer.write(a.toUpperCase());
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


