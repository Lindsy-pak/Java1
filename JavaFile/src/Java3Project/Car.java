package Java3Project;

public class Car {
	public void hoot() {
		System.out.println("빵! 빵!");
	}
}
class Bus extends Car {
	public void openDoor() {
		System.out.println("승객문을 열다.");
	}
	@Override
	public void hoot() {
		System.out.println("Bus Chitty Chitty Bang Bang!");
	}
}
class Truck extends Car {
	@Override
	public void hoot() {
		System.out.println("Truck Chitty Chitty Bang Bang!");
	}
}
class LocalBus extends Bus {
	@Override
	public void hoot() {
		System.out.println("LocalBus Chitty Chitty Bang Bang!");
	}
}


