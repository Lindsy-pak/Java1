package Java3Project;

public class ArrayListMission {

	public static void main(String[] args) {
		MyList list = new MyArrayList();
		
		list.add(10);
		list.add(20);
//		list.add(30);
		list.add(40);
		list.add(50);
		list.add(2, 30);
		
		int delVal = list.remove(1);
		System.out.println("delVal : " + delVal); // 20
		// 삭제하면 1번반 값 20이 삭제되도록 
		
		int val = list.remove(); /* 값 삭제 메소드 */
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d : %d\n", i, list.get(i));
		}

	}

}
