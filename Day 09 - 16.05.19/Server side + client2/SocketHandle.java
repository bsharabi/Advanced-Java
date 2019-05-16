package Program;

import java.io.*;
import java.net.Socket;

public class SocketHandle extends Thread {

    private Socket incoming;
    int cnt = 0;
    String str3 = "";
    DataOutputStream outToClient;

    public SocketHandle(Socket connectionSocket) {
        this.incoming = connectionSocket;
    }

    public void run() {

        try {
            ObjectInputStream inFromClient = new ObjectInputStream(incoming.getInputStream());
             outToClient = new DataOutputStream(incoming.getOutputStream());

            while (true) {
                System.out.println("strat secretary id number : " + Thread.currentThread().getId());
                Lecturer obj = null;
                Student ObjS = null;
                Object clientObject;

                clientObject= inFromClient.readObject();
                if (clientObject instanceof Lecturer) {
                    obj = (Lecturer) clientObject;
                    if ((obj.getAge() > 20 && obj.getAge() < 28) || obj.getSalery() > 12000 || obj.getName().contains("e") || obj.getName().contains("b") || obj.getName().contains("c"))
                        str3 += obj.toString() + " ";
                } else if (clientObject instanceof Student) {
                    ObjS = (Student) clientObject;
                    if ((ObjS.getAge() > 20 && ObjS.getAge() < 28) || ObjS.getName().contains("e") || ObjS.getName().contains("b") || ObjS.getName().contains("c"))
                        str3 += ObjS.toString() + " ";
                }

                cnt++;
                if (cnt >= 10) {
                    System.out.println("Send message to client " + str3);
                    outToClient.writeBytes(str3 + '\n');

                }

            }
        } catch (Exception e) {
            System.out.println("Finally\n");
        }
    }
}

