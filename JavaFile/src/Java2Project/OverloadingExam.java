package Java2Project;

public class OverloadingExam {

	public static void main(String[] args) {
		// 오버로딩 : 똑같은 이름의 메소드를 만들 수 있다 (파라미터만 다르다면)
		
		
		Calc calc = new Calc();
		// Calc 객체화
		calc.sum(5,10);
		// sum메소드 호출 아규먼츠는 5, 10 
		calc.sum(5, 10, 11);
		calc.sum(10, 10, "30");

	}

}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	void sum(int n1, int n2, int n3) { //-> 구분만 가능하다면 같은 이름의 메소드 생성 가능
		System.out.println(n1 + n2 + n3);
	}
	int sum(int d1, int d2, String d3) {
		System.out.println(d1 + d2 + d3);
		return 0;
	}
	
}
