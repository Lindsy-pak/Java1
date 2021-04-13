package Java3Project;

import java.util.ArrayList;
import java.util.List;
/*
 Linked List(연결리스트) - 수정이 잦을 때
 Array List(선형리스트 Linear List) - 읽기 위주로 할 때  
 */
public class ArrayListExam {
	public static void main(String[] args) {
		List list = new ArrayList(); //순서가 있는 리스트 
//		List List2 = new LinkedList();
		
		list.add(10); //Object 배열 0번방
		list.add(10.1);
		list.add("ddd");
//		list.add(new Card("", ""));
		/* collection : 값의 순서가 있는 것과 값의 순서가 없는 것으로 분류된다 ex) ol, ul */
		int val2 = (int)list.get(0);
		System.out.println("val2 : " + val2);
		
		Object obj = list.get(1);
		double val = (double)obj;
		System.out.println("val : " + val);
		
		/* add : 값을 넣는다
		 * get : 값을 빼낸다
		 * 값은 모든 것이 들어갈 수 있다. (제한이 없음)
		 * 
		 * */
		
	}

}
