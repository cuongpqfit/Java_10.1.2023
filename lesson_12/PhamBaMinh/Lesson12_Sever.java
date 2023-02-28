package PhamBaMinh;

import java.io.IOException;
import java.net.ServerSocket;

public class Lesson12_Sever {

    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(4567);
            while(true) {
                System.out.println("Client connected: " + serverSocket.getInetAddress().getHostAddress());
                (new Lesson12_Thread(serverSocket.accept())).start();
            }
        } catch (Exception var2) {
            System.out.println(var2.getMessage());
        }
    }
}
