
public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		Integer intg = (Integer)i;
		Object obj = (Object)i;
		
		Long lng = 100L;
		
		int i2 = intg + i;
		long l = intg + lng;
		
		Integer intg2 = new Integer(20);
		int i3 = intg2;
		
		Integer intg3 = intg2 + i3;
		
		System.out.printf("i          = %d\n", i);
		System.out.printf("intg       = %d\n", intg);
		System.out.printf("obj        = %s\n", obj);
		System.out.printf("lng        = %d\n", lng);
		System.out.printf("i2         = %d\n", i2);
		System.out.printf("l(intg+lng)= %d\n", l);
		// .... 이후는 알아서;;
	}

}
