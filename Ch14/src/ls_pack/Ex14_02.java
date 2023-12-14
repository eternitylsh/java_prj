package ls_pack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_02 {

	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list)
			newList.add(f.apply(i));
		
		return newList;
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		
		for( T i : list ) {
			if( p.test(i) )
				c.accept(i);
		}
		
		System.out.print("]\n");
	}
	
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for( int i = 0; i < 10; i++ )
			list.add(s.get());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Predicate<String> isEmptystr = s -> 0 == s.length();
//		String s = "";
//		
//		if( isEmptystr.test(s) )
//			System.out.printf("This is an empty String : %s", s);
//		
		// ================================================================
		
		
		Supplier<Integer>  s = () -> (int)(Math.random() * 100) + 1;
		Consumer<Integer>  c = i  -> System.out.printf("%d, ", i);
		Predicate<Integer> p = i  -> 0 == i % 2;
		Function<Integer, Integer> f = i -> i / 10 * 10;
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list);
		printEvenNum(p, c, list);
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}

}
