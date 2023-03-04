import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClientJava {

    public void start() throws IOException {
        //Tạo socket client kết nối đến socket server
        Socket socket = new Socket("localhost", 5000);

        //Tạo đối tượng để gửi dữ liệu đến server
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        //Tạo đối tượng để nhận dữ liệu từ server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Thread inputHandler = new Thread(new InputHandler(in));
        inputHandler.start();

        System.out.println("Server started at port ");

        //Dọc dữ liệu từ console và gửi lên server
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
        }
    }

    //Tạo Thread nhận dữ liệu từ server và hiển thị ra màn hình
    private class InputHandler implements Runnable {
        BufferedReader input;
        public InputHandler(BufferedReader in) {
            this.input = in;
        }
        @Override
        public void run() {
            String message;
            try {
                //Đọc dữ liệu từ server và hiển thị ra màn hình
                while ((message = this.input.readLine()) != null) {
                    System.out.println("Server: " + message);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        SocketClientJava socketClientJava = new SocketClientJava();
        socketClientJava.start();
    }
}