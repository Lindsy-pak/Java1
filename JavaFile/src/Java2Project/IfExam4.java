package Java2Project;

public class IfExam4 {

	public static void main(String[] args) {
		// 삼항식
		System.out.println(abs(-10));
		System.out.println(abs(7));
		

	}
//	public static int abs(int val) {
//		if(val < 0) {
//			return -val;
//		}
//		return val;
//	}
	public static int abs(int val) {
		return val < 0 ? -val : val;
		/* return 조건식 ? true(참이라면 실행) : False(참이라면 실행) */
		/* MethodMission2에 있는 abs와 비교 */
	}

}
