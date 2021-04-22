package Project;

public class ExceptionExam {

	public static void main(String[] args) {
		// 예외처리 try와 catch는 무조건 한쌍이다. 
		try {
			// 예외가 발생될 가능성이 높은 소스를 위치!!
			int result = 10 / 0;
			System.out.println("zzzz"); // 오류가 없기 때문에 이거는 실행
			System.out.println("result : " + result); // 실행을 하지 않는다. 
			System.out.println("ㅋㅋㅋㅋ"); // 위가 오류기 때문에 실행 x 
			
		} catch(Exception e) { // Exception e : 에러가 뭐였는지 알려줌 e.속성();
			// 예외가 발생 되면 
			System.out.println("예외발생!");
		} finally {
			// 부가적인 문법 : 예외가 터지든 안터지든 무조건 실행 되는 문법
			System.out.println("무조건 실행!!");
		}
		
		//JSTL : JSP태그 라이브러리 


		
	}

}
