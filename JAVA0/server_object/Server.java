package server_object;



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String argv[]) throws Exception
    {

        ServerSocket s = null;

        try {
            s = new ServerSocket(10000);
            System.out.println("Server is On:");
        } catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        while (true) {
            Socket incoming = null;

            try {
                incoming = s.accept();

            } catch(IOException e) {
                System.out.println(e);
                continue;
            }

            new socketHandler(incoming).start();

        }
    }
}
