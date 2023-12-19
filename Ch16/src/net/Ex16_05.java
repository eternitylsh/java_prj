package net;

import java.net.*;
import java.util.logging.Logger;
import java.io.*;

public class Ex16_05 {

	private final static Logger LOG = Logger.getGlobal();
	
	public static void main(String[] args) {
		try {
			String serverIp = "127.0.0.1";
			LOG.info("서버에 연결 요청 중 : " + serverIp);
			
			Socket socket = new Socket(serverIp, 7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			
			LOG.info("서버로 부터 받은 메세지 : " + dis.readUTF());
			LOG.info("연결 종료.");
			
			dis.close();
			socket.close();
			
			
		}catch(ConnectException ce) {
			ce.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}		

	}

}
