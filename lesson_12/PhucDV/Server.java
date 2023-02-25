package lesson_12.PhucDV;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(1996);
            while (true){
                SocketServerService socketServerService = new SocketServerService(serverSocket);
                Thread thr1 = new Thread(socketServerService);
                thr1.start();
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
