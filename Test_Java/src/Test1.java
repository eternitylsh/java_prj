import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("변환할 영문자 입력 : ");
		String _str = sc.nextLine();
		sc.close();
		
		int ascII = (int)_str.charAt(0);
		
		System.out.printf("입력한 영문자 %s의 아스키코드는 %d 이다.", _str, ascII);
	}

}
