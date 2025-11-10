package ex01;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		//int Integer

		ArrayList<Integer> list = new ArrayList();

		list.add(50);
		list.add(new Integer(40)); //new Integer(5) 5>new Integer(5) > wrapper
		list.add(20);
		list.add(new Integer(0));
		list.add(10);
		list.add(new Integer(30));
		System.out.println(list);

		ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(1,4)); //sublist (1,4) 1번컨부터 4번째 칸 전까지

		java.util.Collections.sort(list); //list 정렬해줌(오름차순)
		System.out.println(list);

		System.out.println(list.get(3));
		System.out.println(list.get(2));

		int num = list.get(2);

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("kor");
		list3.add("eng");
		list3.add("math");

		String string = list3.get(2);
		System.out.println(list3.get(2));
	}
}
