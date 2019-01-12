 package com.ip.reversestring;

public class ReverseStringTest {

	public static void main(String[] args) {
		String str="pravin";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	}

}
