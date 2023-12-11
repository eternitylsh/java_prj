

class Thread0 extends Thread {
	public void run() {
		for( int i = 0; i < 5; i++ ) {
			try {
				// Thread Name.
				System.out.printf("현재 수행중인 쓰레드 : %s\n", getName());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread1 implements Runnable {
	public void run() {
		for( int i = 0; i < 5; i++ ) {
			// Thread Name.
			try {
				System.out.printf("현재 수행중인 쓰레드 : %s\n", Thread.currentThread().getName());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Ex13_01 {
	public static void main(String[] args) {
		Thread0 th1 = new Thread0();
		
		// 이 방법 추천.
		Runnable r = new Thread1();
		Thread th2 = new Thread(r);
		th1.start();
		th2.start();
	}
}
