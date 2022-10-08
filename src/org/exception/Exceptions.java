package org.exception;
import java.util.Scanner;
public class Exceptions {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your register number");
		int reg =s.nextInt();
		try {
			if (reg<0) {
				throw new ArithmeticException("The number entered is not positive");
				}
			else {
				System.out.println("Valid reg number");
			    }
			} catch (ArithmeticException e) {
				System.out.println("An exception is thrown");
				System.out.println(e.getMessage());
		}
		finally {
			String name="Rajesh";
			String name1=s.next();
			if (name1!="Rajesh") {
				System.out.println("Name is incorrect");
			}
			else {
				System.out.println("Name is correct");
	}}}}		
		
