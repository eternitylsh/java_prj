
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 t1 = new Test7();
		t1.speed = 100;
		t1.color = "yellow";
		
		System.out.printf("객체 t1의 speed는 %d, color는 %s 이다.\n", t1.speed, t1.color);
		
		t1.speedUp(10);
		System.out.printf("객체 t1의 speed는 %d, color는 %s 이다.\n", t1.speed, t1.color);
		
		Test7 t2 = new Test7();
		t2.speed = 50;
		t2.color = "red";
		
		System.out.printf("객체 t2의 speed는 %d, color는 %s 이다.\n", t2.speed, t2.color);
		
		t2.speedDown(10);
		System.out.printf("객체 t2의 speed는 %d, color는 %s 이다.\n", t2.speed, t2.color);
	}

}
