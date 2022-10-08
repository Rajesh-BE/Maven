package org.emp;

public class Employee {
	private void empId() {
		System.out.println("empId:"+ 312117);
    }
	private void empName() {
		System.out.println("empName: Rajesh kumar K");
	}
	private void empDOB() {
		System.out.println("empDOB:01/01/1999");
	}
	private void empPhone() {
		System.out.println("empPhone:7397399558");
	}
	private void empEmail() {
		System.out.println("empEmail:rajeshrockshere380@gmail.com");
	}
	private void empAdress() {
		System.out.println("empAdress:chennai-600001,sowcarpet,broadway");
	}
	public static void main(String[] args) {
		Employee ref=new Employee();
		ref.empId();
		ref.empName();
		ref.empDOB();
		ref.empPhone();
		ref.empEmail();
		ref.empAdress();
		}
	    }
