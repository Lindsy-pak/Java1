package Blackjack;

public class CardDeck {
	private final Card[] CARD_ARR = new Card[52]; /* final은 모두 대문자로 명명한다. */
	// 52개의 Card객체를 담을 수 있는 은닉화된 전역 배율 상수 존재
	// static을 붙이는 순가 객체를 여러개 할수 없고 객체화와 상관없고 자기 자신 하나만 가지게 된다.

	public CardDeck() { /* 클래스가 public이면 생성자도 퍼블릭으로 해주어야한다. */
		String[] cardPattern = { "Spades", "Hearts", "Diamonds", "Clubs" };/* 지역변수에는 public을 줄 수 없다. 전역변수에만 public이 가능 */
		String[] cardSymbol = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		for (int i = 0; i < cardPattern.length; i++) {
			for (int j = 0; j <= cardSymbol.length; j++) {
				Card A = new Card(cardPattern[i], cardSymbol[j]); /* 객체화 */
				CARD_ARR[i * cardSymbol.length + j] = A;
				/* CARD_ARR[i * cardSymbol.length + j] = new Card(cardPattern[i],cardSymbol[j]); */
				System.out.println(CARD_ARR[i * cardSymbol.length + j]);
			}
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



}
