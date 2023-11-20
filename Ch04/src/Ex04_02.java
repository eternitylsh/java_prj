import java.util.Scanner;

public class Ex04_02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		// ex04-01 이미 다 있는 내용.. 그냥 대충 따라하기.
//		int sum = 0;
//		
//		int src = 0, dst = 0, add = 0;
//		System.out.printf("합계 계산 시작수 입력: ");
//		src = sc.nextInt();
//		System.out.printf("합계 계산 마지막수 입력: ");
//		dst = sc.nextInt();
//		System.out.printf("증가하는 수의 입력 : ");
//		add = sc.nextInt();
//		
//		for (int i = src; i <= dst; i += add) {
//			sum += i;
//		}
//		
//		System.out.printf("%d\n", sum);
		
		// ====================================================
		
//		System.out.printf("입력된 숫자를 어떻게 구할지 인수를 입력하시오. (0. 홀수, 1. 짝수, 2. 모두) : ");
//		int __f = sc.nextInt();
//		
//		System.out.printf("입력된 숫자의 합구하기 숫자 입력 : 최소값은?");
//		int num1 = sc.nextInt();
//		
//		System.out.printf("입력된 숫자의 합구하기 숫자 입력 : 최대값은?");
//		int num2 = sc.nextInt();
//		
//		// flag..
//		// 0: 홀수.
//		// 1: 짝수.
//		
//		// System.out.printf("입력된 %d값은 %d부터 총합은 '%d'이다.", num1, num2, GetSum(num1, num2));
//		System.out.printf("입력된 %d값은 %d부터 해당하는 조건의 총합은 '%d'이다.", num1, num2, GetSum(num1, num2, __f));
		
		// ====================================================
		
//		String _str = "";
//		
//		for( int i = 0; i < 5; i++ ) {
//			for( int j = 0; j < 10; j++ ) {
//				_str += "✨";
//			}
//			_str += "\n";
//		}
//		
//		System.out.printf(_str);
		
		// ====================================================
		
//		System.out.printf("구구단 출력할 최소값입력 : ");
//		int min = sc.nextInt();
//		
//		System.out.printf("구구단 출력할 최대값입력 : ");
//		int max = sc.nextInt();
//		
//		System.out.println("아래 입력한 구구단들을 출력합니다.");
//		System.out.printf("%s", StrDan(min, max));
		
		// ====================================================
		
//		int i = 0;
//		
//		while( 5 > ++i ) {
//			System.out.println(i + "-- I can do it.");
//		}
		
		// ====================================================
		
//		int input = 0, answer = 0;
//		
//		if( 2 <= args.length ) {
//			int min = Integer.parseInt(args[0]);
//			int max = Integer.parseInt(args[1]);
//			
//			answer = GetR_Num( min, max );
//			
//			
//			do {
//				System.out.print( "1과 100사이의 정수를 입력하세요. " );
//				input = sc.nextInt();
//			} while( CheckAns( input, answer ) );
//			
//			System.out.println("축하드립니다 정답입니다.");
//		} else {
//			// System.out.printf("최소 최대 인수를 입력하세요. %s", args);
//			System.out.println(args.length);
//			System.out.println(args);
//		}
		
		// ====================================================
		
		int menu = 0;
		int num = 0;
		
		// inf
		while(true) {
			System.out.println("(1) Square.");
			System.out.println("(2) square root.");
			System.out.println("(3) log.");
			System.out.print("원하는 메뉴 (1-3)을 선택하세요.(종료: 0) :: ");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if( 0 == menu ) {
				System.out.println("프로그램 종료.");
				break;
			}
			
			if( 1 <= menu && 3 >= menu ) {
				System.out.printf("선택하신 메뉴는 %d 번 입니다.\n", menu);
			} else {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료: 0)");
				continue;
			}
		}
		
	}

	static boolean CheckAns(int in_num, int answer) {
		if( answer > in_num ) {
			System.out.println("더 작다.");
		} else if ( answer < in_num ) {
			System.out.println("더 크다.");
		}
		
		return (in_num != answer);
	}
	
	static int GetR_Num( int min, int max ) {
		return (int)( Math.random() * ( max - min ) ) + ( min  + 1 );
	}
	
	static String StrDan(int __min, int __max) {
		
		String _str = "";
		
		for( int i = 1; i < 10; i++ ) {
			for( int j = __min; j <= __max; j++) {
				_str += ( Integer.toString(j) + " X " + Integer.toString(i) + " = " + Integer.toString(j * i) );
				_str += "\t";
			}
			_str += "\n";
		}
		
		return _str;
	}
	
//	static int GetSum(int min, int max, int flag) {
//		int sum = 0;
//		
//		if( 1 == flag ) {
//			// 짝수.
//			for(int i = min; i <= max; i++ ) {
//				if( 0 == i % 2  )
//					sum += i;
//			}
//		} else if ( 2 == flag ) {
//			// 전부.
//			for(int i = min; i <= max; i++ ) {
//				sum += i;
//			}
//		} else if( 0 == flag) {
//			// 홀수.
//			for(int i = min; i <= max; i++ ) {
//				if( 0 != i % 2  )
//					sum += i;
//			}
//		} else {}
//		
//		return sum;
//	}

}

