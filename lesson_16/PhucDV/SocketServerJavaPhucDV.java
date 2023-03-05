package PhucDV;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

public class SocketServerJavaPhucDV {
    //Tạo mảng lưu các thread đang handler client
    private Hashtable<String, ClientInfoPhucDV> clients = new Hashtable<String, ClientInfoPhucDV>();

    public static void main(String[] args) {
        // Singleton Pattern
        SocketServerJavaPhucDV socketServerJava = new SocketServerJavaPhucDV();
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

            ClientHandlerPhucDV clientHandler = new ClientHandlerPhucDV(clientSocket, this);
            new Thread(clientHandler).start();
        }
    }

    public Hashtable<String, ClientInfoPhucDV> getClients() {
        return clients;
    }

    public void setClients(Hashtable<String, ClientInfoPhucDV> clients) {
        this.clients = clients;
    }
}