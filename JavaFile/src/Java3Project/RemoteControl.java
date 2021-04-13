package Java3Project;

public interface RemoteControl {
	/* public final static은 무조건 자동으로 들어간다. */
	/* 
	 private(같은 클래스만 가능 )
	 default(아무것도 안씀, 같은 패키지 안이면 접근 가능)
	 protected
	 public
	 */
	public abstract void volumUp(); /* public abstract은 자동으로 생긴다. */
	void volumDown();
	void chkVolume();
	
	/* 
	 추상클래스 vs 인터페이스
	 추상클래스 : 다중상속 불가능, 변수/상수 가질 수 있음, 구현부 있는 메소드 가질 수 있음,
	 추상 메소드 가질수 있음
	 인터페이스 : 다중상속 가능, 변수 가질 수 없음(무조건 상수), 구현부 있는 메소드 가질 수 없음(추상메소드만 가질 수 있음)
	 
	 공통점 : 객체화 불가능, 부모타입 역할, 자식한테 추상메서드 오버라이딩 강제성 부여 
	 */
	
	
}
