package etc01;

import java.util.ArrayList;
import java.util.List;

class Fruit {
	public String toString() { return "Fruit"; }
}
class Apple extends Fruit {
	public String toString() { return "Apple"; }
}

class Grape extends Fruit {
	public String toString() { return "Grape"; }
}

class FruitBox <T extends Fruit> extends Box<T> {}

class Box<T> {
	List<T> blist = new ArrayList<T>();
	void add(T item)	{ this.blist.add(item); }
	T get(int i) 		{ return this.blist.get(i); }
	List<T> getList()	{ return this.blist; }
	int size()			{ return this.blist.size(); }
	public String toString() { return this.blist.toString(); }
}

class Juice {
	String name;
	
	Juice(String name) {
		this.name = name + "Juice";
	}
	
	public String toString() { return this.name; }
}

class Juicer {
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		String tmp = "";
		
		for(Fruit f : box.getList())
			tmp += f + " ";
		
		return new Juice(tmp);
	}
}

public class Ex12_03 {
	public static void main(String[] args) {
		FruitBox<Fruit> f_box = new FruitBox<Fruit>();
		FruitBox<Apple> a_box = new FruitBox<Apple>();
		FruitBox<Grape> g_box = new FruitBox<Grape>();
		
		f_box.add(new Apple());
		f_box.add(new Grape());
		a_box.add(new Apple());
		a_box.add(new Apple());
		g_box.add(new Grape());
		g_box.add(new Grape());
		
		System.out.println(Juicer.<Fruit>makeJuice(f_box));
		System.out.println(Juicer.<Apple>makeJuice(a_box));
		System.out.println(Juicer.<Grape>makeJuice(g_box));
	}
}

