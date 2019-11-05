package client_object;


import Person.Lecturer;
import Person.Person;
import Person.Student;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String argv[]) throws Exception {

        String name = null, id =null;
        double salary;
        Person s = null;
        ArrayList<Person> arr = new ArrayList<Person>();
        int counter = 0,age=0;

        Socket clientSocket = new Socket("localhost", 10000);
        Scanner sc = new Scanner(System.in);

        BufferedReader inFromServer =
                new BufferedReader(new
                        InputStreamReader(clientSocket.getInputStream()));

        DataOutputStream outToServer =
                new DataOutputStream(clientSocket.getOutputStream());

//        while (true) {

        for(int i=0; i<1;i++) {

            System.out.println("----------Lecturer number: " + i + "-------------\n type name:");

            name = sc.nextLine();
            System.out.println("type Id:");
            id = sc.nextLine();
            System.out.println("type Salary:");
            salary = sc.nextDouble();
            sc.nextLine();
            s = new Lecturer(id, name, salary);
            arr.add(s);
        }
//        for(int i=0; i<2;i++) {
//            System.out.println("----------Student number: " + i + "-------------\n type name:");
//            name = sc.nextLine();
//            System.out.println("type Id:");
//            id = sc.nextLine();
//            System.out.println("type Age:");
//            age = sc.nextInt();
//            sc.nextLine();
//            s = new Student(id,name,age);
//            arr.add(s);
//        }

            String json = new Gson().toJson(arr);
//            System.out.println(json);
            outToServer.writeBytes(json);
//            for(Person p : arr) {
//                outToServer.writeObject(p);
//            }


            String str = inFromServer.readLine();

//            System.out.println(str);
            System.out.println("from server: "+ str);
            outToServer.writeBytes(str);

//            for (Lecturer lecturer : arr) {
//                System.out.println(lecturer.getName());
//            }
//        }


    }
}
