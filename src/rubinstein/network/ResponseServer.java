package rubinstein.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ResponseServer {
	
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket = new ServerSocket(8000);
		//list on 8080 (comp wont let you use 80)
		
		while(true){
		Socket socket = serverSocket.accept();
		
		
		ServerThreads task = new ServerThreads(socket);
		
		new Thread(task).start();
		}		
		
	}
	

}
