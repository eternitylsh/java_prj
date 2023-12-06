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
		int STATE_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		// System.out.printf("%d.%d", year, month);
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year,  month - 1, 1);
		eDay.set(year,  month, 1);
		eDay.add(Calendar.DATE, -1);
	}
	
	static String GetDayofWeek( int DoW ) {
		return Ex10_01.DoW[DoW];
	}
}
