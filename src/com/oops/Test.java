package com.oops;

public class Test {
	String color;
	int age;
	void Obj(String c, int a) {
		color=c;
		age=a;
		System.out.println(color+" \n "+age);
	}

	/*
	 * void disp() {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Test t=new Test();
		t.Obj("black", 10);
		//t.disp();
	}

}
