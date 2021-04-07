package Java2Project;

public class InstanceExam5 {

	public static void main(String[] args) {
		Car[] carArr = new Car[5]; /* Car라는 배열타입만 올 수있는 carrArr변수를 새로 만드는데
		5개의 방을 만든다. 그 방안에 carArr의 주소값을 가진다. 참조배열은 각 방에는 null이 들어가있다. */
//		Car car1 = new Car(); -> Car와 Car[]는 다르다.  
		
		
		System.out.println(carArr); /* 주소값 */
		System.out.println(carArr[0]); /* 주소값안에는 아직 값이 없어서 null이다 */
		
		/* void는 리턴값이 없다. 메소드 밖으로 나가지않음  비보이드는 어떤 값이든 나간다.  */
		
		//똑같은 이름의 클래스를 같은 패키지 안에 만들지 못함. 다른 클래스에 Car를 더이상 만들지 못함
	}

}
