package Java3Project;

public class PolyMission {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();
		/*
		 * Bus, LocalBus 객체였다면 openDoor 메소드 호출 그외는 hoot메소드 호출
		 */

		blowKlaxon(car1); /* Car */
		blowKlaxon(car2); /* Bus */
		blowKlaxon(car3); /* LocalBus */
		blowKlaxon(car4); /* Truck */

	}

	public static void blowKlaxon(Car car) {
		if (car instanceof Bus) { /* localBus도 Bus를 상속 받고 있다. */
			/* 형변환 할 때는 가장 높은 객체로 형변환 해준다. Bus는 localBus도 알고있기 때문에 */
//			Bus bus = (Bus)car;
//			bus.openDoor();
			((Bus) car).openDoor();
			return;
		}
		car.hoot();
	}
	/*
	 * 이 메소드가 Car안에 썻다면 Car.blowKlaxon이라고 해야함 객체화를 하지 않고 썻지 때문에 static을 사용 return 값이
	 * 딱히 없기 때문에 void
	 */

}
