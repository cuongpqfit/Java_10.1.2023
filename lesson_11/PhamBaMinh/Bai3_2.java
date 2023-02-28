package PhamBaMinh;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bai3_2 {
    static boolean kiemTraDoiXung(String s){
        Stack stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String daoNguoc="";
        while (!stack.isEmpty()){
            daoNguoc = daoNguoc + stack.pop();
        }
        if (daoNguoc.equals(s)){
            return  true;
        }
        return false;

    }
    public static void main(String[] args) throws IOException {
        Queue<String> queue = new LinkedList<>();
        Reader reader = new FileReader("D:\\Java_10.1.2023\\lesson_11\\PhamBaMinh\\palindrome.inp");
        BufferedReader bufferedReader = new BufferedReader(reader);
        PrintWriter printWriter = new PrintWriter("D:\\Java_10.1.2023\\lesson_11\\PhamBaMinh\\palindrome1.out");
        String line="";
        while ((line = bufferedReader.readLine())!=null){
            line =line;
            queue.add(line);
        }
        String s1 = queue.poll();
        String s2 = queue.poll();
        String s3 = queue.poll();

        if (kiemTraDoiXung(s1)) {
            printWriter.write("1"+"\n");
        }else {
            printWriter.write("0"+"\n");
        }
        printWriter.flush();
        if (kiemTraDoiXung(s2)) {
            printWriter.write("1"+"\n");
        }else {
            printWriter.write("0"+"\n");
        }
        printWriter.flush();
        if (kiemTraDoiXung(s3)) {
            printWriter.write("1"+"\n");
        }else {
            printWriter.write("0"+"\n");
        }
        printWriter.close();
        bufferedReader.close();




    }

}
