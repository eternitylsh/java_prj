import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] score;
//		
//		score = new int[5];
		
		// int[] score = new int[5];
		// Arrays.fill(score, 3);
		// int[] score1 = { 10, 20, 30, 50, 40 };
		
		int[] arr1 = new int[] {10, 20, 30, 50};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf( arr1.length - 1 == i ? "%d\n" : "%d, ", arr1[i]);
		}
		
		System.out.printf("%s\n", ReadIntArray(arr1/*...*/));
		System.out.printf("%s\n", ReadCharArray(chArr/*...*/));
	}
	
	static String ReadIntArray( int[] __score ) {
		String __str = "";
		
		for( int i = 0; i < __score.length; i++ ) {
			__str += (Integer.toString(__score[i]) + " ");
		}
		
		return __str;
	}
	
	static String ReadCharArray( char[] __codes ) {
		String __str = "";
		
		for( int i = 0; i < __codes.length; i++ ) {
			__str += (__codes[i] + " ");
		}
		
		return __str;
	}

}
