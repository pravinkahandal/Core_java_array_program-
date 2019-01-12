package com.factorial.test;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no..");
		int no = s.nextInt();
		int fact = 1;
		FactorialUsingRecursion fur = new FactorialUsingRecursion();
		fur.getFactorial(no);
		System.out.println("factorial of" + no + "is" + fact);

	}

	public int getFactorial(int no) {
		if (no >= 1) {
			return (no * getFactorial(no - 1));

		}
		return 1;
	}
}
