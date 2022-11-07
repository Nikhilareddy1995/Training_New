package com.collections;

public class ArrayExample {
	public static void main(String[] args) {
		//memory point of view and only store homogenious
		// object
		int[] numbers = new int[3];
		numbers[1] = 10;
		numbers[2] = 20;//49999
		int[] values = { 1, 7, 8, 34, 9 };
		System.out.println(values[3]);

		System.out.println(numbers);

		System.out.println(values.toString());

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		//
	}
}
