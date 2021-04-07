package Java2Project;

public class ConstructorExam {

	public static void main(String[] args) {              
		// 객체지향 언어는 모두 생성자를 사용한다.
		// 생성자는 객체가 만들어질 때 까지 호흡해야한다. 
		Tv tv = new Tv("Samsung", 100, 200, 100);
//		tv1.brand = "Samsung";
//		tv1.inch = 100;
//		tv1.maxChannel = 200;
//		tv1.maxVolume = 100;
		tv.displayState();
		//Samsung 100inch 100Channel 100Voulme
		Tv tv2 = new Tv("LG", 120, 300, 200);
		
		tv2.displayState();
		//LG 200inch 150Channel 200Voulme
		
		
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();

		tv.displayVolume(); // 현재 볼륨 : 3

		tv.volumeDown();
		tv.volumeDown();
		tv.displayVolume();
	}

}

class Tv {
	static String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;

	// 기본 생성자
	// 생성자 vs 메소드
	// 생성자 이름은 클래스명이랑 같다. 
	// 리턴타입이 없다. 앞에 void int 적을 수 없다. (타입을 적는 순간 메소드가 된다)
	// 생성자는 메소드의 한 부분이지만 생성할 때만 사용하고 그 외는 사용하지 않는다. (객체생성 할 때만 사용 할 수 있다.)
	// 목적 : 기본생성자는 컴파일러가 생성자가 하나도 없을 시 넣어준다. 
	Tv(String brand, int inch, int maxChannel, int maxVolume) { 
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	
	void volumeUp() {
		this.currentVolume += 1; /* this는 자기 자신의 주소값*/
//		currentVolume++;
	}

	void volumeDown() {
//		int currentVolume = 0; -> X : 똑같은 이름의 변수를 사용하면 밑에서 가장 가까운 식을 사용하여 voulmeDown 안에서만 스코프가 적용되서 값이 0으로 뜬다.
		currentVolume -= 1;
	}

	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVoulme\n", brand, inch, maxChannel, maxVolume);
	}

}