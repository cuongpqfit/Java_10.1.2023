package PhamBaMinh;

import java.io.*;
import java.util.Random;

public class Bai1 {
    //Bài 1. Viết 1 chương trình  Java thực hiện công việc sau:
    //Ghi dữ liệu xuống file ”number.txt” với:
    //    - Dòng đầu tiên ghi 1 số ngẫu nhiên n (với 10 <= n <=100)
    //    - Mỗi dòng tiếp theo ghi 1 số nguyên dương ngẫu nhiên từ 1 đến 500
    public static void main(String[] args)  {
        try {
            PrintWriter writer = new PrintWriter("D:\\Java_10.1.2023\\lesson_11\\PhamBaMinh\\number.txt");
            Random random = new Random();
            int n = random.nextInt(10,101);
            writer.write("So ngau nhien n la:"+n+"\n");
            writer.flush();
            for (int i = 0; i <500; i++) {
                int m = random.nextInt(1,501);
                writer.write("So ngau nhien tiep theo la: "+m);
                writer.flush();
                writer.close();
            }

        }catch (Exception exception){
            System.out.println(exception);
        }
    }

}
