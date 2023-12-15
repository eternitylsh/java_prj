package fileIO;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex15_06 {
	
	private final static Logger LOG = Logger.getGlobal();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		File f = new File(".//out//fileIO//Ex15_06.java");
//		String fname = f.getName();
//		int pos = fname.lastIndexOf(".");
//		
//		LOG.setLevel(Level.INFO);
//		
//		LOG.info("경로를 제외한 파일 이름 - " + f.getName());
//		LOG.info("확장자를 제외한 파일 이름 - " + fname.substring(0, pos));
		
		if( 1 != args.length ) {
			LOG.warning("USAGE : java Ex15_16 DIRECTORY.");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if( !f.exists() || !f.isDirectory() ) {
			LOG.warning("유효하지 않는 디렉토리.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		String res = "";
		
		for( int i = 0; i < files.length; i++ ) {
			String fname = files[i].getName();
			res += (files[i].isDirectory() ? "[" + fname + "]" : fname) + "\n";
		}
		
		LOG.info(res);
	}

}
