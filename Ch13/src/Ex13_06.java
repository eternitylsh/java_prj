import java.util.ArrayList;

class Table {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		while( this.MAX_FOOD <= dishes.size() ) {
			String name = Thread.currentThread().getName();
			System.out.printf("%s is waiting.\n");
			try {
				wait();
				Thread.sleep(500);
			} catch ( InterruptedException e ) {
				System.out.printf("%s\n", e);
			}
		}
		dishes.add(dish);
		notify();
		System.out.printf("Dishes: %s\n", dishes.toString());
	}
	
	public void remove(String dishName) {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			
			while( 0 == dishes.size() ) {
				System.out.printf("%s is waiting.\n", name);
				try {
					wait();
					Thread.sleep(500);
				} catch ( InterruptedException e ) {
					System.out.printf("%s\n", e);
				}
			}
			int i = 0;
			
			while(true) {
				for( i = 0; i < dishes.size(); i++ ) {
					if( dishName.equals(dishes.get(i)) ) {
						dishes.remove(i);
						notify();
						return;
					}
				}
				
				System.out.printf("%s is waiting.\n", name);
				try {
					wait();
					Thread.sleep(500);
				} catch ( InterruptedException e ) {
					System.out.printf("%s\n", e);
				}
			}
		}
	}
	
	public int dishNum() { return dishNames.length; }
}

class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}  catch ( InterruptedException e ) {
				System.out.printf("%s\n", e);
			}
			
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.printf("%s ate a %s\n", name, food);
		}
	}
}

class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) { this.table = table; }
	
	public void run() {
		int idx;
		while(true) {
			idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {
				Thread.sleep(100);
			}  catch ( InterruptedException e ) {
				System.out.printf("%s\n", e);
			}
		}
	}
}

public class Ex13_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Table table = new Table();
		
		new Thread(new Cook(table), "COOK").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		Thread.sleep(2000);
		System.exit(0);
	}

}
