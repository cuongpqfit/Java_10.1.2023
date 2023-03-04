package PhamBaMinh;

import java.io.*;
import java.net.Socket;
import java.util.Locale;

public class ClientHandler implements Runnable {
    private SocketServerJava socketServerJava;
    private Socket clientSocket;
    private ClientInfo clientInfo;
    private String username;

    public ClientHandler(Socket socket, SocketServerJava socketServerJava) {
        this.clientSocket = socket;
        this.socketServerJava = socketServerJava;
    }

    @Override
    public void run() {
        try {
            //Tạo đối tượng để nhận dữ liệu từ client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            //Tạo đối tượng để gửi dữ liệu cho client
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            ///user name.  neu dung


            boolean dangNhap = false;

            do {
                out.write("Moi ban nhap username");
                out.flush();
                username= in.readLine();
                if (username.isEmpty() || this.socketServerJava.getClients().containsKey(username)||!username.matches("^[a-zA-Z0-9]+$")){
                    out.println("TK khong dung");
                    out.flush();
                    dangNhap=true;

                }else {
                    out.println("Xin chao "+username);
                    out.flush();
                }
            } while (dangNhap);
            this.clientInfo = new ClientInfo(username,clientSocket, in, out);

            //Đọc dữ liệu từ client gửi lên và in ra console
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                //TODO: lưu lại dữ liệu người dùng nhập lên vào file tương ứng
                //Cầu trúc là:
                //Thư mục: History/[Người dùng]/fileluudulieuchat.txt

                System.out.println("<--Client: " + inputLine);
                //Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
                out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
                FileWriter fileWriter = new FileWriter("E:\\Java_10.1.2023\\lesson_14\\PhamBaMinh\\fileluudulieuchat.txt",true);
                fileWriter.write(inputLine);
                fileWriter.write("\n");
                fileWriter.flush();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
