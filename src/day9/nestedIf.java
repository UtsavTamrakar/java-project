package day9;

public class nestedIf {
	public static void main(String[] args) {
		int a=5, b=4, c=6;
		
		if(a > b) {
			if(a > c) {
			System.out.println("a is greater than b and c");
			}
			else {
			System.out.println("a is greater than b but less than c");
			}
		}
		else {
			System.out.println("a is less than b");
		}
	}
}
