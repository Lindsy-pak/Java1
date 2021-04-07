package Java1Project;

public class ForExam3 {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 10, 56 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------");

		for (int val : arr/* 순서가 있는 모든 변수 다 올 수 있다. */) {/* arr의 값이 순서대로 val에 대입이 된다. */
			System.out.println(val);
		}
		// 목적 : 들어있는 값을 콘솔에 찍고 싶을 때 
		// 가공하고싶을 때는 그냥 for문을 쓴다. 

	}

}
