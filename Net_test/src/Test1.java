import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {

	private static final Logger logger = LogManager.getLogger(Test1.class);
	
	public static String listPrint( List l1, List l2, String res ) {
		
		res += ( "list1:" + l1 + "\n");
		res += ( "list2:" + l2 + "\n");
		res += "\n";
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "\n";
		res += "---------- java ----------\n";
		int i = 0;
		
		// q1.
		int[] ex1 = {5, 4, 2, 0, 1, 3};
		
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		
		for( i = 0; i < ex1.length; i++ )
			l1.add(ex1[i]);
		
		l2.addAll(0, l1.subList(1, 4));
		
		res = listPrint(l1, l2, res);
		
		// q2.
		Collections.sort(l1);
		Collections.sort(l2);
		
		res = listPrint(l1, l2, res);
		
		// q3.
		res += ( "list1.containsAll(list2): " + l1.containsAll(l2) + "\n" );
		
		char[] ex2 = {'A', 'B', 'C'};
		
		for( i = 0; i < ex2.length; i++ )
			l2.add(ex2[i]);
		
		res = listPrint(l1, l2, res);
		
		// q4.
		l2.set(3, "AA");
		
		res = listPrint(l1, l2, res);
		
		// q5.
		res += ( "list1.retainAll(list2): " + l1.retainAll(l2) + "\n" );
		l1 = l2.subList(0, 3);
		res = listPrint(l1, l2, res);
		
		// q6.
		l2 = l2.subList(3, 6);
		res = listPrint(l1, l2, res);
		
		logger.info(res);
	}

}
