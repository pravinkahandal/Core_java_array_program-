package com.ip.checkleapyearornot;

public class CheckLeapYearTest {

	public static void main(String[] args) {
		int year = 2018;
		/*if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Leap year");
				} else {
					System.out.println("Not leap year");
				}

			} else {
				System.out.println("Leap Year");
			}

		} else {
			System.out.println("Not Leap year");
		}*/
		//2nd way
		
		if((year%4==0)||(year%100==0)&&(year%400!=0)) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not");
		}
	}

}
