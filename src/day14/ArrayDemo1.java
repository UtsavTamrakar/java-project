package day14;

import java.util.Scanner; 

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array " );
		int size = input.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter element " );
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int sum = 0;
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		input.close();

		System.out.println("Sum of the array is: " + sum );	
}
	}

