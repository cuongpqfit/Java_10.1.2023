package lesson_12.PhucDV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Locale;

public class SocketServerService extends Thread {

    private Socket Socket = null;

    private int sleep = 1000;

    public SocketServerService(Socket serverSocket){
        this.Socket = serverSocket;
    }

    @Override
    public void run() {
        try {
            //Tạo đối tượng để nhận dữ liệu từ client
            BufferedReader in = new BufferedReader(new InputStreamReader(Socket.getInputStream()));

            //Tạo đối tượng để gửi dữ liệu cho client
            PrintWriter out = new PrintWriter(Socket.getOutputStream(), true);

            //Đọc dữ liệu từ client gửi lên và in ra console
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("<--Client: " + inputLine);
                //Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
                out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
            }
            Thread.sleep(this.sleep);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
