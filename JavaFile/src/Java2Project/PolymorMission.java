package Java2Project;

public class PolymorMission {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
		PolymorMission pet = new PolymorMission();  /* static을 뺏을 때 객체화 해주어야한다. */
		
		pet.cry(cat); /* cat을 기준으로 오버라이딩한것을 찾아서 하울링 출력 */
		pet.cry(pig); /* pig을 기준으로 오버라이딩한것을 찾아서 하울링 출력 */
		pet.cry(hamster); /* hamster을 기준으로 오버라이딩한것을 찾아서 하울링 출력 */
		// PolmorMission.cry(cat);
		/* pig, hamster 타입은 cat을 알지 못한다. "운다"라는 정보만 알고 있음 */
	}
	void cry(Animal animal) { /* static을 뺏을 때*/
		animal.howling();
		/* cry를 .method명 이 아니기 때문에 같은 클래스 안에 메소드를 만들어야한다. */
		/* 여기서 바로 불러올 수 있게 하기 위해서 */
	}
//	static void cry(Cat cat) { -> 다형성이 없다면 하나하나 오버라이딩 해주어야한다. 
//		cat.howling();
//	}
//	static void cry(Pig pig) { -> 형제 관계가 아니기 때문에 서로 모르는 사이임 
//		pig.howling();
//	}
//	static void cry(Hamster hamster) { -> 셋의 공통점은 Animal임
//		hamster.howling();
//	}
}
class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
	}
}
class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍~ 찍~");
	} /* 오버라이딩이 없었다면  운다가 출력된다. 부모인 Animal의 운다가 출력 */
}

