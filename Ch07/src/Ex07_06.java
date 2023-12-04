
interface UnitNational {
	static final int H_UNITED = 0;
	static final int EMPEROR = 1;
	static final int SPACEUNITED = 2;
	static final int MACHINESKY = 3;
}

abstract class Unit implements UnitNational{
	int x, y;
	int UnitN_type;
	abstract void move(int x, int y);
	void stop() {};
}

class Human extends Unit {
	Human() {
		this(H_UNITED);
	}
	
	Human(int type) {
		UnitN_type = type;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Human";
	}
	
	void Charge() {};
}

class Cannon extends Unit {
	
	Cannon() {
		this(EMPEROR);
	}
	
	Cannon(int type) {
		UnitN_type = type;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Cannon";
	}
	
	void ShootAttack() {};
}

class MoveShip extends Unit {
	
	MoveShip() {
		this(MACHINESKY);
	}
	
	MoveShip(int type) {
		UnitN_type = type;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "MoveShip";
	}
	
	void load() {}
	void unload() {}
}

public class Ex07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Human _h = new Human();
//		_h.move(15, 30);
//		System.out.printf("이 유닛 %s는(은) (%d, %d)로 이동.", _h, _h.x, _h.y );
		
		// 다형성에 따라...
		Unit[] group = { new Human(), new Cannon(), new MoveShip() };
		
		Unit auto;
		
		for( int i = 0; i < group.length; i++ ) {
			auto = group[i];
			auto.move(10, 20);
			System.out.printf("이 유닛 %s는(은) (%d, %d)로 이동.\n", auto, auto.x, auto.y );
		}
	}
}
