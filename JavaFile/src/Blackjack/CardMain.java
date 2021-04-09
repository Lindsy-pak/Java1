package Blackjack;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card("spade", "K");
		System.out.println(c1.toString()); //spade (k)
//		println(c1); /* string 보다 object먼저 실행이 된다. */

		Card c2 = new Card("heart", "2");
		System.out.println(c2.toString()); //heart (2)
//		println(c2);
		
		Card c3 = new Card("club", "J");
		System.out.println(c3.toString()); //club (J)
		
		CardDeck carddeck = new CardDeck();
	}

//	public static void println(String str) {
//		System.out.println(str);
//	}
//
//	public static void println(Object obj) { /* overloading */
//		System.out.println("obj!!");
//		String str = obj.toString();
//		println(obj.toString());
//	}
	

}
