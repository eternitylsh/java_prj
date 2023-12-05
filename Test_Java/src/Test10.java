
class Point {
	int x;
	int y;
}

class Circle extends Point {
	int radius;
}


public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle _c = new Circle();
		_c.x = 30;
		_c.y = 45;
		_c.radius = 25;
		
		System.out.printf("해당 도형의 중심점 (%d, %d)이며, 반지름이 %d인 원이다.", _c.x, _c.y, _c.radius);
	}

}
