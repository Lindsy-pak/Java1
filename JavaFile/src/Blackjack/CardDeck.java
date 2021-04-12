package Blackjack;

public class CardDeck {
	private final Card[] CARD_ARR = new Card[52]; 
	/* final은 모두 대문자로 명명한다. */
	// 52개의 Card객체를 담을 수 있는 은닉화된 전역 배율 상수 존재
	// static을 붙이는 순가 객체를 여러개 할수 없고 객체화와 상관없고 자기 자신 하나만 가지게 된다.

	public CardDeck() { /* 클래스가 public이면 생성자도 퍼블릭으로 해주어야한다. */
		String[] cardPattern = { "Spades", "Hearts", "Diamonds", "Clubs" };/* 지역변수에는 public을 줄 수 없다. 전역변수에만 public이 가능 */
		String[] cardSymbol = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		
		for (int i = 0; i < cardPattern.length; i++) {
			for (int j = 0; j < cardSymbol.length; j++) {
				Card A = new Card(cardPattern[i], cardSymbol[j]); /* 객체화 */
				CARD_ARR[i * cardSymbol.length + j] = A;
				/* CARD_ARR[i * cardSymbol.length + j] = new Card(cardPattern[i],cardSymbol[j]); */
//				System.out.println(CARD_ARR[i * cardSymbol.length + j]);
			}
		}
		for(int i =0; i<CARD_ARR.length; i++) {
			System.out.println(CARD_ARR[i]);
		}
		/*
		 * <i = 0> 
		 * 0 + 0 
		 * 0 + 1 
		 * 0 + 2 
		 * 0 + 3 ... 
		 * 0 + 11 
		 * 0 + 12
		 * 
		 * <i = 1> 
		 * 1*13 + 0 
		 * 1*13 + 1 
		 * 1*13 + 2 
		 * 1*13 + 3 ... 
		 * 1*13 + 11 
		 * 1*13 + 12
		 */
		
		/* for each : 반복하는 배열 길이가 정해져 있을 때 사용한다. */
//		int sum = 0;
//		for(String pat: cardPattern) {
//			for(int i=0; i<cardSymbol.length; i++) {
//				CARD_ARR[sum++] = new Card(pat, cardSymbol[i]);
//			}
//		}

	}
//	// 1번 방법
	private int getRandomIdx() {
		return (int)(Math.random()*CARD_ARR.length);
	}
	public Card getOneCard() {
		Card c = null;
		int idx = 0;
		do {
			idx = getRandomIdx();
			c = CARD_ARR[idx];
		} while(c == null);
		CARD_ARR[idx] = null;
		return c;
	}

	// 2번 방법 (재귀함수, 중복제거)
//	public Card getOneCard() {
//		int idx = (int)(Math.random()*CARD_ARR.length);
//		Card deck = CARD_ARR[idx];
//		if(deck==null) {
//			return getOneCard();
//		}else {CARD_ARR[idx]=null;
//		return deck;
//		}
//	}
	
//	// 3번 방법
//	public Card getOneCard() {
//		int R = (int)(Math.random() * CARD_ARR.length);
//		while (CARD_ARR[R]) == null) {R = (int)(Math.random()*CARD_ARR.length);}
// 	}
//
//	// 4번 방법
//	public Card getOneCare() {
//		int R;
//		do {R=(int)(Math.random()*CARD_ARR.length);}while(CARD_ARR[R] ==null);
//		Card c = CARD_ARR[R];
//		CARD_ARR[R] = null;
//		return c;
//	}

	public void printAll() {
		for(Card c : CARD_ARR) {
			System.out.println(c);
		}
	}


}
