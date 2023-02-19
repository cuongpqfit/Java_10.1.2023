package PhucDV;

import java.io.*;
import java.util.Objects;

public class Bai101 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("D:\\gitlab\\Java_10.1.2023\\lesson_10\\PhucDV\\input.PhucDV");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        int count = 0;
        while ((line = br.readLine()) != null) {
            char c;
            for (int i = 0; i < line.length(); i++) {
                c = line.charAt(i);
                if(Character.isSpaceChar(c)){
                    count++;
                }
            }
        }
        br.close();
        FileWriter writer = new FileWriter("D:\\gitlab\\Java_10.1.2023\\lesson_10\\PhucDV\\output.PhucDV", false);
        BufferedWriter bf = new BufferedWriter(writer);
            bf.write("Khoảng trắng trong chuỗi là : " + count);
            bf.newLine();
            bf.flush();
        bf.close();
    }
}
