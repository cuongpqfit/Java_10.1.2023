import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Đọc file sử dụng thư viện FileInputStream
public class FileInputStreamReader {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;


        System.out.print((char) 100);
        //Khởi tạo đối tượng fileInpurtStream truyền vào duong dan đến file muốn đoc
        try {
            fileInputStream = new FileInputStream("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//input.txt");
            //"/Users/vule/Documents/new/Java_10.1.2023/lesson_10/Vu/input.txt"
            int i = 0;
            byte[] b = new byte[3];
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }

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
