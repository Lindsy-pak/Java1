package Java2Project;

public class StaticExam3 {

	public static void main(String[] args) {
		CalcInstance ci = new CalcInstance();
		int result = ci.sum(10, 20);
		System.out.println("result : " + result);
		
		int result2 = CalcStatic.sum(10,20);
		System.out.println("result2 : " + result2);

	}

}

class CalcStatic {
	static int sum(int num1, int num2) { /* static은 이미 메모리에 올라가 있기 때문에 객체화 시킬 필요가 없다. */
		return num1 + num2;
	}
}
class CalcInstance {
	int sum(int num1, int num2) { /* 메모리에 올리기 위해서 객체화를 해준다. */
		return num1 + num2;
	}
}