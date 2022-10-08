package com.java;

public abstract class Basics {
	public abstract void pen(String a,int b,String c);
	public abstract void pen(double d,int e,String f);
	
	public static void main(String[] args) {
		
		
		    
		
		
//-------------------------------------------------------------		
	
//	int a = 30;  //Instance Variable
//    
//	
//	public static int c = 40; // Static Variable
//	
//	public void method1() {
//		int a = 20; // 1. Local Variable 
//	                // 2. A local Variable Cannot be defined with 'static' Keyword
//	                // 3. We can use this variable only within that method
//		System.out.println(a);
//	}
//	
//	
//	public static void main(String[] args) {
//		
//      
//      Basics ref = new Basics();
//      ref.method1();
//      
//	}
//   --------------------------------------------------------------------
//	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;    
//		int c = a+b;        //Adding 2 numbers
//		System.out.println(c);
//}
//-------------------------------------------------------------	
//	public static void main(String[] args) {
//		int a = 10;
//		float f = a;          //Widening TypeCasting
//		System.out.println(a);
//		System.out.println(f);
//}
// -------------------------------------------------------------
//	public static void main(String[] args) {
//		float f=10.5f;
////		int a = f;  //Compile time error
//		int a =(int)f;
//		System.out.println(f);    //Narrowing TypeCasting
//		System.out.println(a);
//}
//  -----------------------------------------------------------------------
      
//      
//	String Original = "Geeks" , Reversed="";
//	int L = Original.length(); //Length is 5 , Count starts from 0,1,2,3,4 
//	// because String is index based.
//		
//	for (int i = (L-1); i>=0 ; i--) { 
//	Reversed=Reversed+Original.charAt(i);
//	}
//	System.out.println("Original String is : " + Original);
//	System.out.println("Reversed String is : " + Reversed);
		
//  Reverse a string program
		
//     ------------------------------------------------------		
	
       
//		int k = 1;
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <i; j++) {
//				System.out.print(k + " ");
//				k++;
//			}
//			System.out.println();
//			}
		
//     1 to 10 increasing step by step program
		
// ---------------------------------------------------------
		
//	String str = "big black bug bit a big black dog on his big black nose";
//	int count;
//    str=str.toLowerCase();
//    String[] words = str.split(" ");
//    System.out.println("Duplicate words in a given string");
//    for (int i = 0; i < words.length; i++) {
//    	count=1;
//    	for (int j = i+1; j < words.length; j++) {
//    		if (words[i].equals(words[j])) {
//    			count++;
//    			words[j]="0";
//		}
//	}
//    	if (count>1 && words[i]!="0") {
//    		System.out.println(words[i]);
//			
//}
//		
//	}
//-------------------------------------------------------
		
		
//		System.out.println("a");
//		try {
//			System.out.println("b");
//			throw new IllegalArgumentException();
//			
//		} catch (RuntimeException e) 
//		{
//			System.out.println("c");
//		}
//		finally
//		{
//			System.out.println("d");
//		}
//		System.out.println("e");
	
//-----------------------------------------------------------
		
//		int [] array = {6,9,8};
//		List<Integer>list = new ArrayList<>();
//		list.add(array[0]); //[6]
//		list.add(array[2]); //[8]
//
//		
//		list.set(1, array[1]);
//		
//		
//		list.remove(0);
//  		
//		System.out.println(list);
		
//------------------------------------------------------------		
	
		
		
	
		
	
		
		
		
		
		
//		 int year = 2016;
//		 boolean leap = false;
//		 if (year%4==0) {
//			 if (year%100==0) {
//			    if (year%400==0) {
//				 leap = true;
//			    }
//			 else {
//				leap = false;
//			}
//	}
//			 else {
//			    leap = true;
//				}
//			 }
//			 else {
//				leap = false;
//			}
//		 if (leap) {
//			System.out.println(year + " is a leap year ");
//		 }
//		 else {
//			System.out.println(year + " is not a leap year ");
//		}		 	
		
//        Leap year or not program
		
//      -----------------------------------------------------------		
		
//		int remainder,sum=0,temporary;
//		int num = 454;
//		
//		temporary=num;  //Storing num value to temporary variable
//	    while (num > 0 ) {  //while condition
//	    	remainder=num%10;  //getting remainder (454%10=45.4)
//	    	sum = (sum*10)+remainder; //0*10=0+45.4 = 45.4(sum value)
//	    	num = num / 10;  //454/10=45.4
//		}
//	    if (temporary==sum) {
//	    	System.out.println(temporary + " is a palindrome number ");
//		}
//	    else {
//			System.out.println(temporary + " is not a palindrome number ");
//		}           		
//      palindrome program for number
		
//     ---------------------------------------------------------
		
//		String S = "LEvel", Rs = "";
//		int L = S.length();
//		for (int i = (L-1); i >=0; i--) {
//			Rs=Rs+S.charAt(i);
//		}
//		if (S.toLowerCase().equals(Rs.toLowerCase())) {
//			System.out.println(S + " is a palindrome string.");
//		}
//		else {
//			System.out.println(S + " is not a palindrome string.");
//		}
//        palindrome program for string
		
//     -----------------------------------------------------------	    
		
//		int a[][]= {{3,4},{2,6}};
//		 int b[][]=new int[2][2];
//		 b[0][1]=6;
//		 b[0][0]=3;
//		 b[1][1]=2;
//		 b[1][0]=1;
//		
//		 for (int i = 0; i < a.length; i++) {
//			 for (int j = 0; j < a.length; j++) {
//				 System.out.print(a[i][j]+" ");
//				
//			}
//			 System.out.println();
//			
//		}
//		 System.out.println();
//		 for (int k = 0; k < b.length; k++) {
//			 for (int l = 0; l < b.length; l++) {
//				 System.out.print(b[k][l]+" ");
//				
//			}
//			 System.out.println();
//			
//		}
//       2 Dimensional Array program 		 
		
		
//     -------------------------------------------------------		
		
//		int n = 4;
//		long factorial = 1;
//		
//		for (int i = 1; i <=n; i++) {
//			
//			factorial=factorial*i; //1*1=1,1*2=2,2*3=6,6*4=24
//		}
//		System.out.println(factorial);
//		
//       Factorial program
				
//       -------------------------------------------------------
		 
//       Scanner read = new Scanner(System.in);
//       System.out.println("Enter a number : ");
		
//		int num = 56;
//		
//		if (num % 2 ==0) {   //even numbers are divisible by 2. so, we are checking the 
//		 remainder by dividing it with 2 , After dividing by 2 , the remainder should be 0.
		 
//			System.out.println(num + " is even "); 
//			}
//		else {
//			System.out.println(num + " is odd ");
//		}
//        Even or odd Program
				
//    ---------------------------------------------------------
		
//		int num = 29;
//		boolean prime = false;
//		for(int i=2;i<=num/2;i++) {
//			if(num % i ==0) {   //if the remainder is 0 after dividing it with '2', then it 
//                    is not a prime number.		 
//				prime = true;
//				break;
//			}
//		}
//		if(!prime) {
//			System.out.println(num + " is a prime number.");
//		}
//		else {
//			System.out.println(num + " is not a prime number.");
//		}
		//Prime number program
			
//    -------------------------------------------------------
		
//		int N=9,term1=0,term2=1;
//		System.out.println("Fibonacci Series till " + N + " terms:");
//		
//	   for (int i = 0; i <=9 ; i++) {
//		   System.out.print(term1 + " ");
//		   
//		   int nextTerm = term1 + term2; //(0+1=1)
//		   term1=term2; //(1)
//		   term2=nextTerm;  //(1)
//	   }
		 
//		//Fibonacci series using 'for..loop'  
	
		 
	   }}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		




