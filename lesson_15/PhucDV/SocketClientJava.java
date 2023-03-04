package PhucDV;

import java.io.*;
import java.net.Socket;

public class SocketClientJava {
    private InputStream input;

    public void start() throws IOException {
        //Tạo socket client kết nối đến socket server
        Socket socket = new Socket("localhost", 5000);
        System.out.println("Connected to server!");

        //Tạo đối tượng để nhận dữ liệu từ server
        input = socket.getInputStream();

        //Tạo đối tượng để gửi dữ liệu đến server
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


        Thread inputThread = new Thread(new InputHandler());
        inputThread.start();

        //Dọc dữ liệu từ console và gửi lên server
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
        }
    }

    private class InputHandler implements Runnable {

        @Override
        public void run() {
            byte[] buffer = new byte[1024];
            int bytesRead;

            try {
                while ((bytesRead = input.read(buffer)) != -1) {
                    String message = new String(buffer, 0, bytesRead);
                    System.out.println("Server: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        SocketClientJava client = new SocketClientJava();
        client.start();
    }
}