package fileIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex15_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = ".//out//";
		String fname = "test.txt";
		
		String jpath = ".//src//fileIO//"; // fileIO : packagename. 없을경우 생략가능. 
		String fjava = "Ex15_05.java";
		
		try {
//			FileInputStream fis = new FileInputStream(path + fname);
//			FileReader fr = new FileReader(path + fname);
//			
//			int data = 0;
//			String res = "";
//			
//			while(-1 != (data = fis.read())) {
//				res += (char)data;
//			}
//			res += "\n";
//			fis.close();
//			
//			while(-1 != (data = fr.read())) {
//				res += (char)data;
//			}
//			res += "\n";
//			fr.close();
//			
//			System.out.printf("%s\n", res);
			
			// ===========================================
			
			FileReader fr = new FileReader(jpath + fjava);
			BufferedReader br = new BufferedReader(fr);
			
			String res = "";
			String line = "";
			for( int i = 1; null != (line = br.readLine()); i++) {
				if( -1 != line.indexOf(";") )
					res += ((i < 10 ? ("0" + i) : i) + " : " + line + "\n");
			}
			
			br.close();
			
			System.out.printf("%s\n", res);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
