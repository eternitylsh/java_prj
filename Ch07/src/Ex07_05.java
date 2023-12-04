
class Car {
	protected String name;
	String color;
	int door;
	
	Car( String name ) {
		this.name = name;
	}
	
	void drive() {
		System.out.printf("%s drive\n", this.name);
	}
	
	void stop() {
		System.out.printf("%s stop\n", this.name);
	}
}

class FireEngine extends Car {
	FireEngine( String name ) {
		super(name);
	}
	
	void water() {
		System.out.printf("%s water\n", this.name);
	}
}

// ==========================================================

class Product {
	int price;
	int bonusPoint;
	public Product(int price) {
		super();
		this.price = price;
		this.bonusPoint = (int)(price / 10.0);
	}
	
	Product(){}
}

class TV_p extends Product {
	TV_p() {
		super(100);
	}
	
	public String toString() { return "TV"; } 
}

class Radio extends Product {
	Radio() {
		super(45);
	}
	
	public String toString() { return "Radio"; } 
}

class Com extends Product {
	Com() {
		super(120);
	}
	
	public String toString() { return "Computer"; } 
}

// 원래 판매자 역할도 필요할듯..
//class Seller {
//	Seller() {}
//	
//	public Product[] GenProducts
//}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	int maxcart = 10;
	Product[] cart;
	int i = 0;
	
	Buyer() {
		// 원래 이러면 안됨;;
		this(1000);
	}
	
	Buyer(int __inmoney) {
		this.money = __inmoney;
		cart = new Product[this.maxcart];
	}
	
	Buyer(int __inmoney, int __maxcart) {
		this.money = __inmoney;
		this.maxcart = __maxcart;
		cart = new Product[__maxcart];
	}
	
	void buy(Product p) {
		if( money < p.price ) {
			System.out.printf("잔액 부족.\n");
			return;
		}
		
		if( cart.length <= i ) {
			System.out.printf("카트에 물건이 꽉찼습니다.\n");
			return;
		}
		
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.printf("%s를 카트에 담았습니다.\n", p);
	}
	
	void summary() {
		int sum = 0;
		
		if ( 0 >= cart.length ) {
			System.out.printf("카트에 물건이 없습니다.\n");
			return;
		}
		
		String itemList = "카트에 담은 상품들 : ";
		
		for( int i = 0; i < cart.length; i++) {
			if( null == cart[i] ) break;
			itemList += (" " + cart[i] + ",");
			sum += cart[i].price;
		}
		
		System.out.printf("%s 이며.. 총 구입액은 %d 입니다.\n", itemList, sum);
		System.out.printf("거스름돈은 %d입니다. 감사합니다.", this.money);
	}
}

public class Ex07_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = null;
//		FireEngine _fe = new FireEngine("red bull");
//		
//		// 부모객체가 자식클래스로 정의는 가능.. 하지만..
//		car = new FireEngine("norm car");
//		
//		_fe.drive();
//		_fe.stop();
//		_fe.water();
//		
//		car.drive();
//		car.stop();
//		// 부모로 선언된 객체는 자식걸 못씀;; 모르니까..
//		// car.water(); // can't;;;
//		
//		FireEngine _fe2 = (FireEngine) new Car("red car bull");
//		_fe2.water();
		
		// ===========================================
		
		Buyer __b = new Buyer();
		__b.buy(new TV_p());
		__b.buy(new Com());
		__b.buy(new Radio());
		__b.summary();
	}

}
