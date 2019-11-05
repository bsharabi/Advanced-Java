package client_object;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class TCPClient_send extends Thread {// the client sending thread - send to server

    private Socket clientSocket;

    TCPClient_send(Socket clientSocket , String name)
    {
        super (name);
        this.clientSocket = clientSocket ;
    }

    public void run()
    {
        String sentence;
        String modifiedSentence;


        try {
            Scanner s1 = new Scanner ( System.in);

            DataOutputStream outToServer =
                    new DataOutputStream(clientSocket.getOutputStream());
            while(true)
            {

                System.out.println("Enter your Math");// getting from user
                sentence = s1.nextLine();
                outToServer.writeBytes(sentence + '\n');// sending to server the user sentence

                if(sentence.toLowerCase().equals("bye"))
                {
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                }
            }
            clientSocket.close(); // close the client socket

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}



