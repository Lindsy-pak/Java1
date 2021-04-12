package Blackjack;
public class CardMain2 {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
//		Card card1 = cd.getOneCard(); 
		/* 카드한장을 뽑는다. 카드를 뽑으면 그 자리 값 방은 null로 만들어 줘야한다. 
		 * 카드는 한장씩 밖에 없기 때문 */
//		System.out.println(card1);
//		
//		Card card2 = cd.getOneCard(); 
//		System.out.println(card2);
		
		cd.printAll();

	}


}
