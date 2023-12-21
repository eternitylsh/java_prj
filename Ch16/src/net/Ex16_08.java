package net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ex16_08 {

	HashMap clients;
	
	private static Logger logger = LogManager.getLogger("HTMLServer01");
	// private final static Logger LOG = Logger.getGlobal();
	
	@SuppressWarnings("unchecked")
	Ex16_08() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}
	
	public void start() {
		ServerSocket ssocket = null;
		Socket socket = null;
		
		try {
			
			ssocket = new ServerSocket(7777);
			logger.info("Start Server02!!");
			
			while( true ) {
				socket = ssocket.accept();
				String hname = ("[" + socket.getInetAddress() + " : " + socket.getPort() + "]");
				logger.info( hname + "from connected!" );
				
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
			
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	// broadcast (who invited...)
	@SuppressWarnings("rawtypes")
	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		
		while( it.hasNext() ) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg);
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex16_08().start();
	}
	
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				
				
			} catch (IOException ie) {
				logger.error(ie.getMessage());
			}
		}
		
		public void run() {
			String name = "";
			
			try {
				name = in.readUTF();

				// who invited?
				sendToAll("Mr. / Ms. " + name + " call invited.");
				clients.put(name, out);
				logger.info("Now SeverClients Count : " + clients.size());
				
				while(null != in) {
					sendToAll(in.readUTF());
				}
				
			} catch (IOException e) {
				logger.error(e.getMessage());
			} finally {
				sendToAll( "Mr. / Ms. " + name + " exit." );
				clients.remove(name);
				logger.info("Now SeverClients Count : " + clients.size());
			}
		}
	}
}


