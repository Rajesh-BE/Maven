package org.exception;

public class Exceptions1 {
	public static void main(String[] args) {
		try {
			int division=5/0;
			System.out.println("Rest of code in try block");
			
		} catch (Exception e) {
			System.out.println("Arithmetic Exception-> " + e.getMessage());
		}
		finally {
			System.out.println("Finally block is always executed whether there is an exception or not");
			
		}
}}