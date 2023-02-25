package lesson_12.PhucDV;

import lesson_12.SocketServerJava;

import javax.print.attribute.standard.Severity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class SocketServerService implements Runnable {

    ServerSocket serverSocket = null;

    private int sleep = 1000;

    public SocketServerService(ServerSocket serverSocket){
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {

        //Chấp nhận kết nối từ client
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());
        //Tạo đối tượng để nhận dữ liệu từ client
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Tạo đối tượng để gửi dữ liệu cho client
        PrintWriter out = null;
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Đọc dữ liệu từ client gửi lên và in ra console
        String inputLine;
        while (true) {
            try {
                if ((inputLine = in.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("<--Client: " + inputLine);
            //Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
            out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
        }

        try {
            Thread.sleep(this.sleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
