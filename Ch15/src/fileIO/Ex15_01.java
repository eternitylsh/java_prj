package fileIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex15_01 {
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.printf("temp\t\t:%s\n", Arrays.toString(temp));
		System.out.printf("Output Source\t:%s\n", Arrays.toString(outSrc));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] inSrc 	= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc 	= null;
		byte[] temp = new byte[4]; // 예전에는 [10].. 이번엔 [4]씩..
		
		ByteArrayInputStream instream = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream outstream = new ByteArrayOutputStream();
		
		System.out.printf("Input Source    : %s\n", Arrays.toString(inSrc));
		// int data = 0;
		
//		while( (data = instream.read()) != -1 )
//			outstream.write(data);
		// 이번엔 다른방식.
		// instream.read(temp, 0, temp.length);
		// outstream.write(temp, 5, 5);
		// 다만 이렇게 한번에 가능한건 작은 데이터 그룹이라서 가능.
		// 큰 데이터를 처리할려면 while등으로 계속 반복하면서 처리해햐함.
		
		// 반복과 try catch 적용 당연하게도..

		
		try {
			int len = 0;
			while( 0 < instream.available() ) {
				len = instream.read(temp);
				outstream.write(temp, 0, len);
				
				outSrc = outstream.toByteArray();
				printArrays(temp, outSrc);
			}
		} catch( IOException e ) {
			System.out.printf("%s\n", e);
		}
		
		

//		outSrc = outstream.toByteArray();		
		
//		System.out.printf("Temp		: %s\n", Arrays.toString(temp));
//		System.out.printf("Output Source   : %s\n", Arrays.toString(outSrc));
	}

}
