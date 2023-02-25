package PhamBaMinh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Lesson12_Client {
    public static void main(String[] args) throws IOException {
        try {
            Socket socket = new Socket("localhost", 4567);
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while(true) {
                String userInput;
                while((userInput = stdIn.readLine()) == null) {
                    socket.close();
                }

                out.println(userInput);
                System.out.println(in.readLine());
            }
        } catch (Exception var6) {
            System.out.println(var6.getMessage());
        }
    }
}
