package com.Tasks;
import java.util.Scanner;
class InvalidMarksException extends Exception{
	public  InvalidMarksException(String msg) {
		super(msg);
	}
}

public class Task2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your marks in percentage");
	try {
		int marks=sc.nextInt();
		if(marks>100 || marks<0) {
			throw new InvalidMarksException("Invalid marks are put here");
		}
		System.out.println("Your percentage is "+marks);
	}catch(InvalidMarksException e) {
		System.out.println("Exception "+e.getMessage());
	}
	
}
}
