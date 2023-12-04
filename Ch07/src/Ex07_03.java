import java.util.Scanner;
import java.util.*;

class Parent {
	int x;
	
	Parent() {
		this.x = 10; 
	}
}

class Child extends Parent {
	int x;
	int y;
	
	Child() {
		super();
		this.x = 20;
		this.y = 15;
	}
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

class Point1 {
	final int x;
	int y;
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point1 {
	int z;
	
	Point3D(int x, int y) {
		super(x, y);
		int z = 0;
	}
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}

public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Child fc = new Child();
//		fc.method();
		
		// =================================
		
		Point3D p3 = new Point3D(3, 6, 9); // final 이라도 초기값 정의정도는 됨. 하지만 딱 한번뿐임.
		// p3.x = 10;
		System.out.printf( "p3 point : (%d, %d, %d)", p3.x, p3.y, p3.z );
		
		// =================================
		
		
	}

}

