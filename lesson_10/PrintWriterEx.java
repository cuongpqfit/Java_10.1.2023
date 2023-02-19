import java.io.*;

public class PrintWriterEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        PrintWriter writer = new PrintWriter("D:\\Java_10.1.2023\\lesson_10\\example.out1");
        PrintWriter writer2 = new PrintWriter("D:\\Java_10.1.2023\\lesson_10\\example.out2");

        writer.write("throws FileNotFoundException, IOException");
        writer.flush();
        writer2.write("throws FileNotFoundException, IOException 2");
        writer2.flush();


        writer.close();
        writer2.close();
    }
}
