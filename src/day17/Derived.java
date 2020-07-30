package day17;

public class Derived extends Base {
	
	String name = "child name";
	
	public void sayHi() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("hi from child");
		super.sayHi();
	}
}
