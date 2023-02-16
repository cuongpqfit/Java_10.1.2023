import java.io.*;

public class BufferedWriteExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileWriter writer = new FileWriter("D:\\Java_10.1.2023\\lesson_10\\example.out", false);
        BufferedWriter br = new BufferedWriter(writer);

        for (int i=0; i<100; i++) {
            br.write(i + " Day la du lieu ghi vao file");
            br.newLine();
            br.flush();
        }
        br.close();
    }
}
