
public class Ex05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{100, 90, 80},
				{90, 90, 80},
				{40, 80, 80},
				{70, 90, 70},
		};
		
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("======================");
		
		int sum = 0;
		float avg = 0.0f;
		
		for ( int i = 0; i < score.length; i++) {
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.printf("%4d", i + 1);
			
			for ( int j = 0;j < score[i].length; j++ ) {
				sum += score[i][j];
				System.out.printf("%4d", score[i][j]);
			}
			
			avg = sum / (float)score[i].length;
			System.out.printf("%4d %4.1f", sum, avg);
			System.out.println();
		}
		
		System.out.printf("%d %d %d", korTotal, engTotal, mathTotal);
		
//		sum = korTotal + engTotal + mathTotal; 
//		avg = sum / 3;
//		
//		System.out.printf("%d 총점이며, %f 의 평균이 되겠습니다.", sum, avg);
	}

}
