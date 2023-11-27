
class MyMath3 {
	int add(int a, int b) {
		return a + b;
	}
	long add(int a, long b) {
		return a + b;
	}
	int add(int[] a) {
		int res = 0;
		
		for ( int i = 0; i < a.length; i++ ) {
			res += a[i];
		}
		
		return res; 
	}
}

public class Ex06_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath3 mm3 = new MyMath3();
		
		System.out.println(mm3.add(3, 3));
		System.out.println(mm3.add(3, 3L));
		int[] aa = {1, 2, 3, 4, 5};
		System.out.println(mm3.add(aa));
	}

}
