package Java2Project;

public class InheriExam {

	public static void main(String[] args) {
		// 상속
		Cat cat = new Cat(); /* Cat만 객체를 시키는게 아니라 상속관계들이 다 객체화 된다. */
		cat.name = "고양이";
		cat.age = 4;
		cat.howling();
		cat.lick();

	}
}

class Animal extends Object { /* Stack저장됨, 객체를 만들면 무조건 object가 생긴다.(자동으로) 오브젝트에 상속을 받고 있는 것임 */
	String name; /* 기본적인 위치 멤버변수가 가장 먼저오고 그다음 생성자 그다음 메소드가 온다. */
	int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	Animal() {
//		super(); // Last in First out : LIFO super는 가장 위에 위치해야한다. 생성자보다 밑에있으면 x
	/* 내 바로 직계부모를 말하는게 super */
//		System.out.println("Animal 생성자");
//	}
	void howling() {
		System.out.println("운다");
	}
}

class Cat extends Animal { /* 상속을 받으면 그 부모의 속성을 사용할 수 있다. 실행은 부모것부터 실행이 된다. */
	Cat() {
		super("", 0); // 위에 애니멀에서 기본생성자가 없기 때문에 그 밑에 있는 파라미터에 스트링과 인트값을 받는 생성자라고 불러와야하기 때문에 super안에
						// 적어준다.
		System.out.println("Cat 생성자");
	}
	@Override //오버라이딩 할때 꼭 적어준다. 
	void howling() { /* 부모중에 이 howling 메소드가 있어야한다. 부모것의 메소드를 내가 덮어서씌어서 사용하는 방법이 오버라이딩 */
		System.out.println("야옹");
	}
	/* 오버로딩 : 이름이 같은 메소드나 생성자를 만드는 것
	 * 오버라이딩 : 부모 생성자를 불러오는데 그 값이 내가 원하는 값으로 덮어 씌우고 싶을 때 사용하는 개념이다.   */

	void lick() {
		System.out.printf("%s가 핥다\n", name);
	}
}

class KoShort extends Cat {
	void pee() {
		System.out.printf("%s가 소변을 본다\n", name);
	}
}
