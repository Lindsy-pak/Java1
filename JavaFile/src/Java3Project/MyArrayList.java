package Java3Project;

public class MyArrayList implements MyList {
	/* 연결리스트가 아니라 배열리스트 이기때문에 방을 계속해서 새로 만들어주어야 한다. */

	private int[] arr; // 여기서는 null

	public MyArrayList() {
		arr = new int[0]; // null인 값을 [0]으로 초기화 시켜준다.
	}

	@Override
	public void add(int value) {
		int[] temp = new int[arr.length + 1]; /* 일시적인 배열 값을 만들어주고 int[여기는 방갯수를 말한다] 그래서 방하나를 만들어주기 위해 +1 */
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = value;
		arr = temp;
	}
	//방법 1
	@Override
	public void add(int index, int value) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < index; i++) {
			temp[i] = arr[i]; // i가 index 전일때는 temp[i]에 arr[i] 넣고
		}
//		for(int i=index + 1; i<temp.length; i++) {
//			temp[i] = arr[i - 1]; /* temp를 기준으로 잡았을 때 */
		for (int i = index; i < arr.length; i++) { /* arr을 기준으로 잡았을 때 arr를 temp에 넣어주는 작업 */
			temp[i + 1] = arr[i];
			// i가 index 부터는 temp[i+1]에 arr[i]를 넣어주면 됩니다.
		}
		temp[index] = value; // temp[index] 에 value값 넣기
		arr = temp;
		// 이렇게 하면 temp의 끝방에 값이 추가됩니다.
		// 값을 넣어야할 곳은 temp의 index번 방.
	}
	//방법 2
//	@Override
//	public void add(int idx, int val) {
//		int[] temp = new int[arr.length+1];
//		for(int i = 0; i < arr.length; i++) {
//			int tIdx = i < idx ? i : i+1;
//			temp[tIdx] = arr[i];
//		}
//		temp[idx] = val;
//		arr = temp;
//	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}

	public int remove() {
		int[] temp = new int[arr.length - 1]; /* 값을 하나 삭제해주어야 하기 때문 */
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}
		int lastVal = arr[temp.length]; /* temp = arr.length-1 이기 때문에 */
		arr = temp;
		return lastVal;
	}
	//방법 1 
//	@Override
	public int remove(int delNum) {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < delNum; i++) {
			temp[i] = arr[i];
		}
		for(int i=delNum; i<temp.length; i++) { 
			temp[i] = arr[i+1];
		}
		int delVal = arr[delNum];
		arr = temp;
		return delVal;
	}
	//방법 2
//	@Override
//	public int remove(int idx) {
//		int delVal = arr[idx];
//		
//		int[] temp = new int[arr.length - 1];
//		for(int i=0; i<temp.length; i++) {
//			int tIdx = i < idx ? i : i+1;
//			temp[i] = arr[tIdx];
//		}
//		arr = temp;
//		return delVal;
//	}

}
