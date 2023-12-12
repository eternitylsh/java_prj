package ls_pack;

@FunctionalInterface
interface Myfunc {
	void run();
}

public class Ex14_01 {
	
	static void execute(Myfunc f) {
		f.run();
	}
	
	static Myfunc getMyFunc() {
		Myfunc f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myfunc f1 = () -> System.out.println("f1.run()");
		
		Myfunc f2 = new Myfunc() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		Myfunc f3 = getMyFunc();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()") );
	}

}
