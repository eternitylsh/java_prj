package net;

import java.net.*;
import java.util.logging.Logger;
import java.io.*;

public class Ex16_03 {

	private final static Logger LOG = Logger.getGlobal();
	
	public static void main(String[] args) throws Exception{
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
		
		if( 1 != args.length ) {
			LOG.warning("USAGE: 필수로 실행인수로 URL 입력이 필요합니다.");
			System.exit(0);
		}
		
	//	https://github.com/castello/javajungsuk3/blob/master/source/ch1/Hello.java
	//	String address = "https://github.com/castello/javajungsuk3/blob/master/source/ch1/Hello.java";
		String address = args[0];
		
		int ch = 0;
		
		try {
			url = new URL(address);
			in = url.openStream();
			out = new FileOutputStream("Hello.java");
			
			while((ch = in.read()) != -1) {
				out.write(ch);
			}
			in.close();
			out.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
