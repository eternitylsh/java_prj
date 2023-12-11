package etc01;

import java.util.ArrayList;
import java.util.List;

class Product{}
class TV extends Product {}
class SPhone extends Product {}

public class Ex12_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> p_List = new ArrayList<Product>();
		// ArrayList<TV> tvlist = new ArrayList<TV>();
		// ArrayList<Product> tvlist = new ArrayList<TV>(); // e
		List<TV>      tvlist = new ArrayList<TV>(); // ok. 다형성. 오히려 이걸 추천.
		List<SPhone>  splist = new ArrayList<SPhone>();
		
		// 왜 이걸 추천하냐면.. 이렇게 하면 재사용성으로 Stack, Queue등 다른 데이터 구조형태로이용이 가능해서.
		
		p_List.add(new TV());
		p_List.add(new SPhone());
		
		tvlist.add(new TV());
		tvlist.add(new TV());
		tvlist.add((TV) new Product());
		
		splist.add(new SPhone());
		splist.add(new SPhone());
//		splist.add((SPhone)new TV()); // Nope.. Error.
		
		printAll(p_List);
		printTVAll(tvlist);
		printSpAll(splist);
	}
	
	private static void printAll(List<Product> _l) {
		for( Product p : _l ) {
			System.out.println(p);
		}
	}

	private static void printTVAll(List<TV> _tv) {
		for( TV p : _tv ) {
			System.out.println(p);
		}
	}
	
	private static void printSpAll(List<SPhone> _sp) {
		for( SPhone p : _sp ) {
			System.out.println(p);
		}
	}
}
