package PhucDV;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

public class SocketServerJava {
    //Tạo mảng lưu các thread đang handler client
    private Hashtable<String, ClientInfo> clients = new Hashtable<String, ClientInfo>();

    public static void main(String[] args) {
        // Singleton Pattern
        SocketServerJava socketServerJava = new SocketServerJava();
        try {
            socketServerJava.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() throws  IOException  {
        //Tạo đối tượng Socket Server lắng nghe ở port 5000
        //Localhost -> localhost : 127.0.0.1
        //Lan IP: sử dụng ipconfig(Win) ifconfig(Mac/Linux): 192.168.xxx.xxx
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started at port " + 5000);

        while (true) {
            //Chấp nhận kết nối từ client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

            ClientHandler clientHandler = new ClientHandler(clientSocket, this);
            new Thread(clientHandler).start();
        }
    }

    public Hashtable<String, ClientInfo> getClients() {
        return clients;
    }

    public void setClients(Hashtable<String, ClientInfo> clients) {
        this.clients = clients;
    }
}