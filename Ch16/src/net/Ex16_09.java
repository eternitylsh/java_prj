package net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ex16_09 {
	
	private static Logger logger = LogManager.getLogger("HTMLServer01");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if( 1 != args.length ) {
			logger.printf(Level.WARN, "Please Connect Name.");
			System.exit(0);
		}
		
		try {
			String serverIp = "127.0.0.1";
			
			Socket socket = new Socket(serverIp, 7777);
			logger.printf(Level.INFO, "Completed connect Server.");
			
			ClientSender thread1 = new ClientSender(socket, args[0]);
			ClientReciever thread2 = new ClientReciever(socket);
			
			thread1.start();
			thread2.start();
		} catch (ConnectException ce) {
			logger.error(ce.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	static class ClientSender extends Thread {
		
		Socket socket;
		DataOutputStream out;
		String name;
		
		ClientSender( Socket socket, String name ) {
			this.socket = socket;
			
			try {
				this.out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		}
		
		
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			
			try {
				
				if( null != this.out ) {
					this.out.writeUTF(name);
				}
				
				while( null != this.out ) {
					this.out.writeUTF(name + " : " + sc.nextLine());
				}
				
			} catch(IOException e) {
				logger.error(e.getMessage());
			}
		}
		
	}
	
	static class ClientReciever extends Thread {
		Socket socket;
		DataInputStream in;
		
		ClientReciever( Socket socket ) {
			this.socket = socket;
			
			try {
				this.in = new DataInputStream( socket.getInputStream() );
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		}
		
		@Override
		public void run() {
			while( null != this.in ) {
				try {
					logger.info(in.readUTF());
				} catch (IOException e) {
					logger.error(e.getMessage());
				}
			}
		}
	}
}
