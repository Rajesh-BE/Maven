package org.collection;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
	ArrayList<Object> value= new ArrayList<>();
	value.add(10);
	value.add(20);
	value.add("java");
	value.add("Selenium");
	value.add("Testing");
	System.out.println(value);
	value.removeAll(value);
	System.out.println("ArrayList will be empty:"+value);//romoveAll method

	
	

	
	
	}
	

}
