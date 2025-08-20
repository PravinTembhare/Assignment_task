package com.Tasks;

import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int no=sc.nextInt();
	int evensum=0;
	
	int oddsum=0;
	
	while(no>0) {
		int n=no%10;
		if(n%2==0) {
			evensum=evensum+n;
			
		}else {
			oddsum=oddsum+n;
		}
		no=no/10;
	}
	System.out.println("The Sum of Even number is "+evensum);
	
	System.out.println("The Sum of Odd number is "+oddsum);	
	
}

}
