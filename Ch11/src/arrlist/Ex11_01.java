package arrlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1 = new ArrayList(10);
		
		// 기본형은 가능한데.. 될 수 있으면 래퍼클래스 써야;;
		for( int i = 0; i < 6; i++) {
			l1.add(new Integer((int)(Math.random() * (10 + 1)) + (1 + 1)));
		}
		
		
		
		ArrayList l2 = new ArrayList(l1.subList(1, 4));
		
		System.out.printf("List1 : %s\n", l1);
		System.out.printf("List2 : %s\n", l2);
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.printf("정렬 후....\n");
		System.out.printf("List1 : %s\n", l1);
		System.out.printf("List2 : %s\n", l2);
		
		
	}

}
