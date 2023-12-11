
class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if( balance >= money ) {
			try {
				Thread.sleep(1000);
			} catch( InterruptedException e ) {
				System.out.println(e);
			}
			this.balance -= money;
		}
	}
}

class RunnablePlayer implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while( 0 < acc.getBalance() ) {
			int money = (int)((Math.random() * (3 - 1)) + (1 + 1)) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}
}

public class Ex13_05  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new RunnablePlayer();
		new Thread(r).start();
		new Thread(r).start();
	}

}
