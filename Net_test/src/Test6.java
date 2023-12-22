import java.io.File;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test6 {
	
	private static final Logger logger = LogManager.getLogger(Test6.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이클립스 결과화면까지는 한글로 진행;;
		// 콘솔에서 실행시에는 한글이 깨져서 영어로 변경;;
		
		if( 1 != args.length ) {
			logger.printf(Level.WARN, "USAGE: Only one Argument : %d", args.length);
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if( !f.exists() || !f.isDirectory() ) {
			logger.printf(Level.WARN, "Can't read Directory. %s", args[0]);
			System.exit(0);
		}
		
		File[] flist = f.listFiles();
		String res = "\n";
		String fname;
		
		for( int i = 0; i < flist.length; i++ ) {
			fname = flist[i].getName();
			res += ( ( flist[i].isDirectory() ? "[" + fname + "]" : fname ) + "\n" );
		}
		
		logger.info(res);
	}

}
