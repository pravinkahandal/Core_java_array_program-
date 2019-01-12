package com.factorial.test;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		int no,fact=1;
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter no for factorial");
		no=s.nextInt();
		
		for(int i=1;i<=no;i++) {
			fact=fact*i;
		}
		System.out.println("Fact="+fact);*/
		
		//2nd way
		
		System.out.println("Enter no to find factorial");
		no=s.nextInt();
		for(int i=5;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("fact="+fact);
	}

}
