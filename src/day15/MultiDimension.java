package day15;

import java.util.Scanner;

public class MultiDimension {

	public static void main(String[] args) {
		final int ROW = 3;
		final int COLUMN = 3;
		int [][] arr = new int[ROW][COLUMN];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter: "); 
		
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j <arr.length; j++) {
					
					arr[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j <arr.length; j++) {
					System.out.print(arr[i][j]);
			}
		}
		input.close();
	}
}

