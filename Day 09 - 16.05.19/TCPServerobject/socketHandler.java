import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.*;
import java.util.ArrayList;

import com.google.gson.Gson;

public class socketHandler extends Thread  {
	Socket incoming;
	static ArrayList<Object> arr = new ArrayList<Object>();
	ArrayList<Person> arr_p = new ArrayList<Person>();
	
	
	
	socketHandler(Socket _in  )
	{
		this.incoming=_in;
		
		arr_p.add(new Student("effi" , "122121" , 21));
		arr_p.add(new Student("haim" , "3392982" , 36));
		arr_p.add(new Student("barak" , "928392" , 42));
		arr_p.add(new Lecture("effi" , "122121" , 10000000));
		arr_p.add(new Lecture("kiril" , "122121" , 50));
		
		
		
		
	}
	
	public void run()
	{
	
		Object clientObject; 
		
		DataOutputStream outToClient = null ;
		try {
			   BufferedReader inFromClient = 
		                new BufferedReader(new
		                InputStreamReader(incoming.getInputStream()));
			 outToClient = new DataOutputStream(incoming.getOutputStream()); 
		
		
	
	  
		   Student s = null;
		   Lecture l = null; 
		   String str=""; 
			
		   String  choice = inFromClient.readLine();
		   
		  switch ( choice.charAt(0))
		  {
		  case '1':
			  
			  for( Person p : arr_p )
			  {
				  if(p instanceof Lecture )
				  {
					  Lecture l1 = (Lecture) p;
					  if(l.getSalary() > 10000)
						  arr.add(p);
				  }
			  }
			  
			  break;
			  
		  case '2':
			  for( Person p : arr_p )
			  {
				  if(p instanceof Student)
				  {
					  Student l = (Student) p;
					  if(l.getAge()> 26)
						  arr.add(p);
				  }
			  }
			  break; 
			  
		default:
				  
				  break;
	
		  }
			String json = new Gson().toJson(arr);
			
			outToClient.writeBytes(json + "\n");
			
		
		
		
	//	outToClient.writeBytes(str+"\n");
		
	
		
		
		
	   } catch (ClassNotFoundException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	}

