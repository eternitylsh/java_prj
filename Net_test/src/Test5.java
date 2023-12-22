import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test5 {
	
	private static final Logger logger = LogManager.getLogger(Test5.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stubqa
		
		// 이클립스 내 실행시 파일경로: ".\bin\123.txt"
		// 콘솔에서 실행시 파일경로: ".\123.txt"
		
		try {
			FileOutputStream fos = new FileOutputStream(".\\123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for( int i = '1'; i < '9'; i++ ) {
				bos.write(i);
			}
			
			// bos.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
	}

}
