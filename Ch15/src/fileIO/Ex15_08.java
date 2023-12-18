package fileIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Logger;
import java.util.ArrayList;

public class Ex15_08 {

	private final static Logger LOG = Logger.getGlobal();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String fname = "Ex15_07.ser";
			
			FileOutputStream fos = new FileOutputStream(fname);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			Ex15_07 u1 = new Ex15_07("JavaExpert", "1234", 30);
			Ex15_07 u2 = new Ex15_07("JavaX", "7531", 26);
			
			
			List<Ex15_07> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);
			
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			
			LOG.info("직렬화가 잘 끝났습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
