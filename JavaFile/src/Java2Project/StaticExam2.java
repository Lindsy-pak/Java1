package Java2Project;

public class StaticExam2 {

	public static void main(String[] args) {
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();
		
		System.out.println("장난감 생산 갯수 : " + Toy2.makeCount); /* 외부에서 접근할 때는 무조건 클래스명. -> 으로 접근해야한다. */

	}

}
class Toy2 {
	static int makeCount; /* 객체화와 상관없이 혼자 스스로가 된다. static은 heap이 아니라 method area에 저장한다.  */
	
	Toy2() {
		makeCount++; /* 같은 클래스 안에 있을 때는 앞에 아무것도 붙이지 않아도 접근 가능 */
	}
}

