package test_ch;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int src = 0, dst = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("입력할 시작지점 수 : ");
		src = sc.nextInt();
		System.out.printf("입력할 끝지점 수 : ");
		dst = sc.nextInt();
		
		sc.close();
		
		int res = 0;
		for(int i = src; i <= dst; i++) {
			res += i;
		}
		
		System.out.printf("%d, %d사이의 수 총합은 %d 이다.", src, dst, res);
	}

}
