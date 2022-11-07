package com.collections;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(34);
		list.add(13);
		list.add(348);
		list.add(1);
		list.add(3);

		for (Integer number : list) {
			if (number % 2 == 0)
				System.out.println(number);
		}

	}
}
