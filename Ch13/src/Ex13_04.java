

class Thread4 extends Thread {
	public void run() {
		for( int i = 0; i < 300; i++ ) {
			System.out.print("-");
			for( int x = 0; x < 10000000; x++ );
		}
	}
}

class Thread5 extends Thread {
	public void run() {
		for( int i = 0; i < 300; i++ ) {
			System.out.print("|");
			for( int x = 0; x < 10000000; x++ );
		}
	}
}

public class Ex13_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread4 th4 = new Thread4();
		Thread5 th5 = new Thread5();
		
		th5.setPriority(7);
		
		System.out.printf("Priority of th4(-) : %d\n", th4.getPriority());
		System.out.printf("Priority of th5(|) : %d\n", th5.getPriority());
		
		th4.start();
		th5.start();
	}

}
