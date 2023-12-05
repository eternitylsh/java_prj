import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int src = 1, dst = 9;
		
		int src, dst;
		int maxnum = 10;
		int d_line = 5;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("구구단 시작단 : ");
		src = sc.nextInt();
		System.out.printf("구구단 끝단 : ");
		dst = sc.nextInt();
		sc.close();
		
		int[][] ggarr = new int[(dst - src) + 1][maxnum - 1];
		int i = 0, j = 0;
		
		
		for(i = 0; i < (dst - src) + 1; i++) {
			for( j = 0; j < maxnum - 1; j++ ) {
				ggarr[i][j] = ((i + 1) * (j + 1));
			}
		}
		
		String _res = "입력된 구구단 출력하기\n";
		
		// 한 라인에 5단씩 출력.
		int nextline = (dst - src) / d_line, nowline = 0;
		int lsrc, ldst = 0;
		
		while( nextline >= nowline ) {
			lsrc = src + ( nowline * d_line );
			ldst = src + ( (nowline + 1) * d_line );
			for( i = lsrc; i < ldst; i++ ) {
				if( dst < i ) continue;
				_res += ("   " + i + "단\t\t" );
			}
			
			_res += "\n";
			
			for( j = 0; j < maxnum - 1; j++ ) {
				for( i = 0; i < (ldst - lsrc); i++ ) {
					if( dst < (i + lsrc) ) continue;
					_res += ( (i + lsrc) + " * " + (j + 1) + " = " + ggarr[i + lsrc - 1][j] + "\t" );
				}
				_res += "\n";
			}
			_res += "\n";
			nowline++;
		}
		
		System.out.printf("%s", _res);
	}

}
