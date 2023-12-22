
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t01 {

	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String man = "Mr. M";
		
		logger.printf(Level.WARN, "hello~ %s", man);
		
//		Stream<String> str = Stream.of("aa", "cc", "dd", "bb");
//		str.sorted().forEach( System.out::print );
		
//		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		byte[] outSrc = null;
//		
//		ByteArrayInputStream bis = new ByteArrayInputStream(inSrc);
//		ByteArrayOutputStream bos = new ByteArrayOutputStream();
//		
//		int data = 0;
//		
//		while( -1 != (data = bis.read()) )
//			bos.write(data);
//		
//		outSrc = bos.toByteArray();
//		
//		String res = "\n";
//		res += (Arrays.toString(inSrc));
//		res += "\n";
//		res += (Arrays.toString(outSrc));
//		
//		logger.info(res);
		
		// 아래 코드 쓸거면 argument 추가.
//		if( 1 != args.length ) {
//			logger.printf(Level.WARN, "Usage : need 1 execute argument. : %d", args.length);
//			System.exit(0);
//		}
//		
//		File f = new File(args[0]);
//		
//		if(!f.exists() || !f.isDirectory()) {
//			logger.printf(Level.WARN, "Can't accept directory : %s", args[0]);
//			System.exit(0);
//		}
//		
//		File[] files = f.listFiles();
//		String res = "\n";
//		String fname;
//		
//		for( int i = 0; i < files.length; i++ ) {
//			fname = files[i].getName();
//			res += ( (files[i].isDirectory() ? "[" + fname + "]" : fname ) + "\n");
//		}
//		
//		logger.info(res);
	}

}
