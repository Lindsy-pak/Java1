package Blackjack;

public class Card {
	private String pattern;
	private String symbol;

	/* Overloading */
	public Card(String pattern, String symbol) {
//		super(); : 생략가능
		this.pattern = pattern;
		this.symbol = symbol;
	}

	public String getPattern() {
		return this.pattern;
	}

	public String getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return pattern + "(" + this.symbol + ")";
	}

}
