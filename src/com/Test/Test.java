package com.Test;

public class Test {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.m1();
		c.m2();
		
		Child1 c1=new Child1();
		c1.m1();
		c1.m2();
		c1.m3();
		
		

		
	}
}

class Parent {
	
	public void m1() {
		System.out.println("Test");
	}
}

class Child extends Parent {
	
	public void m2() {
		System.out.println("Test 3");
	}
}

class Child1 extends Child {
	
	public void m3() {
		System.out.println("Test 4");
	}
}






