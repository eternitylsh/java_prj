
public class ex03_prac {
	public static void main(String[] args) {
		
		// Ex03_01();
		Ex03_02();
		
		// ============================================================
		
		
	}
	
	static void Ex03_01() {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		i = ch;
		
		System.out.printf("%d", i);	
		// 문제 1 : 4, 5번
	}
	
	static void Ex03_02() {
		int x = 2;
		int y = 5;
		char c = 'A'; // 65
		
		System.out.println( 5 <= y || 0 > x && 2 < x );
		System.out.println( y += 10 - x++);
		System.out.println( x += 2 );
		System.out.println( !('A' <= c && c <= 'Z') );
		System.out.println( 'C' - c );
		System.out.println( 'S' - '0' );
		System.out.println( c + 1 );
		System.out.println( ++c );
		System.out.println( c++ );
		System.out.println( c );
		
		/* 위 대답은 아래와 같음.
		 *  true
			13
			5
			false
			2
			35
			66
			B
			B
			C 
		*/
	}
	
	
	static void Ex03_03() {
		int num = 456;
		System.out.println( "" );
	}
}
