package test_ch;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		String res = "";
		
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] = (int)(Math.random() * (10 - 1)) + (1 + 1);
			res += (arr[i] + " ");
		}
		
		System.out.printf("1~10인덱스내 랜덤한 수 출력 : [%s]", res);
	}

}
