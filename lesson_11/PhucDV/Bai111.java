package lesson_11.PhucDV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Bai111 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int n = random.nextInt(91) + 10;
        FileWriter writer = new FileWriter("D:\\gitlab\\Java_10.1.2023\\lesson_11\\PhucDV\\number.txt", false);
        BufferedWriter br = new BufferedWriter(writer);
        br.write("n = " + n);
        br.newLine();
        br.flush();

        for (int i = 0; i <=n; i++) {
            int a = random.nextInt(500) + 1;
            br.write("số " + i + " : "+ a);
            br.newLine();
            br.flush();
        }
        writer.close();
    }
}