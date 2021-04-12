package Java2Project;

public class PolyExam2 {

	public static void main(String[] args) {
/*
	1. 부모타입은 자식 객체 주소값을 참조 할 수 있다. (가리킬 수 있다.) extends 클래스명
	2. 자식타입은 부모 객체 주소값을 참조 할 수 없다.  	 
*/
		Animal ani1 = new Hamster();
		Animal ani2 = new Animal(); 
//		Animal ani3 = new String(); -> 완전남은 주소값을 가르킬 수 없다. 
		Hamster ham = (Hamster)ani2; /* 자식타입은 부모객체 주소값을 참조할 수 없다. */
		System.out.println("끝");
	}

}
