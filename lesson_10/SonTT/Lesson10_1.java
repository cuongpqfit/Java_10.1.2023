import java.io.*;

public class Lesson10_1 {
    public static void main(String[] args) {
        FileInputStream fileInput = null;
        Writer writer = null;
        int count = 0;
        try {
            fileInput = new FileInputStream("H:\\Java lam lai\\BAIKHOA01-10\\Lesson10\\input.txt");
            writer = new FileWriter("H:\\Java lam lai\\BAIKHOA01-10\\Lesson10\\output.txt");
            BufferedInputStream bin = new BufferedInputStream(fileInput, 100);
            BufferedWriter bw = new BufferedWriter(writer);
            int i = 0;
            while ((i = bin.read()) != -1) {
                if ((char) i == 32) {
                    count++;
                }
            }
            fileInput.close();
            bw.write("co " + count + " khoang trang trong chuoi input.txt");
            bw.close();

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                fileInput.close();
            } catch (IOException e) {

            }
        }

    }
}
