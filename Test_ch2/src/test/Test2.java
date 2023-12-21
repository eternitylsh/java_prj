package test;

public class Test2 {
	public static void main(String[] args) {
		Thread_Ex01 th01 = new Thread_Ex01();
		Thread_Ex02 th02 = new Thread_Ex02();
		
		th01.start();
		th02.start();
	}
}

class Thread_Ex01 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class Thread_Ex02 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}