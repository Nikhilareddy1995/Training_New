package com.collections;

//reuse the methods
public class Inheritence extends B {
	int a=10;

	public static void main(String[] args) {

		Inheritence polymorphismExample = new Inheritence();
		B b = new Inheritence();
		B b1=new B();
		b.toString();
		
		polymorphismExample.add(); //Hello
		b.add();//Hello
		b1.add();
		System.out.println(b.a);
		System.out.println(polymorphismExample.a);
	}

}

class B {
	int a=20;
	public void add() {
		System.out.println("Hi");
	}

	public void add(int a) {
		

	}
}
