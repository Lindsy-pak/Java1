package Java2Project;

public class StaticExam4 {		// static을 붙일수 없는 메소드

	public static void main(String[] args) {
		//CalcInstance2 객체화
		//num1 = 10, num2 = 20;
		//더한 값을 콘솔에 출력 
		
		CalcInstance2 cal2 = new CalcInstance2();
		cal2.num1 = 10;
		cal2.num2 = 20;
		
		int result = cal2.sum();
		System.out.println("result : " + result);
		
		String.format("%d", result); /* static format임 !! */
		Math.random(); /* static 메소드 :  앞에 대문자이면 static이라고 생각하면 됨 */
		/* 데이터를 다루면 static을 잘 안쓴다. static을 쓰면 마지막 값이 통일되기 때문에 구분해 놓기 힘들기 때문이다. */
	}

}
class CalcStatic2 {
	int num1; /* 변수는 무조건 객체화를 해야 사용 할 수있다. static이 먼저 메모리에 올라간다. static붙은 메소드는 static멤버변수 만 사용가능 */
	int num2;
	static int sum(int num1, int num2) { /* 파라미터로 들어온 값만으로 한다면 static을 붙이는게 맞다 */
		return num1 + num2;
	}
}
class CalcInstance2 {
	int num1; /* static이 안붙으면 무조건 객체화!!! */
	int num2;
	int sum() { 
		return num1 + num2;
	}
}