
public class Ex06_03 {

	public static void main(String[] args) {
		
		
		Card card = new Card(); //인스턴스 생성
		System.out.printf("Card 너비 = %d\n", card.width);
		System.out.printf("Card 높이 = %d\n", Card.height);
		/* 
		 클래스 변수 특징 
		 1. 인스턴스 생성 안해도 됨(클래스 이름으로 바로 접근이 가능하다)
		  */
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 10;

		System.out.printf("c1 %s %d (%d, %d)\n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2 %s %d (%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);
		
		c1.width = 10;
		c1.height = 20;
		
		System.out.printf("c1 %s %d (%d, %d)\n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2 %s %d (%d, %d)\n", c2.kind, c2.number, c2.width, c2.height);
	}

}

class Card{
	
	// 인스턴스 변수
	String kind; //종류
	int number; 
	
	//클래스 변수
	static int width = 100;
	static int height = 250;
	
}