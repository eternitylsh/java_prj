import javax.swing.JOptionPane;


class Thread3 extends Thread {
	public void run() {
		for( int i = 10; i > 0; i-- ) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch( Exception e ) {
				System.out.printf("%s", e);
			}
		}
	}
}

public class Ex13_03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread3 th3 = new Thread3();
		th3.start();
		
		String input = JOptionPane.showInputDialog("값 입력 : ");
		
		if( null == input ) {
			System.out.printf("값입력이 %s이기에 종료합니다.\n", input);
		}
		
		System.out.println("입력하신 값은 " + input + "입니다.");

		// 입력이 끝날때까지 숫자세는 작업은 나오지 않는다;;; 단일 쓰레드만의 작업의 한계.
		// 이럴때 멀티쓰레드를 사용해야.
//		for( int i = 10; i > 0; i-- ) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch( Exception e ) {
//				System.out.printf("%s", e);
//			}
//		}
	}
}
