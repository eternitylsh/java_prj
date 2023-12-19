package net;

// import java.net.*;
import java.net.URL;
import java.util.logging.Logger;

public class Ex16_02 {
	
	private final static Logger LOG = Logger.getGlobal();

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://www.codechobo.com:80");
			
			String res = "";
			
			res += ( url.getAuthority() + "\n" );
			res += ( url.getContent() + "\n" );
			res += ( url.getDefaultPort() + "\n" );
			res += ( url.getPort() + "\n" );
			res += ( url.getFile() + "\n" );
			res += ( url.getHost() + "\n" );
			res += ( url.getPath() + "\n" );
			res += ( url.getProtocol() + "\n" );
			
			LOG.info(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
