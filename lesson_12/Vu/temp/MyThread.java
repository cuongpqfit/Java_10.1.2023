package lesson_12.Vu.temp;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class MyThread  implements Runnable {
    private String name;
    private int count = 0;
    private int sleep = 0;

    public MyThread(String name, int sleep){
        this.name = name;
        // this.count = count;
        this.sleep = sleep;

        }

    @Override
    public void run() {

    try {
        //Tạo đối tượng để nhận dữ liệu từ client
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        //Tạo đối tượng để gửi dữ liệu cho client
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        //Đọc dữ liệu từ client gửi lên và in ra console
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
        System.out.println("<--Client " + this.name + inputLine);
        //Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
        out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
        }
        Thread.sleep(this.sleep);

    } catch (InterruptedException e) {
        // TODO: handle exception
        e.printStackTrace();
    }catch (IllegalArgumentException e) {
        // TODO: handle exception
        e.printStackTrace();
    }

    }
}




    // FileWriter writer = new FileWriter("//Users//vule//Documents//new//Java_10.1.2023//lesson_11//Vu//number.txt",false);
    // BufferedWriter br = new BufferedWriter(writer);

    // br.write("so random khoang 1-500 : " + random.nextInt(num));
    // br.newLine();
    // br.flush();