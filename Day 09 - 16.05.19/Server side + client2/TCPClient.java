package Program;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

class TCPClient {
    public static void main(String argv[]) throws Exception {
        String sentence;
        String modifiedSentence;


        Scanner in = new Scanner(System.in);

        Socket clientSocket = new Socket("localhost", 6689);

        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        ObjectOutputStream outToServer = new ObjectOutputStream(clientSocket.getOutputStream());

        while(true) {
            System.out.println("Enter your name");
            outToServer.writeObject(new Student("barak", "sharabi", "265458556", "ddddd", 10, "55"));
            outToServer.writeObject(new Lecturer("ofek", "ben harosh", "156452645", "ddddd", 21, 10000, "55"));
            outToServer.writeObject(new Student("naor", "bacharlia", "156145165", "ddddd", 50, "55"));
            outToServer.writeObject(new Lecturer("shoval", "maous", "265845987", "ddddd", 25, 12500, "55"));
            outToServer.writeObject(new Student("nuki", "novikov", "156975632", "ddddd", 28, "55"));
            outToServer.writeObject(new Lecturer("daniel", "shar", "485697536", "ddddd", 32, 13000, "55"));
            outToServer.writeObject(new Student("shalom", "moni", "236985746", "ddddd", 18, "55"));
            outToServer.writeObject(new Lecturer("yossi", "loli", "456986325", "ddddd", 25, 5000, "55"));
            outToServer.writeObject(new Student("thico", "poki", "879645231", "ddddd", 35, "55"));
            outToServer.writeObject(new Lecturer("miki", "shor", "156976542", "ddddd", 36, 5000, "55"));
            break;
        }
        System.out.println("Send message successful");
        System.out.println("Wait to callback message");
        modifiedSentence = inFromServer.readLine();
        System.out.println("Server got : \n " + modifiedSentence + "\n");
        System.out.println("Finally");
        clientSocket.close();


    }
}
