package com.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionHandling {
	
//	public static void daf() {
//		
//		throw new ArithmeticException("Input is not declared");
//		
//
//	}
//	public static void main(String[] args) {
//		daf();
//	}

	
	public static void file() throws FileNotFoundException  {
	    
		File newfile = new File("test.txt");
		FileOutputStream stream = new FileOutputStream(newfile);
		}
	public static void main(String[] args) throws FileNotFoundException  {
		file();
	}
}
