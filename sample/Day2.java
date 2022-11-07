package com.sample;

public class Day2 {
	int a;

	// default and parameterized
	public Day2(int a) {

	}

	public Day2() {

	}

//over loading
	public void add(int a) {

	}

	public void add(int b,int a) {

	}
	public void add() {
		
	}

	public static void main(String[] args) {
		// default object creation --> default constructor
		Day2 day = new Day2();
		day.add(10);
		

	}

}

//what are the rules--> to create identifier, 15 size
//public, private, default and protected--access specifiers
