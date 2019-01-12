
package com.ip.reverseno;

import java.util.Scanner;

public class ReverseNumberTest {
	int rev,rem=0;
	static int no;
	public static void main(String[] args) {
		ReverseNumberTest rnt=new ReverseNumberTest();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no to reverse...");
		no=s.nextInt();
		rnt.revNo(no);
		
		
	}
	public void revNo(int no) {
		while(no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			//revNo(no);
		}
		System.out.println(rev);
	}
}
