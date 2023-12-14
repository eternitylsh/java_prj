package ls_pack;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String>  optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length);
		
		System.out.println("optStr = " + optStr.get());
		System.out.println("optInt = " + optInt.get());
		
		int res1 = Optional.of("123")
				.filter(x -> 0 < x.length() )
				.map(Integer::parseInt).get();
		
		int res2 = Optional.of("")
				.filter(x -> 0 < x.length() )
				.map(Integer::parseInt).orElse(-1);
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		
		Optional.of("456").map(Integer::parseInt)
			.ifPresent(x -> System.out.printf("res3 = %d\n", x));
		
		OptionalInt optInt1		= OptionalInt.of(0);
		OptionalInt optInt2		= OptionalInt.empty();
		
		System.out.println(optInt1.isPresent());
		System.out.println(optInt2.isPresent());
		
		System.out.println(optInt1.getAsInt()); // 0
		// System.out.println(optInt2.getAsInt()); // No Such Element Exception.

		System.out.println("optInt1 = " + optInt1);
		System.out.println("optInt2 = " + optInt2);
		System.out.printf("optInt1.equals(optInt2)? %b \n", optInt1.equals(optInt2));
	}

}
