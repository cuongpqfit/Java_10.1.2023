package PhucDV;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientInfoPhucDV {
    private String username;
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;

    public ClientInfoPhucDV(String username, Socket socket, BufferedReader input, PrintWriter output) {
        this.username = username;
        this.socket = socket;
        this.input = input;
        this.output = output;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public BufferedReader getInput() {
        return input;
    }

    public void setInput(BufferedReader input) {
        this.input = input;
    }

    public PrintWriter getOutput() {
        return output;
    }

    public void setOutput(PrintWriter output) {
        this.output = output;
    }
}
