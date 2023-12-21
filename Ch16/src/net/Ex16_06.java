package net;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ex16_06 {
	
	// 여기서부턴 아파치 Log4j2를 쓴다.
	// 라고 해도 콘솔에서 문제라서 추후 다시;;
	private final static Logger logger = LogManager.getLogger();
	// private final static Logger LOG = Logger.getGlobal();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket sSocket = null;
		@SuppressWarnings("unused")
		Socket socket = null;
		
		try {
			
			sSocket = new ServerSocket(7777);
			logger.info("I'm Ready Server01");
			
			socket = sSocket.accept();
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	private final static Logger logger = LogManager.getLogger();
	// private final static Logger LOG = Logger.getGlobal();
	
	Sender(Socket socket) {
		this.socket = socket;
		
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + " : " + socket.getPort() + "]";
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while( null != out ) {
			try {
				out.writeUTF(name + sc.nextLine());
			} catch(Exception e) {
				logger.error(e.getMessage());
			}
		}
	}
}


class Receiver extends Thread {
	Socket socket;
	DataInputStream in;
	
	private final static Logger logger = LogManager.getLogger();
	// private final static Logger LOG = Logger.getGlobal();
	
	Receiver(Socket socket) {
		this.socket = socket;
		
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	public void run() {
		while(null != in ) {
			try {
				logger.info(in.readUTF());
			} catch( Exception e ) {
				logger.error(e.getMessage());
			}
		}
	}
}
