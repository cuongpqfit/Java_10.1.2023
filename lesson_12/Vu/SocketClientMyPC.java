import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClientMyPC {
    public static void main(String[] args) throws IOException {
    
        Socket socket = new Socket( "localhost", 5000);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            //Tạo đối tượng để nhận dữ liệu từ server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //Dọc dữ liệu từ console và gửi lên server
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            System.out.println(in.readLine());
        }
    
    }
}
