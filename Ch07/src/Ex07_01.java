
class TV{
	boolean pow;
	int ch;
	
	TV() {
		pow = false;
		ch = 0;
	}
	
	void Switch() {
		pow = !pow;
	}
	
	void chUp() 	{ ++ch; }
	void chDown()	{ --ch; }
	
}

class SmartTV extends TV {
	boolean cap;
	
	void displayCap(String text) {
		if( cap ) {
			System.out.printf("%s", text);
		}
	}
}

class JokerTV extends TV {
	int jmax;
	
	JokerTV() {
		this.jmax = 10;
	}
	
	JokerTV(int setmax) {
		this.jmax = setmax;
	}
	
	void SetRandCh() {
		this.ch = (int)(Math.random() * 10) + 1; 
	}
}

public class Ex07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV stv = new SmartTV();
		stv.ch = 10;
		stv.chUp();
		System.out.printf("ch : %d\n", stv.ch);
		
		stv.displayCap("Hello World\n");
		stv.cap = true;
		stv.displayCap("Hello World\n");
		
		JokerTV jtv = new JokerTV(15);
		jtv.SetRandCh();
		System.out.printf("get rand ch: %d", jtv.ch);
	}

}
