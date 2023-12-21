package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test3 {
	
	private static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int data = 0;
		
		while( -1 != (data = bis.read()) )
			bos.write(data);
		
		outSrc = bos.toByteArray();
		
		String res = "\n";
		res += (Arrays.toString(inSrc));
		res += "\n";
		res += (Arrays.toString(outSrc));
		
		logger.info(res);
	}

}
