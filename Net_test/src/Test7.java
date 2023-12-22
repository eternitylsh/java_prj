import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test7 {
	
	private static final Logger logger = LogManager.getLogger(Test7.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket ssocket = null;
		
		try {
			ssocket = new ServerSocket(7777);
			logger.printf( Level.INFO, "Server completed Set. %d", ssocket.getLocalPort());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		
		while(true) {
			try {
				logger.printf(Level.INFO, "Waiting Server..");
				Socket socket = ssocket.accept();
				
				logger.info("-Server Msg-");
				
				Sender sender = new Sender(socket);
				Receiver receiver = new Receiver(socket);
				
				sender.start();
				receiver.start();
				
			} catch( IOException e ) {
				logger.error(e.getMessage());
			}
		}
	}

}
