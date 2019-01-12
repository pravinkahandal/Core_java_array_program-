package cam.ip.calculaterusingswitchcase;

import java.util.Scanner;

public class CalculaterUsingSwitchCaseTest {

	public static void main(String[] args) {
		int No1, No2, res;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No 1");
		No1 = s.nextInt();
		System.out.println("Enter No 2");
		No2 = s.nextInt();
		System.out.println("Choose operation=" + "+,-,*,/");
		String sym = s.next();
		switch (sym) {
		case "+":
			res = No1 + No2;
			System.out.println("res=" + res);
			break;
		case "-":
			res = No1 - No2;
			System.out.println("res=" + res);
			break;
		case "*":
			res = No1 * No2;
			System.out.println("res=" + res);
			break;
		case "/":
			res = No1 / No2;
			System.out.println("res=" + res);
			break;
		default:
			System.out.println("Invalid operation...");
		}
	}

}
