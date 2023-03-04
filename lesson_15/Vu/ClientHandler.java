import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
            // Tạo đối tượng để nhận dữ liệu từ client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Tạo đối tượng để gửi dữ liệu cho client
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            boolean flag;

            do {
                // Gửi yêu cầu đến client;
                out.println("Input username (a-z,A-Z,0-9) ");
                String check = "\\w+";
                username = in.readLine();
                flag = username.matches(check);
                if (!flag)
                    out.println("Username -- sai roi do nhap lai di");

            } while (!flag);
            out.println("Username duoc chap nhan ");
            System.out.println("Username duoc chap nhan --" + username);
            System.out.println("Username: " + username);
            // TODO: kiểm tra username tên người dùng có trong phạm vi a..zA..Z0..9
            // for (int i = 0; i < username.length() ; i++){
            // char x = username.charAt(i);
            // kiểm tra x có trong phạm vi a..zA..Z0..9
            /// lưu vào biến username

            while (username.isEmpty() || this.socketServerJava.getClients().containsKey(username));

            out.println("Welcome to the chat server, " + username + "!");
            this.clientInfo = new ClientInfo(username, clientSocket, in, out);

            // Đọc dữ liệu từ client gửi lên và in ra console
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                // TODO: lưu lại dữ liệu người dùng nhập lên vào file tương ứng
                // Lưu dữ liệu của inputLine vào file.
                // Cầu trúc là:
                // Thư mục: History/[Người dùng]/fileluudulieuchat.txt

                FileWriter writer = new FileWriter("fileluudulieuchat.txt", true);
                BufferedWriter br = new BufferedWriter(writer);
                br.write("<--Client: " + inputLine);
                br.newLine();
                br.write("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
                br.newLine();
                br.flush();

                System.out.println("<--Client: " + inputLine);
                // Gửi lại dữ liệu cho client VIẾT HOA NỘI DUNG
                out.println("Server-->: " + inputLine.toUpperCase(Locale.ROOT));
                br.close(); 

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
