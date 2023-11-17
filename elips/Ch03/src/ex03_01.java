import java.util.Scanner;

public class ex03_01 {
	public static void main(String[] args) {
//		int x, y;
//		x = y = 3;
//		
//		System.out.printf("x = %d\n", x);
//		System.out.printf("y = %d\n", y);
//		System.out.printf("x == y : %b \n", x == y);
//		System.out.printf("x > y && x < y : %s \n", x > y && x < y);
//		System.out.printf("x > y && x < y || x == y : %s \n", x > y && x < y || x == y);
//		
//		x++;
//		System.out.printf("x = %d \n", x);
//		x--;
//		System.out.printf("x = %d \n", x);
//		
//		int i = 5, j = 0;
//		j = i++;
//		System.out.printf("i = %d, j = %d \n", i, j);
//		
//		i = 5; j = 0;
//		j = ++i;
//		System.out.printf("i = %d, j = %d \n", i, j);
//		
//		i = 5; j = 5;
//		System.out.println(i++);
//		System.out.println(++j);
//		System.out.println(i);
//		System.out.println(j);
//		
//		System.out.println(!(3<4));
		
		// =============================================================
		
//		double d = 85.4;
//		int score = (int)d;
//		char ch = 97;
//		
//		System.out.println(score);
//		System.out.println(d);
//		
//		System.out.println(ch);
//		System.out.printf("%d",(int)ch);
		
		// =============================================================
		
//		int a = 10;
//		int b = 4;
//		
//		System.out.printf("%d + %d = %d \n", a, b, (a + b));
//		System.out.printf("%d - %d = %d \n", a, b, (a - b));
//		System.out.printf("%d * %d = %d \n", a, b, (a * b));
//		System.out.printf("%d / %d = %d \n", a, b, (a / b));
//		System.out.printf("%d %% %d = %d \n", a, b, (a % b));
//		System.out.printf("%d / %f = %f \n", a, (float)b, (a / (float)b));
		
		// =============================================================
		// 쉬프트로 이전하면 2제곱한 2를 곱한거와 같다.
//		int a = 10;
//		int b = a;
//		
//		System.out.printf("%d \n", a);
//		for( int i = 0; i < a; i++) {
//			System.out.printf("%d \t %d \n", b << i, i);
//		}
		
		/*
		 *  10 	 	 0 
			20 	 	 1 
			40 	 	 2 
			80 	 	 3 
			160 	 4 
			320 	 5 
			640 	 6 
			1280 	 7 
			2560 	 8 
			5120 	 9 
		*/
		
		//
		
		// =============================================================
		
		
//		String str1 = "abc";
//		String str2 = new String(str1);
//		
//		System.out.printf("%b\n", "abc" == "abc");
//		System.out.printf("%b\n", str1 == str2);
//		
//		System.out.println();
//		
//		System.out.printf("%s %s\n", str1, System.identityHashCode(str1));
//		System.out.printf("%s %s\n", str2, System.identityHashCode(str2));
//		
//		System.out.println();
//		
//		System.out.printf("%b\n", str1 == "abc");
//		System.out.printf("%b\n", str2 == "abc");
//		
//		System.out.println();
//		
//		System.out.printf("%b\n", str1.equals("abc"));
//		System.out.printf("%b\n", str2.equals("abc"));
//		System.out.printf("%b\n", str1.equals(str2));
		
		
		// =============================================================
		
//		Scanner sc = new Scanner(System.in);
//		
//		char ch = ' ';
//		System.out.print("문자 입력하시오 : ");
//		String in_str = sc.nextLine();
//		ch = in_str.charAt(0);
//		
//		System.out.printf("%c\n", ch);
//		
//		if(ch >= '0' && ch <= '9') 
//			System.out.printf("입력하신 %c은(는) 숫자이고 아스키코드는 %d입니다. \n", ch, (int)ch);
//		
//		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//			System.out.printf("입력하신 %c은(는) 알파벳이고 아스키코드는 %d입니다. \n", ch, (int)ch);
//		}
		
		// =============================================================
		
//		int x = -10;
//		int x1 = (x >= 0) ? x : -x;
		
		int x = 10;
		x = x + 1;
		
		System.out.printf("%d \n", x);
		
		x += 1;
		
		System.out.printf("%d \n", x);
	}
	
//	static float funcPlay( int a, char __op, int b ) {
//		
//		
//		return 0;
//	}
}
