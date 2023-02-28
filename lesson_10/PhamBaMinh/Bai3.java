package PhamBaMinh;

import java.io.*;

public class Bai3 {
    public static void main(String[] args) throws IOException {
        Reader reader= new FileReader("D:\\Java_10.1.2023\\lesson_10\\Test.txt");
        Reader reader1 = new FileReader("D:\\Java_10.1.2023\\lesson_10\\Test1.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedReader bufferedReader1 = new BufferedReader(reader1);

        String line="";
        while ((line=bufferedReader.readLine())!=null){
            FileWriter  fileWriter = new FileWriter("D:\\Java_10.1.2023\\lesson_10\\output3.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.flush();
            bufferedWriter.close();
        }
        bufferedReader.close();

        while ((line=bufferedReader1.readLine())!=null){
            FileWriter  fileWriter = new FileWriter("D:\\Java_10.1.2023\\lesson_10\\output3.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.flush();
            bufferedWriter.close();

        }
        bufferedReader1.close();

    }
}
