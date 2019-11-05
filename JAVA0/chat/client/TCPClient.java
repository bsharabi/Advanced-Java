package chat.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String argv[]) throws Exception
    {

        String modifiedSentence;

        Socket clientSocket = new Socket("localhost", 10001); //call the server

        TCPClient_send s1 = new TCPClient_send(clientSocket , clientSocket.toString());
        s1.start();// split the client - for send and receive thread

        BufferedReader inFromServer =
                new BufferedReader(new
                        InputStreamReader(clientSocket.getInputStream()));

        System.out.println(inFromServer.readLine());

        while(true)
        {

            modifiedSentence = inFromServer.readLine(); // getting from server

            if(modifiedSentence != null)
            {
                System.out.println("FROM : " + modifiedSentence);// printing in the console


            }

        }


    }
}
