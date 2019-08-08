import java.io.*; 
import java.net.*;
import java.util.ArrayList; 

class TCPServer { 
	public static ArrayList<String> list_Animals;
  public static void main(String argv[]) throws Exception 
    { 
	    list_Animals=new ArrayList<String>();
		list_Animals.add("dog");
		list_Animals.add("cat");
		list_Animals.add("monkey");
		list_Animals.add("fish");
		list_Animals.add("bear");
		ServerSocket s = null;
	 
		try {
		    s = new ServerSocket(10000);
		
		} catch(IOException e) {
		    System.out.println(e);
		    System.exit(1);
		}

		while (true) {
		    Socket incoming = null;
		    
		    try {
			incoming = s.accept();
			
		    } catch(IOException e) {
			System.out.println(e);
			continue;
		    }

		    new socketHandler(incoming).start();

		}
    } 
} 
