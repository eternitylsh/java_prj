package arrlist;

import java.util.Objects;

import java.util.Set;
import java.util.HashSet;

import java.util.TreeSet;

public class Ex11_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet sh = new HashSet();
//		
//		sh.add("abc");
//		sh.add("abc");
//		sh.add(1);
//		sh.add(1);
//		sh.add(new Person("David", 10));
//		sh.add(new Person("David", 10));
//		sh.add(new Integer(1));
//		
//		System.out.println(sh);
		
		// ====================================
		
		// tresSet test.
		
		// 이 코드의 장점은 자동적으로 중첩없이 오름차순 정렬 데이터가 만들어진다는점.
		Set set = new TreeSet();
		int num;
		
		for( int i = 0; 6 > set.size(); i++) {
			num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		return name.equals(p.name) && age==p.age;
	}
	
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	public String toString() {
		return name + ": " + age;
	}
}
