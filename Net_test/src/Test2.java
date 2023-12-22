

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		
		th1.start();
		th2.start();
	}

}

class Thread1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++)
			System.out.print('-');
	}
}

class Thread2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++)
			System.out.print('|');
	}
}