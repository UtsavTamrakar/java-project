package day9;

import java.util.Scanner;

public class Swtichcasedemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice");
		int a =input.nextInt();
		switch (a) {
		case 1:
			System.out.println("add");
			break;
		case 2:
			System.out.println("sub");
			break;
		case 3:
			System.out.println("multiply");
			break;
		case 4:
			System.out.println("divide");
			break;
		default:
			System.out.println("invalid");
		}
		System.out.println("more code ...");
		System.out.println("exit");
		input.close();
		
	}
}
