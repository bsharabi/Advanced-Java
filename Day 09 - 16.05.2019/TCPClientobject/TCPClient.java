

/*
 * Java provides a mechanism, called object serialization where an object can be represented as a sequence of bytes that includes the object's data as well as information about the object's type and the types of data stored in the object.

After a serialized object has been written into a file, it can be read from the file and deserialized that is, the type information and bytes that represent the object and its data can be used to recreate the object in memory.

Most impressive is that the entire process is JVM independent, meaning an object can be serialized on one platform and deserialized on an entirely different platform.

Classes ObjectInputStream and ObjectOutputStream are high-level streams that contain the methods for serializing and deserializing an object.
 * 
 * pay attation that if the client sends you integer so in the server you will get integer 
 * and if it sends you string so you will get string . 
 * 
 * 
 */

import java.io.*;
import java.lang.reflect.Type;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

class TCPClient_with_serialized { 

    public static void main(String argv[]) throws Exception 
    { 
        
        String Result = null; 
        Object s = null;
        int counter=0; 

        Socket clientSocket = new Socket("localhost", 10000); 
        Scanner sc = new Scanner(System.in);
        
//        ObjectOutputStream  outToServer = 
//     		   new ObjectOutputStream (clientSocket.getOutputStream() );
        
        DataOutputStream  outToServer = new DataOutputStream(clientSocket.getOutputStream()); 
        
        BufferedReader inFromServer = 
                new BufferedReader(new
                InputStreamReader(clientSocket.getInputStream()));
			
			while(true){
				
		System.out.println("enter your choice ");
		System.out.println("[1] -salary lecture upper then 10000");
		System.out.println("[2] -age student upper then 26");
		int choice = sc.nextInt();
		
		outToServer.writeBytes(choice +"\n");
				
		String str = inFromServer.readLine();
		ArrayList<Student> arr = new ArrayList<Student>();
		
		Gson gson = new Gson();
		arr = gson.fromJson(str, new TypeToken<List<Student>>(){}.getType());
		
		for(Student student : arr)
		{
			System.out.println(student.getName());
		}
			}
}
}
