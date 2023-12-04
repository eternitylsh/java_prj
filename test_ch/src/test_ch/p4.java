package test_ch;

import java.util.Scanner;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int src = 0, dst = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("입력할 시작지점 수 : ");
		src = sc.nextInt();
		System.out.printf("입력할 끝지점 수 : ");
		dst = sc.nextInt();
		
		sc.close();
		
		String res = "";
		
		for( int i = src; i <= dst; i++ ) {
			res += ( "   " + i + "단\t\t");
		}
		
		res += "\n";
		
		for ( int j = 1; j < 10; j++) {
			for( int i = src; i <= dst; i++ ) {
				res += (Integer.toString(i) + " * " + Integer.toString(j) + " =\t" + Integer.toString(i * j) );
				res += "\t";
			}
			res += "\n";
		}
		
		System.out.printf("%s", res);
	}

}
