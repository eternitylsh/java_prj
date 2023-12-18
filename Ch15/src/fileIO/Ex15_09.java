package fileIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Ex15_09 {
	
	private final static Logger LOG = Logger.getGlobal();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fname = "Ex15_07.ser";
			
			FileInputStream fis = new FileInputStream(fname);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream in = new ObjectInputStream(bis);
			
			Ex15_07 u1 = (Ex15_07)in.readObject();
			Ex15_07 u2 = (Ex15_07)in.readObject();
			ArrayList list = (ArrayList)in.readObject();
			
			String res = "";
			
			res += (u1 + "\n");
			res += (u2 + "\n");
			res += (list + "\n");
			
			LOG.info(res);
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
