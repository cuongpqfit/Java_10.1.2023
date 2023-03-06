package PhucDV;

import java.io.*;
import java.net.Socket;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ClientHandlerPhucDV implements Runnable {
    private SocketServerJavaPhucDV socketServerJava;
    private Socket clientSocket;
    private ClientInfoPhucDV clientInfo;
    private String username;

    public ClientHandlerPhucDV(Socket socket, SocketServerJavaPhucDV socketServerJava) {
        this.clientSocket = socket;
        this.socketServerJava = socketServerJava;
    }

    @Override
    public void run() {
        try {
            //Tạo đối tượng để nhận dữ liệu từ client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            //Tạo đối tượng để gửi dữ liệu cho client
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            boolean doUsername = true;
            do {
                doUsername = false;
                //TODO: [RESOLVE]Gủi y/c đến client phải nhập username giới hạn cho phep a..zA..Z0..9
                //lưu vào biến username
                //Gửi thông báo y/c client nhập username
                out.println("Input username (a..zA..Z0..9)?");
                //Đọc username của client gửi lên
                username = in.readLine();
                //Kiểm tra username có thỏa mãn diều kiện
                if (!username.matches("^[a-zA-Z0-9]+$")) {
                    //Gửi thông báo xuống client
                    out.println("Username '" + username + "' không đúng format, xin hay nhap lai!");
                    doUsername = true;
                    continue;
                }

                if ( this.socketServerJava.getClients().containsKey(username)) {
                    //Gửi thông báo xuống client
                    out.println("Username '" + username + "' da ton tai, xin hay nhap lai!");
                    doUsername = true;
                    continue;
                }

                if (username.isEmpty()) {
                    //Gửi thông báo xuống client
                    out.println("Username '" + username + "' khong duoc de trong, xin hay nhap lai!");
                    doUsername = true;
                    continue;
                }
                System.out.println("Client Username: " + username);

            } while (doUsername);


            this.clientInfo = new ClientInfoPhucDV(username,clientSocket, in, out);
            out.println("Chao mung den voi Server Chat, " + username + "!");
            //Thêm client và danh sách lưu clients của server
            this.socketServerJava.getClients().put(username, this.clientInfo);

            //Đọc dữ liệu từ client gửi lên và in ra console
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                if(inputLine.isEmpty()){
                    continue;
                }
                //TODO: nếu message không @ ở đầu thì for trong mảng this.socketServerJava.getClients() lấy username và ClientInfo(out) dùng out để gửi

                Set<String> set = this.socketServerJava.getClients().keySet();
                if(inputLine.charAt(0) != '@'){
                    for (String userName: set) {
                        this.socketServerJava.getClients().get(userName).getOutput().println(username + " : " + inputLine);
                    }

                    //TODO: nếu message có @ ở đầu thì check xem username có tồn tại hay không nếu có thì lấy ClientInfo ra dà dùng out để gửi

                }else {
                    String[] str = inputLine.split("\\s++");
                    String userNameTmp = str[0].substring(1);

                    //TODO: Lưu vào server khi muốn gõ @server + message
                    //TODO: [RESOLVE]lưu lại dữ liệu người dùng nhập lên vào file tương ứng

                    if(userNameTmp.equals("server")){
                        storeMessageToFile(username, inputLine);
                        System.out.println(username + ": " + inputLine);
                    }
                    else if(!set.contains(userNameTmp) ){
                        out.println("Không tồn tại user yêu cầu!");
                        continue;
                    }else{
                        this.socketServerJava.getClients().get(userNameTmp).getOutput().println(username + " : " + inputLine);
                        continue;
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //Lưu lại dữ liệu client vào file
    public void storeMessageToFile(String username, String message) {
        //Thư mục: History/[Người dùng]/fileluudulieuchat.txt
        //Ví dụ: History/cuongpq/fileluudulieuchat.txt

        String filePath = "E:\\gitlab\\Java_10.1.2023\\lesson_16\\PhucDV\\History\\"+ username + "/fileluudulieuchat.txt";
        File file = new File(filePath);

        //Kiểm tra file và folder đã tồn tại hay chưa. Chưa thì phải tạo
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Ghi dữ liệu xuống file

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            //TODO: moi du lieu se ghi thanh 1 dong trong file
            osw.write(message+"\r");
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
