
// Test8.java

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sender extends Thread{
	
	private static final Logger logger = LogManager.getLogger(Sender.class);

	Socket socket;
	DataOutputStream out;
	String name;
	
	Sender(Socket socket) {
		this.socket = socket;
		
		try {
			this.out = new DataOutputStream(this.socket.getOutputStream());
			this.name = ("[" + socket.getInetAddress() + "//" + socket.getPort() + "]" );
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while( null != this.out ) {
			try {
				this.out.writeUTF(this.name + " : " + sc.nextLine());
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		}
	}
}
