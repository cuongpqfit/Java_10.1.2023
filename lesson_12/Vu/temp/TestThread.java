public static void main(String[] args) {
	try {
	    ServerSocket serverSocket = new ServerSocket(port);
	    Socket clientSocket = null;
	    System.out.println("Server Ready");
	    while(true) {
		try {
		    clientSocket = serverSocket.accept();
		    VuThread t = new VuThread(clientSocket);
		    t.start();
		} catch (IOException e) {
		    System.err.println(e);
		}
	    }


    protected Socket socket;
    public VuThread(Socket s) {
	socket = s;
    }
    public void run() {
	try {
	    System.out.println("Connected");
	    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    PrintWriter out = new PrintWriter(socket.getOutputStream());
	    String s;
	    while((s = in.readLine()) != null) {
		out.print(s + "\r\n");
		out.flush();
		System.out.println(s);
	    }
	    socket.close();
	    System.out.println("Connection Closed");
	} catch (IOException e) {
	    System.err.println(e);
	}
    }