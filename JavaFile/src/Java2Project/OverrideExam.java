package Java2Project;

public class OverrideExam {

	public static void main(String[] args) {
		NumBox nb1 = new NumBox(10);
		NumBox nb2 = new NumBox(10);

		System.out.println(nb1);
		System.out.println(nb2);
		System.out.println("nb1 == nb2 : " + (nb1 == nb2)); // 주소값 비교
		System.out.println("nb1.equals(nb2) : " + (nb1.equals(nb2))); /* 오버라이딩을 하지 않으면 false가 뜬다. */

	}

}

class NumBox {
	private int num;

	NumBox(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		NumBox temp = (NumBox) obj;
		return this.getNum() == temp.getNum();
	}
}