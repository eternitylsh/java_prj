

package test_ch;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("ASCII로 바꿀 알파벳 입력: ");
		String _str = sc.nextLine();
		sc.close();
		
		char _c = _str.charAt(0);
		int ascII = _c;
		
		System.out.printf("해당글자 %s의 ASCII는 %d 이다.", _str, (int)_c);
	}

}
