package net;

import java.util.*;
import java.util.logging.Logger;
import java.net.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Ex16_04 {
	
	private final static Logger LOG = Logger.getGlobal();
	private final static int LTime = 5 * 1000; 

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			LOG.info(getTime() + "서버가 준비되었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				LOG.info(getTime() + "연결을 기다립니다.");
				
				serverSocket.setSoTimeout(LTime);
				Socket socket = serverSocket.accept();
				
				LOG.info(getTime() + socket.getInetAddress() + "연결 요청 확인");
				
				LOG.info("getport() : " + socket.getPort());
				LOG.info("getLocalport() : " + socket.getLocalPort());
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("Test Message1 from Server");
				LOG.info(getTime() + "데이터 전송 완료");
				
				dos.close();
				socket.close();
				
			}catch(SocketTimeoutException ste) {
				LOG.warning("5초동안 접속이 없어서 종료. - " + ste);
				System.exit(0);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 아래코드는 솔직.. LOG객체로 쏘면 시간 파악 다되므로 그닥..
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
