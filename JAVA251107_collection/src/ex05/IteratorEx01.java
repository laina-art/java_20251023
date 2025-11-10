package ex05;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {

	//Iterator는 for문과 비슷하나 더많은 제어가 가능한 반복자

	public static void main(String[] arg) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(9);
		list.add(15);

		System.out.println(list);

		for(int i : list) {
			System.out.println(i + " ");
		}

		System.out.println("\n----------Iterator----------");

		//반복자 획득
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { //has nest 다음에 가져올 값 있는지 묻는것
			System.out.println(it.next());
		}

		it = list.iterator();
		while(it.hasNext()) { //has nest 다음에 가져올 값 있는지 묻는것
			System.out.println(it.next());
		}
	 }
	}