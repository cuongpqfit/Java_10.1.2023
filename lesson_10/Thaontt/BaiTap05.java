package Thaontt;

import java.io.*;

public class BaiTap05 {
    //Đổi tất cả các kí tự trong chuỗi sang chữ in hoa
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Reader doc = new FileReader("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/INPUT05.TXT");
        BufferedReader docbff = new BufferedReader(doc);

        String a = docbff.readLine().toUpperCase();

        FileWriter viet = new FileWriter("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/OUTPUT05.TXT", false);
        BufferedWriter vietbff = new BufferedWriter(viet);
        vietbff.write(a);
        vietbff.flush();
        vietbff.close();
    }
}
