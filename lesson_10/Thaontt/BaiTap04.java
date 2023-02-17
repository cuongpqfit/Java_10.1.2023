package Thaontt;

import java.io.*;

public class BaiTap04 {
    //Đổi tất cả các kí tự có trong chuỗi thành chữ thường.
//    String chuoi = readString();
//        System.out.println("Chuoi ky tu chu thuong :[" + chuoi.toLowerCase() +"]");
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Reader doc = new FileReader("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/INPUT04.TXT");
        BufferedReader docbff = new BufferedReader(doc);

        String a = docbff.readLine().toLowerCase();

        FileWriter viet = new FileWriter("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/OUTPUT04.TXT", false);
        BufferedWriter vietbff = new BufferedWriter(viet);
        vietbff.write(a);
        vietbff.flush();
        vietbff.close();
    }
}
