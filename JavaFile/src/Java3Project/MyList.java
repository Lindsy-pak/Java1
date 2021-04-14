package Java3Project;

public interface MyList {
	public abstract void add(int a); /* public abstract 자동으로 생긴다.*/
	int size();
	int get(int b);
	int remove();
	/* overloading 생성자의 매개변수를 다르게 주어서 만드는 방법 */ 
	void add(int index, int value);
	int remove(int num);
	/* interface는 선언부만 입력해주고 {} 구현부는 입력하지 않는다. */
	
	
}
