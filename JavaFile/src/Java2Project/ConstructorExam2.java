package Java2Project;

public class ConstructorExam2 {

	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		// 일렉트로 50inch 100Channel 50Voulme

	}

}

class Tv2 {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	Tv2() {
		this("일렉트로", 50, 100, 50); /* this는 두가지 사용방법이 있다. this.-> 읽기쓰기,메소드호출  방법과 this() -> 다른 생성자 호출 */
	}

	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}

	void volumeUp() {
		this.currentVolume += 1;
	}

	void volumeDown() {

		currentVolume -= 1;
	}

	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}

	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVoulme\n", brand, inch, maxChannel, maxVolume);
	}

}
