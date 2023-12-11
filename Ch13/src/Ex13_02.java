
// Single Core...
public class Ex13_02 {
	
	static long startTime = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread2 th2 = new Thread2();
		Ex13_02.startTime = System.currentTimeMillis();
		th2.start();
		
		for( int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.printf("소요 시간 1 : %s", ( System.currentTimeMillis() - Ex13_02.startTime ) );
//		
//		for( int i = 0; i < 300; i++) {
//			System.out.printf("%s", new String("|"));
//		}
//		
//		System.out.printf("소요 시간 2 : %s", ( System.currentTimeMillis() - startTime ) );
	}

}

class Thread2 extends Thread {
	public void run() {
		
		for( int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.printf("소요 시간 2 : %s", ( System.currentTimeMillis() - Ex13_02.startTime ) );
	}
}
