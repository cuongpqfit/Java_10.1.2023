import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Locale;

public class MyThread  implements Runnable {
    // private String name;
    private Socket socket = null;

    public MyThread(Socket s){
        this.socket = s;

        // this.name = name;
        // this.count = count;
        // this.sleep = sleep;
        }

    public void setSocket (Socket socket){
        this.socket = socket;

    }

    @Override
    public void run() {
      
        //Chấp nhận kết nối từ client

        try {
            //Tạo đối tượng để nhận dữ liệu từ client
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //Tạo đối tượng để gửi dữ liệu cho client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            //Đọc dữ liệu từ client gửi lên và in ra console
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
            System.out.println("<--Client " + inputLine);
            //Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
            out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
            }
            socket.close();
            Thread.sleep(1000);

        } catch (IOException  e) {
            // TODO: handle exception
            e.printStackTrace();
        // }catch (IllegalArgumentException e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        }catch (InterruptedException  e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        }
}




  