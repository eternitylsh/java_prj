package test;

import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> str = Stream.of("aa", "cc", "dd", "bb");
		str.sorted().forEach(System.out::print);
	}

}
