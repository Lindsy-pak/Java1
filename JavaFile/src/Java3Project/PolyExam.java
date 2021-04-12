package Java3Project;

public class PolyExam {
/*
 	1. 부모타입은 자식 객체 가리킬 수 있다. (참조, 저장)
 	2. 자식타입은 부모 객체 가리킬 수 없다.
 	3. 변수타입은 메소드 호출 여부만 결정!! 
 	(자기가 아는 것만 호출가능)
 	호출이 되었다면 실행되는 것은 객체기준!!!!
 	자식이 더 많은 메소드를 가질 수 있다. (자식은 부모를 못 가르킴)
 */
	public static void main(String[] args) {
		Car car1 = new Bus(); /* 자식 객체의 주소값을 상속 받는다. */
		
//		 Bus bus1 = (Bus)car1;
		 //bus1.openDoor(); 
//		car1.openDoor(); /* 호출 불가능 : Car기준으로 봤을 때 openDoor를 모르기때문에 */ 
		 ((Bus)car1).openDoor(); 
		 

		Car car2 = new Car(); /* 자기 자신주소값을 담을 수 있는 타입 */
		Car car3 = new LocalBus();
		
		Bus bus1 = (Bus)car1;
		bus1.openDoor();
		bus1.hoot();
		Car carP = bus1;
		carP.hoot();
		
		System.out.println("----------(1)");
		Car carP2 = new Truck();
		Truck truck1 = (Truck)carP2;
		Car carP3 = truck1;
		carP3.hoot(); /* 뒤에 객체기준 */
		
		System.out.println("----------(2)");
		Car carP4 = new LocalBus();
		Bus bus2 = (Bus)carP4;
		LocalBus lb = (LocalBus)bus2;
		lb.hoot(); 

		System.out.println("끝!");

	}

}
