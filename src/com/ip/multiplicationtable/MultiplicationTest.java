package com.ip.multiplicationtable;

import java.util.Scanner;

public class MultiplicationTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no = 0;
		System.out.println("Enter No");
		no = s.nextInt();
		for(int i=1; i<=10;i++){
			
			System.out.println("Multiplication table of" + no + "*" + i+"="+(no*i));
		}
	}

}
