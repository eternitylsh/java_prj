import java.util.Calendar;

public class Ex10_01 {

	static String[] DoW = {
			"SUN",
			"MON",
			"TUE",
			"WED",
			"THU",
			"FRI",
			"SAT",
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar today = Calendar.getInstance();
//		System.out.println(today);
//		System.out.printf("%d.%d.%d :: %s :: %d:%d:%d\n", 
//				today.get(Calendar.YEAR),
//				today.get(Calendar.MONTH) + 1,
//				today.get(Calendar.DATE),
//				GetDayofWeek(today.get(Calendar.DAY_OF_WEEK) - 1),
//				today.get(Calendar.HOUR),
//				today.get(Calendar.MINUTE),
//				today.get(Calendar.SECOND)
//		);
		
		if( args.length != 2 ) {
			System.out.println("Usage : ");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		int i, n = 0;
		
		// System.out.printf("%d.%d", year, month);
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year,  month - 1, 1);
		eDay.set(year,  month, 1);
		eDay.add(Calendar.DATE, -1);
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		String _res = "";
		
		_res += ( "          " + args[0] + "년 " + args[1] + "월\n" );
		
		for( i = 0; i < DoW.length; i++ ) {
			_res += " " + DoW[i];
		}
		_res += "\n";
		
		for( i = 1; i < START_DAY_OF_WEEK; i++ ) {
			_res += "    ";
		}
		
		for( i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			_res +=( (10 > i) ? "   " + i : "  " + i );
			if( 0 == n % 7 )
				_res+= "\n";
		}
		
		System.out.printf("%s", _res);
	}
	
	static String GetDayofWeek( int DoW ) {
		return Ex10_01.DoW[DoW];
	}
}
