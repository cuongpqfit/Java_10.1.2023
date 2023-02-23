import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;

public class SocketServerJava {
    //Tạo mảng lưu các thread đang handler client
    //private List<Đối tượng thread> clients = new ArrayList<>();

    public static void main(String[] args) throws  IOException {
        //Tạo đối tượng Socket Server lắng nghe ở port 5000
        //Localhost -> localhost : 127.0.0.1
        //Lan IP: sử dụng ipconfig(Win) ifconfig(Mac/Linux): 192.168.xxx.xxx
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started at port " + 5000);

        //Chấp nhận kết nối từ client
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

        //Tạo đối tượng để nhận dữ liệu từ client
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        //Tạo đối tượng để gửi dữ liệu cho client
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        //Đọc dữ liệu từ client gửi lên và in ra console
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("<--Client: " + inputLine);
            //Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
            out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
        }
    }
}