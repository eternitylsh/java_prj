package ls_pack;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		// Stream<Integer> intStream = list.stream();
		
//		IntStream intStream = new Random().ints();
//		
//		intStream.limit(10).forEach(System.out::println);
		
		// =========================================
		
//		Optional<String>  optStr = Optional.of("abcde");
//		Optional<Integer> optInt = optStr.map(String::length);
//		
//		System.out.println("optStr = " + optStr.get());
//		System.out.println("optInt = " + optInt.get());
		
		// =========================================
		
		// 혹여나 해서.. 아래 예시를 ..
		
		File[] fArr = {
				new File("Ex1.java"),
				new File("Ex1.bak"),
				new File("Ex2.java"),
				new File("Ex1"),
				new File("Ex1.txt"),
		};
		
		Stream<File> fStream = Stream.of(fArr);
		
		Stream<String> fnStream = fStream.map(File::getName);
		fnStream.forEach(System.out::println);
		
		fStream = Stream.of(fArr);
		
		fStream.map(File::getName)
			.filter(s -> -1 != s.indexOf('.'))
			.map( s -> s.substring(s.indexOf('.') + 1))
			.map(String::toUpperCase)
			.distinct()
			.forEach(System.out::print);
		/*
		 * 1. filter      : 확장자가 없는 것은 제외./
		 * 2. map( s ...) : 확장자만 추출.
		 * 3. map(Str...) : 모두 대문자로 변환.
		 * 4. distinct    : 중복제거
		 * 5. 출력 >> JAVABAKTXT 
		 */
		// stream map 기능을 통해 다양한 조건을 적용해서 맨 아래로 출력을 한꺼번에 순차적용이 가능.
		
		System.out.println();
	}
}
