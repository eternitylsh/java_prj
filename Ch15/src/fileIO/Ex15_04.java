package fileIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class Ex15_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] arr1 = {0, 1, 2};
		byte[] arr2 = {3, 4, 5};
		byte[] arr3 = {6, 7, 8, 9};
		byte[] outSrc = null;
		
		Vector v = new Vector();
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		SequenceInputStream		in = new SequenceInputStream (v.elements());
		ByteArrayOutputStream	out = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			while(-1 != (data = in.read())) {
				out.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		outSrc = out.toByteArray();
		
		System.out.printf("Input Source1  : %s\n", Arrays.toString(arr1));
		System.out.printf("Input Source2  : %s\n", Arrays.toString(arr2));
		System.out.printf("Input Source3  : %s\n", Arrays.toString(arr3));
		System.out.printf("Output Source  : %s\n", Arrays.toString(outSrc));
	}

}
