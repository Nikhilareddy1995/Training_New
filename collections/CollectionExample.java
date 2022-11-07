package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionExample {
	public static void main(String[] args) {
		int[] numbers = new int[5000];// 4999
		numbers[100] = 123;
		Math.sqrt(4);// import-- java.lang.*

		ArrayList list = new ArrayList<>();// 10-->11-->16(cc*3/2)+1
		// insertion order, allow duplicates , null values
		list.add(123);// 0
		list.add(231.0);// 1
		list.add("Nikhila");// 2
		list.add("Nikhila");
		list.add("nikhila");
		list.add("null");

		// System.out.println(list);

		for (int i = 0; i <= list.size() - 1; i++) {
			System.out.println(list.get(i));
		}

		for (int i = list.size() - 1; i >= 0; i--) {

		}

		for (Object a : list) {
			// System.out.println(a);
		}

		// Generics--1.5v
		ArrayList<String> al = new ArrayList<>();
		al.add("Nikhila");
		al.add("test");
		al.add("India");
		al.add("lap");

		for (String a : al) {
			// System.out.println(a);
		}

		HashSet setValues = new HashSet();// 10-->11-->16(cc*3/2)+1
		// insertion order, allow duplicates , null values
		System.out.println("---------------------");
		setValues.add(123);// 0
		setValues.add(231.0);// 1
		setValues.add("Nikhila");// 2
		setValues.add("Nikhila");
		setValues.add("nikhila");
		setValues.add("null");
		for (Object a : setValues) {
			System.out.println(a);
		}

	}
}
