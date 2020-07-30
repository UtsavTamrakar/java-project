package day10;

import java.util.Scanner;

public class WhileLoopdemo2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		while(flag) {
			System.out.println("Enter name");
			String name = input.next();
			System.out.println("Name is " + name);
			if (name.equals("utsav")) {
				flag = false;
			}
		}
		System.out.println("exit");
		input.close();
	}
}
