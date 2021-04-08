package Java2Project;

public class StaticExam5 {

	public static void main(String[] args) {
		// n1 = 10;
		// n2 = 20;
		// sum() 메소드 호출하여 결과값을 콘솔에 찍으시오.
		StaticExam5 se5 = new StaticExam5();
		se5.n1 = 10;
		se5.n1 = 20;
		int result = se5.sum();
		System.out.println("result : " + result);
		

	}
	int n1;
	int n2;
	public int sum() {
		return n1 + n2;
	}

}
