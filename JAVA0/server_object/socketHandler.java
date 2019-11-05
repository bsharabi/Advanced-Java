package server_object;


import Person.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;

public class socketHandler extends Thread  {
    Socket incoming;
    static ArrayList<Object> arr = new ArrayList<Object>();

    socketHandler(Socket _in  )
    {
        this.incoming=_in;

    }

    public void run()
    {

        System.out.println(Thread.currentThread().getId());
        int ageCnt = 0;
        int lecturerCnt = 0;
        int nameCnt = 0;
        Lecturer lecturer;
        Student student;
        Person person;
        String object;
        ArrayList<Person> arr = new ArrayList<Person>();
        String json = new Gson().toJson(arr);
        DataInputStream inFromClient = null;
        DataOutputStream outToClient = null ;
        try {
            inFromClient = new DataInputStream(incoming.getInputStream());
            outToClient = new DataOutputStream(incoming.getOutputStream());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            object = inFromClient.readUTF();
//
            Gson gson = new Gson();
            arr = gson.fromJson(object, new TypeToken<ArrayList<Person>>(){}.getType());
            for(int i=0;i<arr.size();i++){

                if(arr.get(i) instanceof Lecturer)
                {
                    lecturer = (Lecturer)arr.get(i);
                    if(lecturer.getSalary() > 12000)
                        lecturerCnt+=1;
                    if(lecturer.getName().contains("b") || lecturer.getName().contains("c")|| lecturer.getName().contains("e"))
                        nameCnt +=1;
                    System.out.println("add");
                }
                else if(arr.get(i) instanceof Student)
                {
                    student = (Student)arr.get(i);
                    if(student.getAge() >=20 && student.getAge() <=28)
                        ageCnt +=1;
                    if(student.getName().contains("b") || student.getName().contains("c")|| student.getName().contains("e"))
                        nameCnt +=1;
                    System.out.println("add");
                }
                //arr.add(arr.get(i));
            }
            System.out.println("done");
            outToClient.writeBytes(String.format("num of lecturers that gets more then 12K: %d num of Age: %d num of Name %d\n",lecturerCnt, ageCnt,nameCnt));
            while (Thread.currentThread().isAlive()) {
                System.out.println("true");
                incoming.close();
                this.stop();
            }
//            double avgSalary = 0;
//            while (true) {
//                l =  inFromClient.readObject();
//                if (l != null) {
//                    System.out.println(l);
//
//                    arr.add(l);
//                    //avgSalary += arr.get(i).getSalary();
//                    // }
////                avgSalary = avgSalary / 5;
//                    outToClient.writeBytes(l.toString() + "\n");
//
//                }
//            }
            	//outToClient.writeBytes(str+"\n");

//            String json = new Gson().toJson(arr);




        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }

    }
}
