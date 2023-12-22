import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Test9.java
public class Receiver extends Thread {
	
	Socket socket;
	DataInputStream in;
	
	private static final Logger logger = LogManager.getLogger(Receiver.class);
	
	Receiver( Socket socket ) {
		this.socket = socket;
		
		try {
			this.in = new DataInputStream(this.socket.getInputStream());
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}
	
	@Override
	public void run() {
		while( null != in ) {
			try {
				logger.printf(Level.INFO, "\n%s", this.in.readUTF());
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		}
	}
}
