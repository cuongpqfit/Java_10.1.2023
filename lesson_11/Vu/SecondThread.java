import java.io.FileInputStream;
import java.util.Scanner;

public class SecondThread  implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub

        FileInputStream fileInput = null;

        try {
            fileInput =new FileInputStream("//Users//vule//Documents//new//Java_10.1.2023//lesson_11//Vu//number1.txt");
            
            Scanner scn = new Scanner(fileInput);
            String a = scn.nextLine();
            scn.close();
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //in ra noi dung trong file vua doc vao
            System.out.println(a);
            
        }  catch (Exception e){
            e.printStackTrace();

        }

            
    }
    
}
