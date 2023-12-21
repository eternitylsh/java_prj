package test;

import java.net.ServerSocket;
import java.net.Socket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test7 {

	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket ssocket = null;
		Socket socket = null;
		
		try {
			
			ssocket = new ServerSocket(7777);
			logger.info("Server is ready.");
			
			socket = ssocket.accept();
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch(Exception e) {
			// 걍.. getmessage로;;
			logger.error(e.getMessage());
		}
	}

}
