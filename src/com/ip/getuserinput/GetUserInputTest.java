package com.ip.getuserinput;

import java.util.Scanner;

public class GetUserInputTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name=");
		String name=s.next();
		System.out.println("Enter Age");
		int age=s.nextInt();
		System.out.println("Enter gender");
		char gender=s.next().charAt(0);
		System.out.println("Enter Phone No");
		Long pnNo=s.nextLong();
		
		System.out.println("The details are="+name+"  "+age+"  "+gender+"  "+pnNo);
	}

}
