package com.Test;

public class Test1 {

	public static void main(String[] args) {
	
		child5 c1=new child5();
		c1.m1();
		c1.m5();
		
		Child6 c2=new Child6();
		c2.m1();
		c2.m6();
		
		
	}

}

class parent1 {
	
	public void m1() {
		System.out.println("T");
	}
}

class child5 extends parent1{
	
	public void m5() {
		System.out.println("T1");
	}
}

class Child6 extends parent1{
	
	public void m6() {
		System.out.println("T3");
	}
}






