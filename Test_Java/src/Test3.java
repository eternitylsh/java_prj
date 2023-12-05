import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int src, dst;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("합계를 구할 시작수 : ");
		src = sc.nextInt();
		System.out.printf("합계를 구할 끝수 : ");
		dst = sc.nextInt();
		sc.close();
		
		if( src > dst ) {
			System.out.printf("시작수보다 더 큰수를 입력하세요. %d, %d", src, dst);
		} else {
			int res = 0;
			
			for( int i = src; i <= dst; i++  ) {
				res += i;
			}
			
			System.out.printf("%d ~ %d 까지 합계는 : %d", src, dst, res);
		}
	}

}
