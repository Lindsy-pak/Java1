package Java2Project;

public class CreditCard {

	public static void main(String[] args) {
		
		CreditCards card1 = new CreditCards();
		CreditCards card2 = new CreditCards();
		
		System.out.println(card1.getNumber());
		System.out.println(card1.getName());
		
		card1.whoesCard();
		
		card2.setName("박민지");
//		card2.setNumber(2);
		card2.whoesCard();
		
		

	}
}

/* static은 메소드 저장공간에 저장될때 하나의 값만 저장한다.
 * static이 없으면 인스턴스변수라고 부르고 인스턴스 변수는 값이 바뀔 때 마다 모든 변수를 수정해야하는 번거로움이 있다. 
 * 하지만 static을 사용하면 static의 값하나만 바꿔도 모든 변수에서 공통적으로 그 값으로 수정이 된다. 
 * static은 객체를 만들지 않고 바로 사용이 가능하며 class단위로 관리하고 호출이 가능하다.*/
class CreditCards { /* 신용카드를 예로 들었을 때 */
	static int height; 
	static int width;
	static String color;
	static String brand;
	private String name;
	static int order = 1;
	private int serialNumber;
	
	
	CreditCards() { //기본 생성자
		serialNumber = order++;
		name = "김지민";
		brand = "신한";
	}
	
	public void setNumber(int number) { //setter
		this.serialNumber = number;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public int getNumber() { //getter
		return serialNumber;
	}
	public String getName() {
		return name;
	}
	public void whoesCard() {
		System.out.printf("%s카드의 소유주는 %s님이고, 카드번호는 %d입니다. \n", brand, name, serialNumber);
	}
}
