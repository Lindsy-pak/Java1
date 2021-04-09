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
/*
 * 메소드 안에 없으면 전역변수
 * 
 * 앞에 static 붙으면 : 클래스 전역변수[멤버필드] static 안붙으면 : instance 전역변수 (객체화해야 사용할 수 있기
 * 때문) 메소드 안에서 선언된 것은 : 지역변수
 * 
 * 지역변수, 전역변수 이름은 같을 수 있음
 * 
 * this 없으면 가장 가까운 변수? 선택하고 this.쓰면 instance변수를 선택하게 됨 (~ 객체 자신의 )
 * 
 * static안에서는 this.의미가 없다. 바로 메모리에 올라가기 때문에
 * 
 * static변수는 get set 안만든다 (만들어도 되지만 의미x)
 * 
 * 파라미트로 넘어왔는 값으로만 작업이 이루어진다면 static 붙이기, 멤버필드 사용하면 static 붙이면 안된다 !
 * 
 * 제일 위에 부모는 무조건 object를 상속받도록 되어있음 자바는 다른상속 안되고 무조건 하나만 상속받을 수 있음
 */
