package day10;

import java.util.Scanner;

public class Forloopdemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		
		for(int i=1; i<=a; i++) {
				System.out.println(i);
		}
		input.close();
	}
}
