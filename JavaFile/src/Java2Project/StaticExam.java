package Java2Project;

public class StaticExam {

	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "디즈니";
		System.out.println("t1.name : " + t1.name);
		
		t2.name = "롯데"; /* Toy.name = "ㅋㅋ";와 같은 말이지만 static은 class단위로 사용하므로 Toy.name으로 사용한다. */
		
		Toy.name = "ㅋㅋ"; /* static은 이렇게 사용 */
		
		System.out.println("t2.name : " + t2.name);
		System.out.println("t1.name : " + t1.name);
		System.out.println("Toy.name : " + Toy.name);

		
	}

}
class Toy {
	static String name; /* 메모리에 저장 못하고 한 값 밖에 저장하지 못한다. */
}
