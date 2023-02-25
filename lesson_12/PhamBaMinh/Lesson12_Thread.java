package PhamBaMinh;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Locale;

public class Lesson12_Thread extends Thread{
    private Socket socket;

    public Lesson12_Thread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            while (true){
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("<--Client: " + inputLine);
                    //Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
                    out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
                }
            }

        }catch (Exception ex){
            ex.getMessage();
        }
    }
}
