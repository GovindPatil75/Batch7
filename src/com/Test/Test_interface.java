package com.Test;

public class Test_interface implements I1,I2{

	public static void main(String[] args) {
		Test_interface t=new Test_interface();
		t.m1();

	}

	@Override
	public void m1() {
		System.out.println("Test");
		
	}

}
