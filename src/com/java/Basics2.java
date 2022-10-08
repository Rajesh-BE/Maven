package com.java;

public class Basics2 extends Basics{

	@Override
	public void pen(String a, int b, String c) {
		System.out.println(a+" "+b+" "+c );
		
		
	}

	@Override
	public void pen(double d, int e, String f) {
		System.out.println(d+" "+e+" "+ f);
		
		
	}
	public static void main(String[] args) {
		Basics2 ref = new Basics2();
		ref.pen("Rajesh", 22, "B.E");
		ref.pen(7.44, 70, "Software tester");
	}

}
