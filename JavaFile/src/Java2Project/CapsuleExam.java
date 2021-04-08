package Java2Project;

public class CapsuleExam {

	public static void main(String[] args) {
		// 캡슐화
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.setAge(12);
		h1.setName("홍길동");
		h2.setAge(20);
		h2.setName("심사임당");
		
		h1.whoAmI(); // h1 나이는 12, 이름은 "홍길동"
		h2.whoAmI(); // h2 나이는 20, 이름은 "신사임당"
		
//		h1.age = 10;
//		System.out.print(h1.age);
		
//		h1.setAge(20);
	}

}
// 생성자 vs 메소드
// 생성자 : 생성자의 이름은 클래스 이름이랑 같아야한다. 리턴타입이 없다. (void int) 이런 값이 없다 
// this() vs this.somthing
// this() 생성자 호출, this. 생성자의 변수를 호출
class Human { // 상수에는 public을 줄 필요가 없다. ??
	// 1.메소드와 2. 생성자 통해서 private이지만 값을 빼내줄 수 있다. 같은 class이기 때문에 가능 (메소드 생성자 둘 다 있을 필요는 없다)
	private int age;
	private String name;
	
	Human() { /* 객체를 생성할 때 무조건 실행 되는 것이고 처음시작 값을 설정 해 줄 때 사용한다. */
		age = 10;
		name = "미상";
	}
	Human(int age) {
		this.age = age; /* this는 클래스안의 전역변수를 불러오는것 즉 자기자신 */ 
		name = "미상";
	}
	Human(String name) {
		/* this(name, 10) */
		this(); /// 다른 생성자를 호출할 때 쓰는 문법  
		this.name = name;
	}
	Human(String name, int age) {
		this.name = name; 
		this.age = age;
	}

	//setter 와 getter 단축키 ctrl + 3 -> getter -> 엔터

	public void setAge(int age) { //setter(쓰기) : 세터가 없으면 값을 바꿀 수가 없다 고정값이 됨
		this.age = age;
	}
	public void setName(String name) { //setter
		this.name = name;
	}
	
	public int getAge() { // getter(읽기) : 거의 사용함
		return age;
	}
	public String getName() { // getter
		return name;
	}
	
	public void whoAmI() {
		System.out.printf("나이는 %d, 이름은 \"%s\"\n", age, getName()); 
	}
	
	
	

	 
}
