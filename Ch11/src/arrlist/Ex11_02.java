package arrlist;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Ex11_02 {
	
	static final int MAX = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st = new Stack();
		// Queue qu = new LinkedList(); // 1.8버전에 맞게 일부러 이렇게 했는데;;
		LinkedList qu = new LinkedList(); // 17버전에서는 그냥 이렇게 해도됨.
		int i = 0;
		
		for(; i < MAX; i++) {
			st.push(Integer.toString(i));
		}
		
		for(i = 0; i < MAX; i++) {
			qu.offer(Integer.toString(i));
		}
		
		String _res = "";
		
		_res += "==stack==\n";
		
		while(!st.empty()) {
			_res += (st.pop() + "\n");
		}
		
		_res += "==queue==\n";
		
		while(!qu.isEmpty()) {
			_res += (qu.poll() + "\n");
		}
		
		System.out.printf("%s", _res);
	}

}
