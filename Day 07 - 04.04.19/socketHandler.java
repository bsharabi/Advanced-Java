import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.ArrayList;

public class socketHandler extends Thread {
	Socket incoming;
	
	socketHandler(Socket _in)
	{
		incoming=_in;
		
	}
	
	public void run()
	{
	

		 String[] clientSentence; 
		 String string ; 
		 String capitalizedSentence = "";
		try
		{
	    
           BufferedReader inFromClient = 
              new BufferedReader(new
              InputStreamReader(incoming.getInputStream())); 
           
           DataOutputStream outToClient = 
        		   new DataOutputStream(incoming.getOutputStream());
          
       	while(true) {
       		string = inFromClient.readLine();
       		clientSentence = string.split(" ");
	         // System.out.println(clientSentence.length + " " + clientSentence[0] + " " + clientSentence[1]);
	           for(int i=0;i<clientSentence.length;i++)
	           {
	        	   for(String item:TCPServer.list_Animals)
	        	   {
	        		  
	        		   if(clientSentence[i].equals(item))
	        		   {
	        			   clientSentence[i]="x";
	        			 
	        		   }
	        	   }
	        	   capitalizedSentence+=clientSentence[i]+" ";
	           }
	       
	           capitalizedSentence = capitalizedSentence+"\n"; //MUST BE \N !!!!!!!!!!!!
	           // above send string  
	           outToClient.writeBytes(capitalizedSentence);
	           capitalizedSentence="";
       	}
      
		}
		catch(IOException e)
		{
			
		}

	}
}
