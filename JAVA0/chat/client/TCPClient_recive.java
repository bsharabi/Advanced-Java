package chat.client;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient_recive {
    TCPClient_recive() {
    }

    public static void main(String[] argv) throws Exception {
        Socket clientSocket = new Socket("localhost", 10001);
        TCPClient_send s1 = new TCPClient_send(clientSocket, clientSocket.toString());
        s1.start();
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println(inFromServer.readLine());

        while(true) {
            String modifiedSentence;
            do {
                modifiedSentence = inFromServer.readLine();
            } while(modifiedSentence == null);

            System.out.println("FROM : " + modifiedSentence);
        }
    }
}
