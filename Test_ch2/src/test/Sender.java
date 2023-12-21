package test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Test8.java
public class Sender extends Thread {
	
	private static Logger logger = LogManager.getLogger();
	
	Socket socket;
	DataOutputStream out;
	String name;
	
	Sender(Socket socket) {
		this.socket = socket;
		
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + " : " + socket.getPort() + "]";
		} catch (Exception e) {
			logger.error(e.getStackTrace());
		}
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while( null != out ) {
			try {
				out.writeUTF(name + sc.nextLine());
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		}
	}
}
