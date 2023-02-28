package PhamBaMinh;

import java.io.*;

public class Bai1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\Java_10.1.2023\\lesson_10\\Test.txt");
            fileOutputStream = new FileOutputStream("output.txt");
            BufferedInputStream bin = new BufferedInputStream(fileInputStream,10);
            BufferedOutputStream bou = new BufferedOutputStream(fileOutputStream);
            int k;
            int count = 0;
            while ((k=bin.read())!=-1){
                char test = (char)k;
                if (test ==' '){
                    count++;
                }
            }
            System.out.println("So khoang trang la:"+count);
            String s = String.valueOf(count);
            String s1 = "So khoang trang la:";
            fileOutputStream.write(s1.getBytes());
            fileOutputStream.write(s.getBytes());

            fileInputStream.close();
            fileOutputStream.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
