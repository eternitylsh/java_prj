package test_ch;

class Car extends Object {
	static int speed = 0;
	String color;
	String name;
	
	Car(String __n) {
		this.name = __n;
	}
	
	public void speedUp( int __sp ) {
		Car.speed += __sp;
	}
	
	public void speedDown(int __sp) {
		Car.speed -= __sp;
	}
	
	public String toString() {
		return this.name;
	}
}

// 8문제 포함. 아래가 8번째 문제 위 클래스 형성이 7번문제.
public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car _c1 = new Car("c1");
		_c1.color = "aqua";
		
		_c1.speedUp(10);
		System.out.printf("현재 %s차의 색상과 속도 : %s, %d\n", _c1, _c1.color, _c1.speed);
		
		_c1.speedDown(5);
		System.out.printf("현재 %s차의 색상과 속도 : %s, %d\n", _c1, _c1.color, _c1.speed);
		
		Car _c2 = new Car("c2");
		_c2.color = "orange";
		
		_c2.speedUp(10);
		System.out.printf("현재 %s차의 색상과 속도 : %s, %d\n", _c2, _c2.color, _c2.speed);
		
		_c2.speedDown(5);
		System.out.printf("현재 %s차의 색상과 속도 : %s, %d\n", _c2, _c2.color, _c2.speed);
	}

}
