package test_ch;

import java.util.Scanner;
public class p6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int src = 0, dst = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("입력할 시작지점 수 : ");
		src = sc.nextInt();
		System.out.printf("입력할 끝지점 수 : ");
		dst = sc.nextInt();
		
		sc.close();
		
		int[][] arr = new int[dst - src + 1][10 - 1];
		String res = "";
		
		for ( int j = 0; j < 10 - 1; j++) {
			for( int i = 0; i < (dst - src + 1); i++ ) {
				arr[i][j] = (i + src) * (j + 1);
			}
		}
		
		for( int i = src; i <= dst; i++ ) {
			res += ( "   " + i + "단\t\t");
		}
		
		res += "\n";
		
		for ( int j = 0; j < 10 - 1; j++) {
			for( int i = 0; i < (dst - src + 1); i++ ) {
				res += (Integer.toString((i + src)) + " * " + Integer.toString(j + 1) + " =\t" + Integer.toString(arr[i][j]) );
				res += "\t";
			}
			res += "\n";
		}
		
		System.out.printf("%s", res);
	}

}
