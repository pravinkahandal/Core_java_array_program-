package com.ip.largestof3nos;

public class LargestOfThreeNosTest {

	public static void main(String[] args) {
		int a = 50, b = 50, c = 50;
		/*
		 * if(a>b && a>c) { System.out.println("A is greater"); } else if(b>a && b>c) {
		 * System.out.println("B is greater"); } else {
		 * System.out.println("c is greater"); }
		 */

		if (a > b) {
			if (a > c) {
				System.out.println("A is greater");
			}
			else {
				System.out.println("C is greater");
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("B is greater");
			}else {
				System.out.println("C is greater");
			}
		}else if(c>a) {
			if(c>b) {
				System.out.println("c is greater");
			}
			else {
				System.out.println("b is greater");
			}
		}
		else {
			System.out.println("all r equal");
		}
	}

}
