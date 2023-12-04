package test_ch;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("윤년 확인할 연도 입력: ");
		int year = sc.nextInt();
		sc.close();
		
		String res = "윤년이 아닙니다.";
		
		if( 0 == year % 4 ) {
			if( 0 != year % 100 ) {
				res = "윤년입니다.";
			}
		}
		
		if( 0 == year % 400 ) {
			res = "윤년입니다.";
		}
		
		System.out.printf("해당연도 %d는 %s", year, res);
	}

}
