package PhamBaMinh;

import java.io.*;
import java.util.Arrays;

public class BaI2 {
    //Bài 2. Nhập vào một chuỗi, hãy loại bỏ những khoảng trắng thừa trong chuỗi.
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("D:\\Java_10.1.2023\\lesson_10\\Test.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);

        String line ="";
        while ((line = bufferedReader.readLine())!=null){
            line = line.replaceAll("\\s+", " ").trim();
            PrintWriter writer = new PrintWriter("D:\\Java_10.1.2023\\lesson_10\\output2.txt");
            writer.write(line);
            writer.flush();
            writer.close();
        }
    }
}
