import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test3 {

	private static final Logger logger = LogManager.getLogger(Test3.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> res = Stream.of("aa", "dd", "bb", "cc");
		res.sorted().forEach(System.out::print);
	}

}
