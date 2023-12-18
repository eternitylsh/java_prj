package fileIO;

import java.io.Serializable;

public class Ex15_07 implements Serializable {

	String name;
	String password;
	int    age;
	
	public Ex15_07() {
		this("Unknow", "1111", 0);
	}
	
	public Ex15_07( String __name, String __pw, int __age ) {
		this.name = __name;
		this.password = __pw;
		this.age = __age;
	}
	
	public String toString() {
		return "(" + this.name + ", " + this.password + ", " + this.age + ")";
	}
}
