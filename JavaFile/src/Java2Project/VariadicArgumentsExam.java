package Java2Project;

public class VariadicArgumentsExam {

	public static void main(String[] args) {
		// 가변인자 : 오버로딩의 단점을 보완 해주는 방법 
		// 똑같은 일을 할 때, 메소드를 너무 많이 만들게 되니까 가변인자 방법을 사용하여 호출의 제한을 두지 않는다. 
		
		Calc2 cal = new Calc2();
//		int result = cal.sum(new int[] {10, 20}); -> 바로 배열을 만드는 방법
		int result = cal.sum(10, 20);
//		cal.sum(10, 20);
		System.out.println("result : " + result);
		result = cal.sum(10, 20, 30);
		System.out.println("result : " + result);
		result = cal.sum(10, 20, 30, 40);
		System.out.println("result : " + result);
		result = cal.sum(10, 20, 30, 40, 50, 60);
		System.out.println("result : " + result);
	}

}
class Calc2 {
	int sum(int... vals) { /* = 정수형 배열 */
		int sum = 0;
		for(int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}
