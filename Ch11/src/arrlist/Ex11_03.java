package arrlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ex11_03 {

	static LinkedList q = new LinkedList(); // jvm 17 queue
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("help를 입력하시면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine();
				
				if( "".equals(input) ) continue;
				
				if( input.equalsIgnoreCase("q") ) {
					System.exit(0); // quit.
				} else if( input.equalsIgnoreCase("help") ) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q or Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					
					// save(input);
					
					LinkedList tmp = q; // jvm 17.
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext())
						System.out.println(++i + "." + it.next());
				} else {
					save(input);
					System.out.println(input);
				}
				
				// System.out.printf("%s\n", input);
				
				
			} catch (Exception e) {
				System.out.printf("입력오류 : %s\n", e);
			}
		}
	}
	
	public static void save(String input) {
		if(!"".equals(input))
			q.offer(input);
	
		if(MAX_SIZE < q.size())
			q.remove();
	}

}
