
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test4 {
	
	private static final Logger logger = LogManager.getLogger(Test4.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc;
		
		ByteArrayInputStream in = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		int data = 0;
		
		while ( -1 != ( data = in.read() ) ) {
			out.write(data);
		}
		
		outSrc = out.toByteArray();
		
		String res = "\n";
		
		res += ( "input Source  : " + Arrays.toString(inSrc) + "\n" );
		res += ( "Output Source : " + Arrays.toString(outSrc) + "\n" );
		logger.info(res);
	}

}
