package Java3Project;

public class PolyExam2 {

	public static void main(String[] args) {
		// instanceof는 상속관계 일때 사용하는 기능
		
//		Bus bus = new Truck(); /* bus와 truck은 남이기 때문에 강제 형변환도 불가능 상속 관계가 아니기 때문에*/
		Car car1 = new LocalBus();
		LocalBus lb1 = (LocalBus)car1; /* 자기자신을 가리키는것 */
		
		System.out.println(car1 instanceof LocalBus);
		Bus bus1 = (Bus)car1; /* bus가 localbus보다 부모이기 때문에 가능 */
		System.out.println(car1 instanceof Bus);
		
		System.out.println("----------------------");
		
		Car car2 = new Bus();
		System.out.println(car2 instanceof LocalBus);
		/* false 자식 타입은 부모를 가리키지 못한다. : 강제형변환도 불가능 */
		
		System.out.println("-----------------------");
		// 트럭타입은 Truck 객체만 담을 수 있다 (부모만)
		Car car3 = new Truck();
		System.out.println(car3 instanceof Bus);
		/* False truck과 bus는 남이기 때문에 형변환 불가*/
	}

}
