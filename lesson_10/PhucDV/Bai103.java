package PhucDV;

import java.io.*;

public class Bai103 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("D:\\gitlab\\Java_10.1.2023\\lesson_10\\PhucDV\\input.PhucDV");
        Reader fr1 = new FileReader("D:\\gitlab\\Java_10.1.2023\\lesson_10\\PhucDV\\intput103.PhucDV");
        BufferedReader br = new BufferedReader(fr);
        BufferedReader br1 = new BufferedReader(fr1);
        String line = "";
        while ((line = br.readLine()) != null) {
            FileWriter writer = new FileWriter("D:\\gitlab\\Java_10.1.2023\\lesson_10\\PhucDV\\output.PhucDV", true);
            BufferedWriter bf = new BufferedWriter(writer);
            bf.write(line);
            bf.newLine();
            bf.flush();
            bf.close();
        }
        br.close();

        while ((line = br1.readLine()) != null) {
            FileWriter writer = new FileWriter("D:\\gitlab\\Java_10.1.2023\\lesson_10\\PhucDV\\output.PhucDV", true);
            BufferedWriter bf = new BufferedWriter(writer);
            bf.write(line);
            bf.newLine();
            bf.flush();
            bf.close();
        }
        br1.close();
    }
}
