package test;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Receiver extends Thread {

	private static Logger logger = LogManager.getLogger();
	
	Socket socket;
	DataInputStream in;
	
	Receiver(Socket socket) {
		this.socket = socket;
		
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	public void run() {
		while( null != in ) {
			try {
				logger.info(in.readUTF());
			} catch( IOException e) {
				logger.error(e.getMessage());
			}
		}
	}

}
