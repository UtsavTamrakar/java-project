package day9;

import java.util.Scanner;

	public class switchcasedemo2 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your choice");
			String a = input.nextLine();
			switch (a) {
			case "add":
				System.out.println("add");
				break;
			case "sub":
				System.out.println("sub");
				break;
			case "mul":
				System.out.println("multiply");
				break;
			case "divide":
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

