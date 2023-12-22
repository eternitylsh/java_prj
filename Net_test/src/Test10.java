
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test10 {
	
	private static final Logger logger = LogManager.getLogger(Test10.class);
	
	private static final String SERVERIP = "127.0.0.1";
	private static final int SERVERPORT = 7777;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Socket socket = new Socket(SERVERIP, SERVERPORT);
			
			logger.printf(Level.INFO, "Success Server Ip: %s, port: %d", socket.getInetAddress(), socket.getPort());
			logger.info("Welcome Inet Chat~!");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch ( ConnectException ce ) {
			logger.error(ce.getMessage());
		} catch ( IOException ioe ) {
			logger.error(ioe.getMessage());
		} catch ( Exception e ) {
			logger.error(e.getMessage());
		}
		
		
	}

}
