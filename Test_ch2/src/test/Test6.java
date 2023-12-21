package test;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test6 {

	// printf log를 원한다면...
	private static Logger logger = LogManager.getFormatterLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if( 1 != args.length ) {
			logger.warn("Usage : need 1 execute argument. : %d", args.length);
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory()) {
			logger.warn("Can't accept directory : %s", args[0]);
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		String res = "\n";
		
		for( int i = 0; i < files.length; i++ ) {
			String fname = files[i].getName();
			res += ( (files[i].isDirectory() ? "[" + fname + "]" : fname ) + "\n");
		}
		
		logger.info(res);
	}

}
