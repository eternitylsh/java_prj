package test_ch;

class Point {
	int x, y;
}

class Circle extends Point{
	int radius;
}

public class p10 {
	public static void main(String[] args) { 
		Circle c1 = new Circle();
		
		c1.x = 30;
		c1.y = 50;
		c1.radius = 35;
		
		System.out.printf("해당 도형인 원은 중심점 (%d, %d)와 반지름 ( %d )을 가집니다.", c1.x, c1.y, c1.radius);
	}
}
