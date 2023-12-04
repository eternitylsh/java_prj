
class Shape {
	String color = "blue";
	
	void draw() {
		
	}
}

class Point {
	int x, y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle extends Shape {
	Point center;
	int rad;
	
	Circle() {
		this(new Point(0, 0), 0);
	}
	
	Circle( int r ) {
		this(new Point(0, 0), r);
	}
	
	Circle( Point center ) {
		this(center, 0);
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.rad = r;
	}
	
	Circle(Point center, int r, String __c) {
		this(center, r);
		this.color = __c;
	}
}


public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 그런데 이 방식은 지저분함.. 쓸데없는 객체생성.. 메모리 낭비..
		// 그렇다고 중복상속은 불가.
		// 그래서 interface라는 개념이 등장.
		
		Circle __c = new Circle();
		System.out.printf( "중심점은 (%d, %d) 반지름은 : %d, 색상은 : %s\n", __c.center.x, __c.center.y, __c.rad, __c.color );
		
		Circle __c1 = new Circle(new Point(150, 150), 15);
		System.out.printf( "중심점은 (%d, %d) 반지름은 : %d, 색상은 : %s\n", __c1.center.x, __c1.center.y, __c1.rad, __c1.color );
		
		Circle __c2 = new Circle(new Point(150, 150), 15, "aqua");
		System.out.printf( "중심점은 (%dc, %d) 반지름은 : %d, 색상은 : %s\n", __c2.center.x, __c2.center.y, __c2.rad, __c2.color );
	}

}
