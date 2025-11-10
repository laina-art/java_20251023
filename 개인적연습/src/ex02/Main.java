package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Student arrays[] = new Student[3];


		int[] iArr2 = {10, 20, 30, 40, 50};

         List<Integer> list = new ArrayList<Integer>();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);


         List<Integer> list1 =
        		 new ArrayList<Integer>(Arrays.asList(0, 20, 30, 40, 50));
         System.out.println("list1: " + list);

	}

}
