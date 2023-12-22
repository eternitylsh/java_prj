package test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test5 {

	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileOutputStream fos = new FileOutputStream("..\\out\\123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for( int i = '1'; i <= '9'; i++ )
				bos.write(i);
			
			fos.close();
			
		} catch (IOException e) {
			logger.error(e.getLocalizedMessage());
		}
	}

}
