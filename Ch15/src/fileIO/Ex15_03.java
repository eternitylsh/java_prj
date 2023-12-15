package fileIO;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex15_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "out\\";
//		String path = "..//out//"; // 이 경로는 cmd용.
		
		byte[] res = null;
		
		try {
			
//			FileOutputStream fos = new FileOutputStream(path + "sample.dat");
//			DataOutputStream dos = new DataOutputStream(fos);
//			dos.writeInt(10);
//			dos.writeFloat(20.f);
//			dos.writeBoolean(true);
//			
//			dos.close();
			
			// =====================================
			
//			ByteArrayOutputStream bos = new ByteArrayOutputStream();
//			DataOutputStream dos = new DataOutputStream(bos);
//			dos.writeInt(10);
//			dos.writeFloat(20.0f);
//			dos.writeBoolean(true);
//			
//			res = bos.toByteArray();
//			String[] hex = new String[res.length];
//			
//			for( int i = 0; i < res.length; i++ ) {
//				if( 0 > res[i] ) 
//					hex[i] = String.format("%02x", res[i] + 256); // 16..
//				else 
//					hex[i] = String.format("%02x", res[i]);
//			}
//			
//			System.out.println("decimal : " + Arrays.toString(res) + 
//					"\nheximal : " + Arrays.toString(hex));
//			
//			dos.close();
			
			// ===============================================
			
			FileInputStream fis = new FileInputStream(path + "sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println( "readInt : " + dis.readInt() );
			System.out.println( "readFloat : " + dis.readFloat() );
			System.out.println( "readBool : " + dis.readBoolean() );
			
			dis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
