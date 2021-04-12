package Java3Project;

/* 추상클래스는 웹개발에서는 잘 안쓴다. 그냥 이런게 있다고 알고만 있기 */
public abstract class Animal { /* 추상 클래스를 만들고 싶으면 abstract을 붙여준다. */
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/* 추상 클래스가 되면 객체화를 할 수 없다. */
	public abstract void howling(); /* 추상 클래스 (선언부만 있는 메소드) */

	public void breath() {
		System.out.println("숨쉰다."); /* 둘다 공존가능한것이 abstract */
	}
}

class Cat extends Animal {
	@Override
	public void howling() {
		System.out.println("야옹~~");
	}
}
class dog extends Animal {
	@Override
	public void howling() {
		System.out.println("멍!! 멍!!");
	}
}


/* 추상클래스
 * 1. 객체화를 할 수 없다.
 * 2. 부모 것에 대해서 무조건 오버라이딩 해줘야 한다. (강제성ㅇ)
 * 3. 구현부와 같이 존재할 수 있으면 abstract 추상클래스
 * 4. 구현부와 같이 존재하지 못한다면 interface
 * 객체화를 하기 싫을 때 사용
 * */

