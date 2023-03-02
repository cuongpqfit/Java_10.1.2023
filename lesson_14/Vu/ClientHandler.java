// package lesson_14.Vu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Locale;
import java.util.Scanner;

public class ClientHandler implements Runnable {
    private SocketServerJava socketServerJava;
    private Socket clientSocket;
    private ClientInfo clientInfo;
    private String username;
    Scanner sc = new Scanner(System.in);
    boolean flag;

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

            do {
                //TODO: Gủi y/c đến client phải nhập username giới hạn cho phep a..zA..Z0..9
                // do{
                String username = "\\w+";
                System.out.print("Input username (a-z,A-Z,0-9 ");
                String input = sc.next();
                flag = input.matches(username);
                if (!flag) System.out.println("Username khong phu hop");
                this.username = input;
                } while (!flag);
                System.out.print("username duoc chap nhan ");
                System.out.print("username server la  " + username);


                // //lưu vào biến username
            // } while (username.isEmpty() || this.socketServerJava.getClients().containsKey(username));
            // this.clientInfo = new ClientInfo(username,clientSocket, in, out);

            //Đọc dữ liệu từ client gửi lên và in ra console
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                //TODO: lưu lại dữ liệu người dùng nhập lên vào file tương ứng
                //Cầu trúc là:
                //Thư mục: History/[Người dùng]/fileluudulieuchat.txt
                FileWriter writer = new FileWriter("fileluudulieuchat.txt",true);
                BufferedWriter br = new BufferedWriter(writer);
                br.write("<--Client: " + inputLine);
                br.newLine();
                br.write("Server-->: " + inputLine.toUpperCase(Locale.ROOT));

                br.flush();
                System.out.println("<--Client: " + inputLine);
                //Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
                out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
                br.close();

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        // } catch (FileNotFoundException ex) {
        //     ex.printStackTrace();
        // }

        
        
    }
}
}
