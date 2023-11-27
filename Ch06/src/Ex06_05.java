
class Data {
	int x;
}

public class Ex06_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
		change(d);
		
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
		Data d2 = copy(d);
		System.out.println("d : x = " + d.x);
		System.out.println("d2 : x = " + d2.x);
	}

	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	static void change(Data c) {
		c.x = 1000;
		System.out.println("change() : d.x = " + c.x);
	}
	
	static Data copy(Data c) {
		Data tmp = new Data();
		tmp.x = c.x;
		return tmp;
	}
}
