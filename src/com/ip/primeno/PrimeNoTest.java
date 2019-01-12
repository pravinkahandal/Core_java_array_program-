package com.ip.primeno;

import java.util.Scanner;

public class PrimeNoTest {

	public static void main(String[] args) {
		int no, temp = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no..");
		no = s.nextInt();

		for (int i = 2; i <= no - 1; i++) {
			if (no % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("Not prime");
		} else {
			System.out.println("is prime");
		}
	}

}
