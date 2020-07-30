package day9;

public class Elseif {
	public static void main(String[] args) {
		int marks = 65;
		if (marks < 0 || marks >=101) {
			System.out.println("invalid");
		}
		else if (marks >=80 && marks <=100) {
			System.out.println("Distinction");
		}
		else if (marks >=70 && marks <=79) {
			System.out.println("First");
		}
		else if (marks >=60 && marks <=69) {
			System.out.println("second");
		}	
		else if (marks >=50 && marks <=59) {
			System.out.println("Third");
		}
		else {
			System.out.println("Fail");
		}
	}
}
