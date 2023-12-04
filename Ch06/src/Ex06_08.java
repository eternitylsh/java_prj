
//class Data1 {
//	Data1() {}
//	int val;
//}
//
//class Data2 {
//	int val;
//	
//	Data2(int x) {
//		val = x;
//	}
//}

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		this("white", "auto", 4);
	}
	Car(String color) {
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Ex06_08 {
	
	static int[] arr = new int[10];
	
	static {
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(10);
//		
//		System.out.printf("d1: %d\n", d1.val);
//		System.out.printf("d2: %d\n", d2.val);
		
		// ===========================================
		
//		Car _c = new Car("blue", "1st", 3);
//		Car _c1 = new Car();
//		Car _c2 = new Car("cyan");
//		
//		System.out.printf("이 차의 색상은 %s, 기어타입은 %s, %d개의 문의 특징을 지닌 차다.\n", _c.color, _c.gearType, _c.door);
//		System.out.printf("이 차의 색상은 %s, 기어타입은 %s, %d개의 문의 특징을 지닌 차다.\n", _c1.color, _c1.gearType, _c1.door);
//		System.out.printf("이 차의 색상은 %s, 기어타입은 %s, %d개의 문의 특징을 지닌 차다.\n", _c2.color, _c2.gearType, _c2.door);
		
		// ===========================================
		
		for( int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
		}
		
	}
}