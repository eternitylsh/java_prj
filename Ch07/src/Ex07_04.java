
class Time{
	private int hour;
	private int min;
	private int sec;
	
	Time() {
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}
	
	Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	private boolean checkinput_H(int __val) {
		if ( 0 > __val )
			return false;
		if ( 23 < __val )
			return false;
		return true;
	}
	
	private boolean checkinput_M_S(int __val) {
		if ( 0 > __val )
			return false;
		if ( 59 < __val )
			return false;
		return true;
	}

	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if( checkinput_H(hour) )
			this.hour = hour;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if( checkinput_M_S(min) )
			this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		if( checkinput_M_S(sec) )
			this.sec = sec;
	}
}

public class Ex07_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time _t = new Time(3, 43, 20);
		System.out.printf("now (%d : %d : %d)\n", _t.getHour(), _t.getMin(), _t.getSec());
		// System.out.printf("now (%d : %d : %d)\n", _t.hour, _t.min, _t.sec); // error
		
		_t.setHour(50);  // 적용안됨.
		_t.setMin(-25);  // 적용안됨.
		_t.setSec(55);   // ok!
		
		System.out.printf("now (%d : %d : %d)\n", _t.getHour(), _t.getMin(), _t.getSec());
	}

}
