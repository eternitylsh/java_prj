import java.util.Scanner;

public class Ex02_01 {

	public static void main(String[] args) {
		
//		int a = 10;
//		long l = 1000000000;
//		byte by = 10; // 아진 전문...
//		char c = 'c';
//		boolean b = true;
//		String str = "Hello Java!";
//		
//		System.out.printf("%s %s %c %d %b", str, args[0], c, a, b);
		
//		int score = 100;
//		score = 200;
		
//		int x, y;
//		x = 5; y = 10;
//		
//		System.out.println( x + y );
//		System.out.println( x - y );
//		System.out.println( x * y );
//		System.out.println( x / y );
		
//		final int x = 100;
//		// x = 200; // can't
//		int x1 = 200;
//		double pi = 3.14;
//		char ch = 'a';
//		String str = "abc";
//		
//		System.out.println(x);
//		System.out.println(x1);
//		System.out.println(pi);
//		System.out.println(ch);
//		System.out.println(str);
		
//		String name = "Ja" + "va";
//		String str = name + " " + 8.0;
//		
//		System.out.println(name);
//		System.out.println(str);
//		System.out.println(7 + " ");
//		System.out.println(" " + 7);
//		System.out.println("" + 7);
//		System.out.println(7 + "");
//		System.out.println("" + "");
//		System.out.println(7 + 7 + "");
//		System.out.println("" + 7 + 7);
		
		int x = 10, y = 20;
		System.out.printf("x = %d, y = %d\n", x, y);
		x = y;
		y = x; // norp...
		System.out.printf("x = %d, y = %d norp!! \n", x, y);
		// 3단 논법을 써야..
		x = 10; y = 20;
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("x = %d, y = %d ok! \n", x, y);
		
		x = 10; y = 20;
		IntC x1 = new IntC(x);
		IntC y1 = new IntC(y);
		Swap(x1, y1);
		System.out.printf("x = %d, y = %d Swap func with Class ok! \n", x1.GetVal(), y1.GetVal());
		
		// ===============================================================
		
//		int age = 14;
//		int year = 2023;
//		
//		System.out.printf("나이 : %d \n년도 : %d", age, year);
		
		// ===============================================================
		
//		String url = "www.daum.net";
//		float f1 = .10f; // 소수점 6자리 까지 가능.
//		double d = 1.23456789;
//		System.out.printf("f1 = %4.2f, %e, %g \n", f1, f1, f1);
//		System.out.printf("d = %4.10f, %e, %g \n", d, d, d);
//		System.out.printf("%s\n", url);
//		System.out.printf("%20s\n", url);
//		System.out.printf("%-20scheck\n", url);
		
		// ===============================================================
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("두자리 정수 입력1 : ");
		num1 = sc.nextInt();
		System.out.printf("두자리 정수 입력1 : ");
		num2 = sc.nextInt();
		
		System.out.printf("입력된 숫자들의 합은 %d + %d = %d 입니다.\n", num1, num2, num1 + num2);
		System.out.printf("만일 하나씩 다 더하는 숫자들의 합은 %d 입니다.\n", AreaSum(num1, num2));
		
		// 나머지 뺄셈, 곱셈, 나눗셈은 생략...
		
		
	}
	
	static void Swap( IntC x1, IntC x2 ) {
		// 여기서 바꿀경우 Class로 바꿔야함.
		System.out.println("Swap 진행중..");
		int temp = x1.GetVal();
		x1.SetVal(x2.GetVal());
		x2.SetVal(temp);
	}
	
	static Integer AreaSum(int num1, int num2) {
		int sum = 0;
		
		for(int i = num1; num2 >= i; i++) {
			sum += i;
		}
			
		
		return sum;
	}

}

class IntC {
	private Integer val;
	
	public IntC(int x) {
		this.val = x;
	}
	
	public void SetVal( int x ) {
		this.val = x;
	}
	
	public Integer GetVal() { return this.val; }
}


