package Java2Project;

public class AccessExam { /* public은 같은 파일명인 클래스에 넣을 수 있다 */

	public static void main(String[] args) { 
		/*
		 종류 3가지 
		 private : 같은 class안에서만 접근 가능 (클래스 O, 상속관계 x, 패키지 x, 전체 x) 
		 default : (클래스 O, 상속관계 O, 패키지 x, 전체 x) (아무것도 안적혀 있는것 같은 패키지 안에있는 다른 클래스 파일에 접근 가능)
		 protected : (클래스 O, 상속관계 O, 패키지 O, 전체 x)
		 public : 모두 다 가능
		 256p 접근 제한자 - 캡슐화(외부에 보이지 않도록 가림)
		 */
		Access acc = new Access();
		acc.printNum();
		

	}

}
class Access {
	private int num;
	
	void printNum() {
		System.out.println("num : " + num); /* 같은 클래스라서 접근 가능함 */
	}
}