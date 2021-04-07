package Java1Project;

public class ForExam4 {

	public static void main(String[] args) {
		// For-each
		// for each는 그러면 "순서"가 있고, "주소값"을 가진 변수(레퍼런스 변수, 참조변수)에만 사용 가능
		// 반대로 출력은 불가능하다  D - C - B - A로는 출력하지 못한다. 

		
		String[] strArr = {"A", "B", "C", "D"};
		
		for(int i=strArr.length-1; i>=0; i--) {
			System.out.println(strArr[i]);
		}
		
//		for(String val : strArr) {
//			System.out.println(val);
//		}

	}

}
