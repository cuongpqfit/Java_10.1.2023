import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DocFile {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        System.out.print((char) 100);

        try {
            fileInputStream = new FileInputStream("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//input.txt");
            // fileInputStream = new FileInputStream("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/INPUT01.TXT");
            
            Scanner scanner = new Scanner(fileInputStream);
            String a = scanner.nextLine();
            scanner.close();

            int count = 0;
            char kyTu = ' ';
            //String a = String.valueOf(fileInputStream.read());

                for (int i = 0; i < a.length(); i++) {
                    if(a.charAt(i) == ' ' ) {
                        count++;
                    }
                }
            System.out.println("count : "+count);
            System.out.println("a = "+a);

            PrintWriter writer = new PrintWriter("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/OUTPUT01.TXT");
            writer.write("So khoang trang : "+ count);
            writer.flush();
            writer.close();
            fileInputStream.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


