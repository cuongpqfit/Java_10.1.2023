package lesson_11.PhucDV;

import java.io.*;
import java.util.*;

public class Bai113 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = new FileWriter("D:\\gitlab\\Java_10.1.2023\\lesson_11\\PhucDV\\palindrome.inp", false);
        BufferedWriter bw = new BufferedWriter(writer);
        System.out.println("Nhập số xâu cần kiểm tra: " );
        int n = scanner.nextInt();
        scanner.nextLine();
        bw.write("số xâu : " + n);
        bw.newLine();
        bw.flush();
        System.out.println("nhập xâu : ");
        for (int i = 0; i < n;  i++) {
            System.out.println("xâu " + (i + 1)+ " : ");
            String tmp = scanner.nextLine();
            bw.write(tmp);
            bw.newLine();
            bw.flush();
        }
        bw.close();

        FileReader fileReader = new FileReader("D:\\gitlab\\Java_10.1.2023\\lesson_11\\PhucDV\\palindrome.inp");
        BufferedReader bf = new BufferedReader(fileReader);
        FileWriter fileWriter1 = new FileWriter("D:\\gitlab\\Java_10.1.2023\\lesson_11\\PhucDV\\palodrome.out",false);
        BufferedWriter bw1 = new BufferedWriter(fileWriter1);
        String line = "";
        while ((line = bf.readLine()) != null){
            boolean check = true;
            Queue<Character> queue = new LinkedList<Character>();
            Stack<Character> stack = new Stack<Character>();
            char [] c = line.toCharArray();
            for (char value : c) {
                queue.add(value);
                stack.push(value);
            }
            for (int i = 0; i < c.length ; i++) {
                if(queue.poll() != stack.pop()){
                    check = false;
                    break;
                }
            }
          if(check){
              bw1.write("1");
              bw1.newLine();
              bw1.flush();
          }else{
              bw1.write("0");
              bw1.newLine();
              bw1.flush();
          }
        }
        bf.close();
        bw1.close();

    }
}
