import java.util.Arrays;
import java.util.Scanner;

public class Ex05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] score = {
//				{100, 90, 80},
//				{90, 90, 80},
//				{40, 80, 80},
//				{70, 90, 70},
//		};
//		
//		System.out.printf("score 2차원 배열 {\n");
//		for( int i = 0; i < score.length; i++ ) {
//			System.out.printf("%s\n", Arrays.toString(score[i]));
//		}
//		System.out.printf("}\n");
		
		// ===============================================
		
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"},
		};
		
		String ans;
		
		Scanner sc = new Scanner(System.in, "euc-kr");
		
		String[] temp;
		
		for( int i = 0; i < words.length; i++) {
			temp = words[i];
			System.out.printf("%s의 뜻은 : ", temp[0]);
			ans = sc.nextLine();
			
			System.out.printf("입력한 값은 : %s 입니다.\n", ans);
			if( temp[1].equals(ans) )
				System.out.printf("정답입니다.\n");
			else
				System.out.printf("오답입니다.\n");
		}
	};

}
