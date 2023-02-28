import java.io.BufferedReader;
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
            //Tạo đối tượng để nhận dữ liệu từ client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            //Tạo đối tượng để gửi dữ liệu cho client
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            do {
                //TODO: Gủi y/c đến client phải nhập username giới hạn cho phep a..zA..Z0..9
                //lưu vào biến username
            } while (username.isEmpty() || this.socketServerJava.getClients().containsKey(username));
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
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
