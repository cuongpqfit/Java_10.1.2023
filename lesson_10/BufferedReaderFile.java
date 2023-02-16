import java.io.*;

public class BufferedReaderFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Reader fr = new FileReader("D:\\Java_10.1.2023\\lesson_10\\example.inp");
        BufferedReader br = new BufferedReader(fr);
        //Cach 1
        int i = 0;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }

        //Cach 2
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.print(line);
        }

    }
}
