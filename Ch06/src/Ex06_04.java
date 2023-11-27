
public class Ex06_04 {

	public static void main(String[] args) {
		System.out.println(plus(10,20));
		C o = new C();
		plus(10,20, o);
		System.out.println(o.GetNum());
		
		// ========================================

		MyMath mm = new MyMath();
		
		System.out.println( mm.add(1L, 2L) );
		System.out.println( mm.substract(2L, 1L) );
	}
	
	static int plus(int a, int b) {
		int result;
		result = a + b;
		return result;
	}
	
	static void plus(int a, int b, C c) {
		c.SetNum( a + b );
		System.out.println(c.GetNum());
	}
}

class C {
	int num;
	void SetNum(int __c) {
		this.num = __c;
	}
	int GetNum() {
		return this.num;
	}
}

class MyMath{
	long add(long a, long b) {
		return a + b;
	}
	
	long substract(long a, long b) {
		return a - b;
	}
}
