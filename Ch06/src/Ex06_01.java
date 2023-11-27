
public class Ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV _t = new TV();
		_t.OnInit();
		_t.ch = 7;
		_t.channelDown();
		System.out.printf("현재 채널 %d\n", _t.ch);
		
		TV _t1 = new TV();
		_t1.OnInit();
		_t1.ch = 10;
		_t1.channelup();
		System.out.printf("_t1 채널 %d\n", _t1.ch);
		
		// 될수 있으면 이런 GC가 나서는 정의는 피해야;;
		_t1 = _t;
		System.out.printf("_t1 채널 %d\n", _t1.ch);
	}
}
