import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String []agrs) {

        // cach 1 : su dung BufferedReader
        try {
        File file = new File("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//docfile.txt");
            
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;

        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        //cach 2 : su dung FileReader
   
        try {
        File file1 = new File("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//docfile.txt");

        FileReader fr = new FileReader(file1);
    
        int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data + "-");
            }
            // 4.最後にファイルを閉じてリソースを開放する
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        //     // TODO: handle exception
        }

        // cach 3: su dung Scanner:
           // NOTE: neu da su dung nextLine() de input dòng đó 
           //rồi thì các lệnh tiếp theo sẽ đọc các dòng còn lai.

        try {
            File file2 = new File("//Users//vule//Documents//new//Java_10.1.2023//lesson_10//Vu//docfile.txt");
            Scanner  scn= new Scanner(file2);
            String dong1 = scn.nextLine();
            // String dong2 = scn.nextLine();

            System.out.println();
            System.out.println("--- Cach doc tung dong ---");
            System.out.println(dong1+" ");
            // System.out.println(dong2);
            // System.out.println("--- Da doc xong tung dong ---");
            // System.out.println();

            System.out.println("--- Bat dau doc tat ca cac dong ---");
            while(scn.hasNextLine()){
                System.out.println(scn.nextLine());

            }
            System.out.println("--- Da doc xong  tat ca cac dong ---");

            scn.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } 
        
    }
}
