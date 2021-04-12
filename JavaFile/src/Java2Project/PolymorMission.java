package Java2Project;

public class PolymorMission {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();
//		Cat cat = new Cat();
//		Pig pig = new Pig();
//		Hamster hamster = new Hamster();
		
		// 새롭게 햄스터 객체 만들지 않고, 
		//8번 라인에 hanster변수에 저장된 주소값을 활용 하여 runRail메소드 호출
		Hamster ham = (Hamster)hamster; /* 햄스터 타입으로 햄스터를 줄 수 있다.  */
		ham.runRail();
		
		System.out.println(hamster instanceof Hamster);
		System.out.println(pig instanceof Hamster); 
		/* 앞에 들어있는 주소값이 뒤에것으로 형변환이 가능하냐? true : 가능 false : 불가능*/
		
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
	//ani로 Hamster 객체주소 값이 들어오면
	//howling 메소드 말고 runRail 메소드로 호출해 주세요.
	//다른 객체들은 howling 메소드 호출
	
//	static void cry(Animal ani) {
//		ani.howling();
//	}
	
	
//	static void cry(Cat cat) { 
//		cat.howling();
//	}
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
	
	public void runRail() {
		System.out.println("쳇바퀴를 돌린다. ");
	}
}


