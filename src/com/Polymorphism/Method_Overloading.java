package com.Polymorphism;

public class Method_Overloading {
	
	public void Animal() {
		 System.out.println("The animal makes a sound");
		 }

}
 class Pig extends Method_Overloading{
	@Override
	public void Animal() {
		System.out.println("The pig says: wee wee");
		
	}
	
}
class Dog extends Method_Overloading{
	@Override
	public void Animal() {
		System.out.println("The dog says: bow bow");
		
	}
}
	   class Main{
	public static void main(String[] args) {
		Method_Overloading A = new Method_Overloading();
		Method_Overloading B = new Pig();
		Method_Overloading C = new Dog();
		A.Animal();
		B.Animal();
		C.Animal();
	}
	}

