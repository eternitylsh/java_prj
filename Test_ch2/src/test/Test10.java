package test;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test10 {
	
	private static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String serverip = "127.0.0.1";
			Socket socket = new Socket(serverip, 7777);
			
			logger.printf(Level.INFO, "Succcess Connect Target Server : %s, port: %d", socket.getInetAddress(), socket.getPort());
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch( ConnectException ce ) {
			logger.error(ce.getMessage());
		} catch( IOException ioe ) {
			logger.error(ioe.getMessage());
		} catch( Exception e ) {
			logger.error(e.getMessage());
		}
	}

}
