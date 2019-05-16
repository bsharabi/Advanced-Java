package Program;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServer {
    private static int cnt = 0;
    public static void main(String[] argv) throws Exception {
        System.out.println("Start server in port 6689");
        System.out.println("---------------------------------------");
        ServerSocket welcomeSocket = new ServerSocket(6689);

        while (true) {
            Socket incoming = null;
            try {
                incoming = welcomeSocket.accept();
                System.out.println("loop number : " + ++cnt);
            } catch (IOException e) {
                System.out.println(e);
                continue;
            }
            new SocketHandle(incoming).start();
            System.out.println("Send Incoming\n");
        }
    }
}