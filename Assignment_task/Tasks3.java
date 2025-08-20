package com.Tasks;

import java.util.Scanner;

public class Tasks3 {
public static void main(String[] args) {
	boolean prime=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	for(int i=2;i<no;i++) {
		if(no % i == 0) {
			System.out.println(i);
			prime=false;
		}
	}
	if(prime==true) {
		System.out.println("None (the number is prime or has no factors other than 1 and itself)");
	}	
}
}