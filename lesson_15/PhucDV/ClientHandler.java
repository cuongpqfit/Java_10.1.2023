package PhucDV;

import java.io.*;
import java.net.Socket;
import java.util.Locale;
import java.util.Scanner;

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
            out.println("Nhập vào user name : ");
            boolean check = false;
            do {
                //TODO: Gủi y/c đến client phải nhập username giới hạn cho phep a..zA..Z0..9
                username = in.readLine();
                System.out.println(username);
                for (int i = 0; i < username.length(); i++) {
                    char c = username.charAt(i);
                    if((c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')){
                        check = true;
                    }else{
                        check = false;
                        out.println("Vui lòng nhập lại tên user! ");
                        break;
                    }
                }
                //lưu vào biến username
            } while (!check || username.isEmpty() || this.socketServerJava.getClients().containsKey(username));
            this.clientInfo = new ClientInfo(username,clientSocket, in, out);

            //Đọc dữ liệu từ client gửi lên và in ra console
            out.println("nhập dữ liệu cần đọc : ");
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                //TODO: lưu lại dữ liệu người dùng nhập lên vào file tương ứng
                //Cầu trúc là:
                //Thư mục: History/[Người dùng]/fileluudulieuchat.txt

                FileWriter writer = new FileWriter("E:\\gitlab\\Java_10.1.2023\\lesson_14\\PhucDV\\History\\[Người dùng]\\fileluudulieuchat.txt", false);
                BufferedWriter br = new BufferedWriter(writer);

                br.write(inputLine);
                br.newLine();
                br.flush();

                br.close();

                System.out.println("<--Client: " + username);
                System.out.println("Data : " + inputLine);
                //Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
                out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
