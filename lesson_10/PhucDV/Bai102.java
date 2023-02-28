package PhucDV;

import java.io.*;

public class Bai102 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("D:\\gitlab\\Java_10.1.2023\\lesson_10\\PhucDV\\input.PhucDV");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while ((line = br.readLine()) != null) {
            line = line.replaceAll("\\s++","");

            FileWriter writer = new FileWriter("D:\\gitlab\\Java_10.1.2023\\lesson_10\\PhucDV\\output.PhucDV", true);
            BufferedWriter bf = new BufferedWriter(writer);
            bf.write(line);
            bf.newLine();
            bf.flush();
            bf.close();
        }
        br.close();
    }
}
