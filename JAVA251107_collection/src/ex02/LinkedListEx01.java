package ex02;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		//int Integer

		LinkedList<Integer> list = new LinkedList();
        /*
         * array리스트랑 값은 똑같이 나오나 연결방식의 차이, Array list는 지정된 수량만큼의 칸의 배열을 만들어서 작동하기때문에 조회가 빠르나 수정이 많이되면 느리고,
         * Linked list는 지정된 수량만큼의 칸을 만들어서 칸별로 링크를 걸어 작동하기때문에 수정이 용이, Array가 더 상위라 많이쓴다.
         */
		list.add(50);
		list.add(new Integer(40)); //new Integer(5) 5>new Integer(5) > wrapper
		list.add(20);
		list.add(new Integer(0));
		list.add(10);
		list.add(new Integer(30));
		System.out.println(list);

		LinkedList<Integer> list2 = new LinkedList<Integer>(list.subList(1,4)); //sublist (1,4) 1번컨부터 4번째 칸 전까지

		java.util.Collections.sort(list); //list 정렬해줌(오름차순)
		System.out.println(list);

		System.out.println(list.get(3));
		System.out.println(list.get(2));
		remove list

		int num = list.get(2);

		LinkedList<String> list3 = new LinkedList<String>();
		list3.add("kor");
		list3.add("eng");
		list3.add("math");

		String string = list3.get(2);
		System.out.println(list3.get(2));
	}
}
