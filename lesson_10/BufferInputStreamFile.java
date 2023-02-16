import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStreamFile {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        //Khởi tạo đối tượng fileInpurtStream truyền vào duong dan đến file muốn đoc
        try {
            fileInputStream = new FileInputStream("D:\\Java_10.1.2023\\lesson_10\\example.inp");
            //Tạo ra bộ đệm khi đọc file cùng với kích thước bộ đêm
            BufferedInputStream bin = new BufferedInputStream(fileInputStream, 10000);

            int i = 0;
            byte[] b = new byte[3];
            while ((i = bin.read()) != -1) {
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
