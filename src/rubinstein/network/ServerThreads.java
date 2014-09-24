package rubinstein.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ServerThreads implements Runnable{
	private Socket socket;
	private StringBuilder message;
	
	//construct thread
	public ServerThreads(Socket socket){
		this.socket = socket;
		message.append("");
	}
	
	public StringBuilder getMessage() {
		return message;
	}

	public void run(){
		try{
		InputStream in = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	
		String line;
		while((line = reader.readLine()) != null) {
			message.append(line);
		}
		OutputStream out = socket.getOutputStream();
		out.write("Hello World!".getBytes());
		out.flush();
		out.close();
		}catch(IOException ex){
			System.err.println(ex);
		}
	
	}


}
