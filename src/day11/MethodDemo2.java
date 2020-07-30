package day11;

public class MethodDemo2 {
	
	public void printInfo(String name, int age) {
		System.out.println("name is: " + name);
		System.out.println("Age is "+ age);
	}

	public static void main(String[] args) {
		MethodDemo2 obj = new MethodDemo2();
		obj.printInfo("Ram",14);

	}

}
