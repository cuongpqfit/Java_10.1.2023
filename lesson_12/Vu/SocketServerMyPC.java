import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerMyPC {
    public static void main(String[] args) throws  IOException {

        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started at port " + 5000);
        try {
              
        //Chấp nhận kết nối từ client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());
        
            MyThread cl1 = new MyThread(clientSocket);
            Thread client1 = new Thread(cl1);

            // MyThread cl2 = new MyThread(clientSocket);
            // Thread client2 = new Thread(cl2);
            // MyThread cl2 = new MyThread("client2", 1000);
            // Thread client2 = new Thread(cl1);
            // client1.setSocket(clientSocket);
            client1.start();
            // client1.start();

            // client2.start();
        } catch (IOException e) {

            // TODO: handle exception
            } 
            
    }
}
