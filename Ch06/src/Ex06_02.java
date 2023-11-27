

public class Ex06_02 {

	public static void main(String[] args) {
		
		TV[] t = new TV[3];
		t[0] = new TV();
		t[1] = new TV();
		t[2] = new TV();
		
		t[0].ch = 7;
		t[1].channelup();
		t[2].ch = 10;
		
		for (int i = 0; i < t.length; i++) {
			System.out.printf("%d ", t[i].ch);
		}
	}

}

//class Tv{
//	String color;
//	boolean power;
//	int channel;
//	
//	void power() {
//		power = !power;
//	}
//	
//	void channelUp() {
//		++channel;
//	}
//	
//	void channelDown() {
//		--channel;
//	}
//}