package Thaontt;

import java.io.*;

public class BaiTap03 {
    /*
    Nhập vào hai chuỗi s1 và s2, nối chuỗi s2 vào s1. Xuất chuỗi s1 ra file
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Reader doc = new FileReader("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/INPUT03.TXT");
        BufferedReader docbff = new BufferedReader(doc);

//        String s1 = docbff.readLine();
//        String s2 = docbff.readLine();
//        String S = s1 + s2;
        StringBuilder chuoi = new StringBuilder();
        String a;
        while ((a = docbff.readLine()) != null){
            System.out.println(a);
            chuoi.append(a);
        }
        String chuoiNoi = chuoi.toString();

        FileWriter viet = new FileWriter("/Users/thanhthao/Java_10.1.2023/lesson_10/Thaontt/OUTPUT03.TXT", false);
        BufferedWriter vietbff = new BufferedWriter(viet);
        vietbff.write(chuoiNoi);
        vietbff.flush();
        vietbff.close();
    }
}
