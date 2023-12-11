package etc01;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class Ex12_02 {
	
	public static void main(String[] args) {
		List<Student> _sl = new ArrayList<Student>();
		
		_sl.add(new Student("java King", 1, 1));
		_sl.add(new Student("java Perfect", 1, 2));
		_sl.add(new Student("Assasin Creed", 2, 1));
		
		Iterator<Student> it = _sl.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			
			System.out.println(s.name + ", " + s.ban + ", " + s.no);
		}
	}
}

class Student {
	String name = "";
	int ban;
	int no;
	
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}