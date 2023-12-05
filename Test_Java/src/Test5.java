
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		String _res = "";
		
		for( int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * (10 - 1)) + ( 1 + 1 );
			_res += (arr.length - 1 > i ? ( arr[i] + " ") : arr[i]);
		}
		
		System.out.printf("임의의 10개의 수 : [%s]", _res);
	}

}
