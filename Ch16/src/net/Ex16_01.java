package net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.logging.Logger;

public class Ex16_01 {
	
	private final static Logger LOG = Logger.getGlobal();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			InetAddress ip = InetAddress.getByName("www.naver.com");
			
			String res = "";
			
			res += ( "getHostName : " + ip.getHostName() + "\n");
			res += ( "getHostAddress : " + ip.getHostAddress() + "\n");
			res += ( "toString : " + ip.toString() + "\n");
			
			LOG.info(res);
			
			byte[] ipAddr = ip.getAddress();
			
			for( int i = 0; i < ipAddr.length; i++ )
				ipAddr[i] = ipAddr[i];
			
			res += ( "getHostAddress : " + Arrays.toString(ipAddr) + "\n" );
			
			LOG.info(res);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
