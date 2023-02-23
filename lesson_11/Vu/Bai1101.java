import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Bai1101 {
    
    
    public static void main(String[]agrs)throws Exception {
        

        try {
            // MyThread td1 = new MyThread("thread 1", 1000);
            // MyThread td1 = new MyThread("so random 1-10 : ",10, 1000);
            // Thread thread1 = new Thread(td1);   

            Random random = new Random();
            int i = random.nextInt(0, 10);
            System.out.println("so random khoang 1-10 : " + i);

            MyThread td2 = new MyThread("so ramdom 1-500 : ",500, 200);
            Thread thread2 = new Thread(td2);   


            // MyThread td2 = new MyThread(500, 100);
            // Thread thread2 = new Thread(td2);   
            // thread1.start();
            // thread2.start();

            FileWriter writer = new FileWriter("//Users//vule//Documents//new//Java_10.1.2023//lesson_11//Vu//number.txt",false);
            BufferedWriter br = new BufferedWriter(writer);

            br.write("so random khoang 1-10 : " + i);
            br.newLine();

            // write ra thread2 
            for (int j = 0; j < 10 ; j ++){
                i = random.nextInt(0, 500);
                System.out.println("so random khoang 1-500 : " + i);
                br.write("so random khoang 1-500 : " + i);
                br.newLine();
                br.flush();

            }

            br.flush();
            br.close();
            
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();

        }

        
    }
}
