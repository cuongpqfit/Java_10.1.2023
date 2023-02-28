package PhamBaMinh;

import java.io.*;

public class Bai5 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("D:\\Java_10.1.2023\\lesson_10\\Test.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line="";
        while ((line= bufferedReader.readLine())!=null){
            line = line.toUpperCase();
            PrintWriter printWriter = new PrintWriter("D:\\Java_10.1.2023\\lesson_10\\output5.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(printWriter);
            bufferedWriter.write(line);
            bufferedWriter.flush();;
            bufferedWriter.close();

        }
        bufferedReader.close();
    }
}
