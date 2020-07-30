package day16;

public class MethodDemo1 {

		//<access modifier> void < method name> (zero to any number of args)
		public void sayHello() {
			System.out.println("hello");
		}
		
		public void greet(String name) {
			System.out.println("goodmorning");
		}
		
		public String returnInfo() {
			String name = "Krishna";
			String address = "kathmandu";
			return name + "  " + address;
		}
		
		public static int findMax(int a, int b) {
			int max = 0;
			if (a > b) {
				max = a;
			}
			else {
				max = b;
			}
			return max;
		}
		
		public static void main (String[] args) {
			MethodDemo1 ob = new MethodDemo1();
			ob.sayHello();
			ob.greet("Trump");
			
			
		}
}
	

