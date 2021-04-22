package Project;

public class ExceptionExam3 {

	public static void main(String[] args) {
		Calc2 calc = new Calc2();
		
		Exception e = new Exception(); // 어떤 오류가 났는지 알수 있는 객체 
		
		int result = 0;
		try {
			result = calc.div(10, 0);
		} catch (Exception abc) { // 여기서 abc는 이름임 
			e.printStackTrace(); // 뭐 때문에 어떤 에러였는지 알려주는 메서드 
			System.out.println("예외가 발생된다면 처리하고 싶은 내용들!");
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("result : " + result);
	}

}
class Calc2 {
	int div(int n1, int n2) throws Exception { // throws : 리턴에서 예외가 발생했다면 처리를 하지 않음
		return n1 / n2; // throws : 알아서 예외처리를 하게 함 -> catch를 통해 
	}
}
// Exception은 예외의 최상위 객체이다!!!
