package collectionex;

import java.util.LinkedList;

public class ListEx {

	public static void main(String[] args) {

		LinkedList<Integer> arrayList = new LinkedList<>();
		// data prep
		for (int i = 0; i < 10e5; i++) {
			arrayList.add(i);
		}

		System.out.println("In progress......");
		long start = System.currentTimeMillis();

		for (int i = 0; i < 10e6; i++) {
			arrayList.add(5000,i);
		}

		long end = System.currentTimeMillis();
		
		System.out.println(end-start);

	}

}
