package test;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {
	
	private static Logger logger = LogManager.getLogger();

	static String listprint( ArrayList l1, ArrayList l2, String res ) {
		res += ( "list1:" + l1 + "\n" );
		res += ( "list2:" + l2 + "\n" );
		res += "\n";
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String res = "\n";
		
		ArrayList l1 = new ArrayList(10);
		int i = 0;
		{
			int[] ex = {5, 4, 2, 0, 1, 3};
			for(i = 0; i < ex.length; i++) {
				l1.add(ex[i]);
			}
		}
		
		ArrayList l2 = new ArrayList(l1.subList(1, 4));
		res = listprint(l1, l2, res);
		
		Collections.sort(l1);
		Collections.sort(l2);
		res = listprint(l1, l2, res);
		
		res += "list1.contatinsAll(list2): " + l1.containsAll(l2) + "\n";
		{
			char[] ex2 = {'A', 'B', 'C'};
			
			for(i = 0; i < ex2.length; i++) {
				l2.add(ex2[i]);
			}
		}
		res = listprint(l1, l2, res);
		
		l2.set(3, "AA");
		res = listprint(l1, l2, res);
		
		logger.info(res);
		// System.out.println(res);
	}

}
