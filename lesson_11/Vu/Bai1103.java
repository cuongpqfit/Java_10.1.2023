import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bai1103 {
    
    public static void readLine(File file){
        try {
            file = new File ("//Users//vule//Documents//new//Java_10.1.2023//lesson_11//Vu//palindrome.inp");
            Scanner scn = new Scanner (file);
            String dong1 = scn.nextLine();
            char [] chars = dong1.toCharArray();
            Character [] character = new Character[chars.length];
            for ( int i = 0; i < chars.length; i++ ){
                character[i] = Character.valueOf(chars[i]);
            }

            String kw = testPalindrom(character);
            scn.close();

            FileWriter writer = new FileWriter("//Users//vule//Documents//new//Java_10.1.2023//lesson_11//Vu//palindrome.out",false);
            BufferedWriter br = new BufferedWriter(writer);

            br.write(kw);
            br.newLine();
            br.flush();

            System.out.println(kw);


        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        } 

    }

    public static String testPalindrom (Character[] chars){
        String kw =null;
        Deque<Character> queue = new ArrayDeque<Character>();
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < chars.length ; i++){
            queue.add(chars[i]);
            stack.push(chars[i]);
        }
        if(queue.remove().equals(stack.pop())) {
            return  kw = "1";
            // System.out.println("1");
        }else {
            return  kw = "0";
            // System.out.println("0");
        }
    }

    public static void main(String[]agrs) {
        try {
            File file = new File ("//Users//vule//Documents//new//Java_10.1.2023//lesson_11//Vu//palindrome.inp");
            Scanner scn = new Scanner (file);
            // input va quet du lieu dong thu 1
            int dong1 = scn.nextInt();
            System.out.println(dong1);

            String dongtrang = scn.nextLine(); // vì dòng 1 đọc môĩ con số 
            //nên máy tính xem dấu xuống dòng tồn tại như 1 chuỗi 
            //nên ta dùng dòng này để máy tính bỏ qua dòng này

            for (int i = 0; i < dong1 ; i++){
                readLine(file);
            }

            // String dong2 = scn.nextLine();
            // // System.out.println(dong2);
            // char [] chars = dong2.toCharArray();
            // // for (char i : chars){
            // //     System.out.print(i+ " ");
            // // }
            // Character [] character = new Character[chars.length];
            // for ( int i = 0; i < chars.length; i++ ){
            //     character[i] = Character.valueOf(chars[i]);
            // }

            // String kw = testPalindrom(character);
            // scn.close();

            // FileWriter writer = new FileWriter("//Users//vule//Documents//new//Java_10.1.2023//lesson_11//Vu//palindrome.out",false);
            // BufferedWriter br = new BufferedWriter(writer);

            // br.write(kw);
            // br.newLine();
            // br.flush();

            // System.out.println(kw);


        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } 

        
    }
}

            // judgePalindrom(char1);

            // dong 1 nhap duoc so bao nhieu thi chay bao nhieu vong 

            // Deque<String> queue = new ArrayDeque<String>();
            // Deque<String> stack = new ArrayDeque<String>();

            // for (int i = 0; i < a.length ; i++){
            //     queue.add(a[i]);
            //     stack.push(a[i]);
            // }

            // System.out.println(queue);
            // System.out.print("=========");
            // System.out.println();

            // System.out.println(stack);
            // System.out.print("=========");

            // if(queue.remove().equals(stack.pop())) {
            //     System.out.println("Palindrom");
            // }else {
            //     System.out.println("Not Palindrom");
            // }
        // System.out.println(queue);
        // for(int i = 0; i < queue.size(); i++){
        //     if (queue.poll() != stack.poll() ){
        //         return ;
        //     } 
        // }

