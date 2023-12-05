import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("윤년확인할 연도 입력 : ");
		int year = sc.nextInt();
		sc.close();
		
		String _res = "윤년이 아닙니다.";
		
		if( 0 == year % 4 ) {
			if( 0 != year % 100  ) {
				_res = "윤년입니다.";
			}
		}
		
		if(0 == year % 400) {
			_res = "윤년입니다.";
		}
		
		System.out.printf("입력한 연도 %d 는 %s\n", year, _res);
	}

}
