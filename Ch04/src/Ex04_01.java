import java.util.Scanner;

public class Ex04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("점수 입력 : ");
//		int score = sc.nextInt();
//		
//		if ( 60 <= score ) {
//			System.out.printf("합격입니다.");
//		} else {
//			System.out.printf("불합격입니다.");
//		}
		
		// ======================================
		
//		if ( 0 == score % 2 ) {
//			System.out.printf("%d은(는) 짝수입니다.", score);
//		} else {
//			System.out.printf("%d은(는) 홀수입니다.", score);
//		}
		
		// ======================================
		
//		String str = "abc";
//		char ch = ' ';
//		
//		if(  ' ' == ch || '\t' == ch  ) {
//			System.out.printf("%c", ch);
//			
//			if( '\t' == ch ) {
//				System.out.printf(",\t, ");
//			} else {
//				System.out.printf(", ");
//			}
//		}
//		
//		if ( str.equals("abc") ) {
//			System.out.printf("%s", str);
//		} else {
//			System.out.printf("abc가 아닙니다.");
//		}
		
		// ======================================
//		System.out.printf("윤년인지 아닌지 검증하겠습니다. 년도 입력 : ");
//		int year = sc.nextInt();
//		boolean t_year = false; 
//		
//		if ( 0 == year % 4 ) {
//			if( 0 != year % 100 ) {
//				t_year = true;
//			}
//		}
//		// ||
//		
//		if( 0 == year % 400  ) {
//			t_year = true;
//		}
//		
//		if( t_year ) {
//			System.out.printf("%d년은 윤년입니다.", year);
//		} else {
//			System.out.printf("%d년은 평년입니다.", year);
//		}
		
		// =======================================
		
//		int score;
//		String grade = null;
//		
//		System.out.printf("점수를 입력하세요. : ");
//		score = sc.nextInt();
//		
//		if( 90 <= score ) {
//			grade = "A";
//		} else if ( 80 < score && 90 >= score  ) {
//			grade = "B";
//		} else if ( 70 < score && 80 >= score  ) {
//			grade = "C";
//		} else {
//			grade = "D";
//		}
//		
//		int one_score = score % 10;
//		
//		if( 5 < one_score ) {
//			grade += "+";
//		} else {
//			grade += "-";
//		}
//		
//		System.out.printf("당신의 점수는 %d이며, 학점은 %s입니다.\n", score, grade);
		
		// =======================================
		
//		System.out.printf("해당 월을 입력해주세요. : ");
//		int month = sc.nextInt();
		
//		switch (month) {
//		case 3: case 4: case 5:
//			System.out.printf("%d월은 봄입니다.", month);
//			break;
//		case 6: case 7: case 8:
//			System.out.printf("%d월은 여름입니다.", month);
//			break;
//		case 9: case 10: case 11:
//			System.out.printf("%d월은 가을입니다.", month);
//			break;
//		case 12: case 1: case 2:
//			System.out.printf("%d월은 겨울입니다.", month);
//			break;
//			default:
//				System.out.printf("입력값을 제대로 입력해주세요.(1-12사이의 수만..)");
//				break;
//		}
		
		
		
//		if( !QuaterMonth(month) ) {
//			System.out.printf("입력값을 제대로 입력해주세요.(1-12사이의 수만..)");
//		}
		
		
		// =======================================
		
//		System.out.printf("구할려는 랜덤한 임의의 수를 입력해주세요. : ");
//		int num = sc.nextInt();
//		num = GetRand(num);
//		System.out.printf("발생 된 수 : %d -----", num);
		
		// =======================================
		
//		copyOutput(3);
//		FiveOutput();
		
		// Sum_Output();
		
//		System.out.printf("입력된 숫자의 합구하기 숫자 입력 : ");
//		int num = sc.nextInt();
//		System.out.printf("입력된 %d값은 1부터 총합은 '%d'이다.", num, GetSum(num));
		
		System.out.printf("입력된 숫자를 어떻게 구할지 인수를 입력하시오. (0. 홀수, 1. 짝수, 2. 모두) : ");
		int __f = sc.nextInt();
		
		System.out.printf("입력된 숫자의 합구하기 숫자 입력 : 최소값은?");
		int num1 = sc.nextInt();
		
		System.out.printf("입력된 숫자의 합구하기 숫자 입력 : 최대값은?");
		int num2 = sc.nextInt();
		
		// flag..
		// 0: 홀수.
		// 1: 짝수.
		
		// System.out.printf("입력된 %d값은 %d부터 총합은 '%d'이다.", num1, num2, GetSum(num1, num2));
		System.out.printf("입력된 %d값은 %d부터 해당하는 조건의 총합은 '%d'이다.", num1, num2, GetSum(num1, num2, __f));
	}
	
	static int GetSum(int min, int max, int flag) {
		int sum = 0;
		
		if( 1 == flag ) {
			// 짝수.
			for(int i = min; i <= max; i++ ) {
				if( 0 == i % 2  )
					sum += i;
			}
		} else if ( 2 == flag ) {
			// 전부.
			for(int i = min; i <= max; i++ ) {
				sum += i;
			}
		} else if( 0 == flag) {
			// 홀수.
			for(int i = min; i <= max; i++ ) {
				if( 0 != i % 2  )
					sum += i;
			}
		} else {}
		
		return sum;
	}
	
	static int GetSum(int maxnum) {
		int sum = 0;
		
		for(int i = 1; i <= maxnum; i++ ) {
			sum += i;
		}
		
		return sum;
	}
	
	static void Sum_Output() {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++ ) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	static void copyOutput(int count) {
		for ( int i = 0; i < count; i++) {
			System.out.printf("Hello World!!\n");
		}
	}
	
	static void FiveOutput() {
		int i = 0;
		for(i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		for(i = 0; i <= 5; i++) {
			System.out.print(i);
		}
	}
	
	static int GetRand(int inum) {
		return (int)(Math.random() * (inum - 1)) + 1 + 1;
	}
	
	static boolean QuaterMonth( int month ) {
		if( 3 <= month ) {
			if( 5 >= month ) {
				System.out.printf("%d월은 봄입니다.", month);
				return true;
			}
				
		}
		
		if( 6 <= month ) {
			if( 8 >= month ) {
				System.out.printf("%d월은 여름입니다.", month);
				return true;
			}
				
		}
		
		if( 6 <= month ) {
			if( 8 >= month ) {
				System.out.printf("%d월은 가을입니다.", month);
				return true;
			}
				
		}
		
		if( 12 == month || 1 < month ) {
			if( 2 >= month ) {
				System.out.printf("%d월은 겨울입니다.", month);
				return true;
			}
				
		}
		
		return false;
	}

}
