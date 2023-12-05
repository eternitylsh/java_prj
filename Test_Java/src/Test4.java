
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int src = 1, dst = 9;
		String _res = "구구단 출력하기\n";
		int i = 0;
		
		// 한 라인에 5단씩 출력.
		int nextline = (dst - src) / 5, nowline = 0;
		int lsrc, ldst = 0;
		
		while( nextline >= nowline ) {
			lsrc = src + ( nowline * 5 );
			ldst = src + ( (nowline + 1) * 5 );
			for( i = lsrc; i < ldst; i++ ) {
				if( dst < i ) continue;
				_res += ("   " + i + "단\t\t" );
			}
			
			_res += "\n";
			
			for( int j = 1; j < 10; j++ ) {
				for( i = lsrc; i < ldst; i++ ) {
					if( dst < i ) continue;
					_res += ( i + " * " + j + " = " + (i * j) + "\t" );
				}
				_res += "\n";
			}
			_res += "\n";
			nowline++;
		}
		
		System.out.printf("%s", _res);
	}

}
