import java.util.Arrays;

//class GArray<E> {
//	private E[] eles;
//	
//	void GenArray(E eles) 
//}



public class Ex05_02 {
	
	
	
	public static void main(String[] args) {
//		int[] datas = new int[] {100, 88, 100, 100, 90};
//		int sum = GetSum(datas);
//		System.out.printf("합계 : %d, 평균 : %.2f", sum, GetAvg(sum, datas.length) );
		
		// ===============================================
		
//		int[] score = { 5, 8, 12, 85, 14, 25, 20 };
//		
//		int max = score[0], min = score[0];
//		
//		for( int i = 0; i < score.length; i++) {
//			max = Math.max(score[i], max);
//			min = Math.min(score[i], min);
//		}
//		
//		System.out.printf("해당배열 최대값 : %d, 최소값 : %d", max, min );
		
		// ===============================================
		
//		int[] score = { 5, 8, 12, 85, 14, 25, 20 };
//		int odd = 0, even = 0;
//		
//		for( int i = 0; i < score.length; i++) {
//			if( 0 == score[i] % 2 )
//				even += score[i];
//			else
//				odd += score[i];
//		}
//		
//		System.out.printf("해당배열 짝수합계 : %d, 홀수합계 : %d", even, odd );
		
		// ===============================================
//		int[] b_cards = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		System.out.println( Arrays.toString(b_cards) );
//		Shuffle_Card(b_cards);
//		System.out.println( Arrays.toString(b_cards) );
		
		// ===============================================
		
//		int[] ball = new int[45];
//		
//		int i = 0;
//		
//		for(; i < ball.length; i++) { 
//			ball[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(ball));
//		
//		int j = 0, tmp = 0;
//		int[] Cballs = new int[6];
//		
//		for( i = 0; i < Cballs.length; i++) {
//			j = (int)(Math.random() * ball.length);
//			Cballs[i] = ball[j];
//		}
//		// Shuffle_Card(ball);
//		
//		System.out.printf( "Lucky balls : %s",  Arrays.toString(Cballs));
		
		// ===============================================
		
		String[] name = {"Kim", "Kang", "Lee"};
		String __str = "";
		
		System.out.printf( "Names : %s", Arrays.toString(name) );
		
		
	}
	
	static void Shuffle_Card( int[] __cards ) {
		int[] newarr = new int[__cards.length];
		
		int n = (int)(Math.random() * __cards.length) + 1, idx = 0;
		System.out.printf("%d 번 바꾼다.\n", __cards.length * n);
		int tmp, src;
		
		while(idx < (__cards.length * (n + 1) )) {
			n = (int)(Math.random() * __cards.length);
			src = idx % __cards.length;
			// System.out.println( src + " " + __cards[n] + " " + idx + " " + __cards.length );
			
			tmp = __cards[src];
			__cards[src] = __cards[n];
			__cards[n] = tmp;
					
			idx++;
		}
	}
	
	static int GetSum( int[] __arr ) {
		int _sum = 0;
		
		for( int i = 0; i < __arr.length; i++) {
			_sum += __arr[i];
		}
		
		return _sum;
	}
	
	static float GetAvg( int __sum, int __length ) {
		return __sum / (float)__length;
	}
}
