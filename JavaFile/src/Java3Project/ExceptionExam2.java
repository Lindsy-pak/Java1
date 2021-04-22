package Project;

public class ExceptionExam2 {

	public static void main(String[] args) {
		// Calc 객체화 div메소드 10 , 2 아규먼트로 호출
		// 리턴값 받으시고 콘솔에 출력 
		
		Calc calc = new Calc();
//		calc.div(10, 2); //객체지향 모든 프로그램 : 주소값.불러올 메소드(올바른 아규먼트)
		int result = calc.div(10, 1);
		System.out.println(result);
		
	}

}

class Calc {
	int div(int n1, int n2) {
		try {
			return n1 / n2; //여기서 에러가 터지면 catch에서 리턴값을 안주면 어떤한 곳에도 리턴값이 없어서 에러가 터짐		
		} catch(Exception e) {
			System.out.println("예외발생");
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("try밖 실행");
		return 0;
	}
}
