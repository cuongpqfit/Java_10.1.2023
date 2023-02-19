package Thaontt;

import java.io.*;
import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Reader doc = new FileReader("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/INPUT02.TXT");
        BufferedReader docbff = new BufferedReader(doc);

         String a = docbff.readLine().replaceAll("\\s", "");

        FileWriter viet = new FileWriter("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/OUTPUT02.TXT", false);
        BufferedWriter vietbff = new BufferedWriter(viet);
        vietbff.write(a);
        vietbff.flush();
        vietbff.close();
    }
}
