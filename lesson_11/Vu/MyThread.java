import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class MyThread  implements Runnable {
    private String name;
    private int count = 0;
    private int sleep = 0;
   
    public MyThread(String name, int count , int sleep){
        this.name = name;
        this.count = count;
        this.sleep = sleep;

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10 ; i ++){

            try {
                Random random = new Random();
                int num = random.nextInt(1, this.count);
                System.out.println(random.nextInt(num));

                Thread.sleep(this.sleep);
                
                // FileWriter writer = new FileWriter("//Users//vule//Documents//new//Java_10.1.2023//lesson_11//Vu//number.txt",false);
                // BufferedWriter br = new BufferedWriter(writer);

                // br.write("so random khoang 1-500 : " + random.nextInt(num));
                // br.newLine();
                // br.flush();


            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            
        }
        
    }

    

    
    
}
