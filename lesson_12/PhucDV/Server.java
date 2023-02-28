package lesson_12.PhucDV;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class Server {
    private static List<SocketServerService> listClient =  new ArrayList<>();
    public static void main(String[] args) throws IOException {

        try {
            ServerSocket serverSocket = new ServerSocket(1996);
            while (true){
                System.out.println("Client connected: " + serverSocket.getInetAddress().getHostAddress());
                Socket clientSocket = serverSocket.accept();
                SocketServerService client = new SocketServerService(clientSocket);
                client.start();
                System.out.println("XXXXXXXXX");
                listClient.add(client);

            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
