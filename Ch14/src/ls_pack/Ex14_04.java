package ls_pack;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.stream.Stream;

class Student {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student(String name, boolean isMale, int hak, int ban, int score) {
		this.name   = name;
		this.isMale = isMale;
		this.hak    = hak;
		this.ban    = ban;
		this.score  = score;
	}
	
	String getName()	{ return this.name; }

	public boolean isMale() {
		return isMale;
	}

	public int getHak() {
		return hak;
	}

	public int getBan() {
		return ban;
	}

	public int getScore() {
		return score;
	}
	
	
	public String toString() {
		return String.format("[%s, %s, %d학년 %d반, %3d점]", 
				name, isMale ? "남" : "여", hak, ban, score);
	}
	
	enum Level { HIGH, MID, LOW }
}

public class Ex14_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stuArr = {
			new Student("가바다", true, 1, 5, 100),
			new Student("나바다", false, 2, 5, 90),
			new Student("다바다", true, 2, 5, 50),
			new Student("라바다", false, 2, 1, 70),
			new Student("마바다", false, 3, 1, 90),
			new Student("바바다", false, 3, 1, 100),
			new Student("사바다", true, 3, 3, 600),
			new Student("아바다", true, 3, 3, 300),
			new Student("자바다", true, 1, 3, 70),
			new Student("차바다", true, 1, 2, 700),
			new Student("카바다", false, 1, 2, 70),
			new Student("타바다", true, 1, 3, 80)
		};
		
		System.out.printf("1. 단순분할(성별로 분할)\n");
		Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student::isMale));
		
		List<Student> maleStudent 		= stuBySex.get(true);
		List<Student> femaleStudent 	= stuBySex.get(false);
		
		for( Student s : maleStudent ) System.out.println(s);
		for( Student s : femaleStudent ) System.out.println(s);
		
		System.out.printf("\n2. 단순분할 + 통계(성별로 분할)\n");
		Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()));
		
		System.out.printf("남학생 수 : %d\n", stuNumBySex.get(true));
		System.out.printf("여학생 수 : %d\n", stuNumBySex.get(false));
		
		System.out.printf("\n3. 단순분할 + 통계(성별 1등)\n");
		
		Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(
						Student::isMale, 
						Collectors.maxBy(
								Comparator.comparingInt(Student::getScore)
						)
				));
		
		// 만일 Optional 출력을 제거 하고 싶다면 뒤에 .get() 함수로 출력가능.
		System.out.printf("남학생 1등 : %s\n", topScoreBySex.get(true));
		System.out.printf("여학생 1등 : %s\n", topScoreBySex.get(false));
		
		Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(
						Student::isMale, 
						Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparingInt(Student::getScore)),
										Optional::get
										)
						)
				);
		
		System.out.printf("남학생 1등 : %s\n", topScoreBySex2.get(true));
		System.out.printf("여학생 1등 : %s\n", topScoreBySex2.get(false));
		
		System.out.printf("\n4. 다층분할(성별 불합격자, 100점 이하)\n");
		
		Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(
						Student::isMale,
						Collectors.partitioningBy(s -> 100 >= s.getScore())
						)
				);
				
		List<Student> failedmaleStu 	= failedStuBySex.get(true).get(true);
		List<Student> failedfemaleStu 	= failedStuBySex.get(false).get(true);
				
		for( Student s : failedmaleStu ) 	System.out.println(s);
		for( Student s : failedfemaleStu ) 	System.out.println(s);
	}
}
