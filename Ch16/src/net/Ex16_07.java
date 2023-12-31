package net;

import java.io.IOException;

import java.net.ConnectException;
import java.net.Socket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ex16_07 {

	private final static Logger logger = LogManager.getLogger();
	// private final static Logger LOG = Logger.getGlobal();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String serverIp = "127.0.0.1";
			// 해당 서버의 Ip, port로 접속.
			Socket socket = new Socket(serverIp, 7777);
			
			logger.info("Success Connect HTMLServer01");
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch( ConnectException ce ) {
			logger.error(ce.getMessage());
		} catch( IOException ie ) {
			logger.error(ie.getMessage());
		} catch( Exception e ) {
			logger.error(e.getMessage());
		}
	}

}
