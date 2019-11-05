package chat.Server;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class TCPServer {
    private static ArrayList<Messages> arr_array = new ArrayList<Messages>();  // the key for the vault
    static int team = 0 ;

    public static void main(String argv[]) throws Exception
    {

        ServerSocket s = null;

        try {
            s = new ServerSocket(10001);

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

            System.out.println(incoming);



            new socketHandler(incoming , arr_array , team/3 ).start();// the first thread for receive from clients
            new socetHandeler_send(incoming ,arr_array , team/3 ).start();// the second thread for sending to
            //the clients
            team++;
        }
    }
}
