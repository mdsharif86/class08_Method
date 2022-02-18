package class08_Method;

public class MethodSignature {

	public static void main(String[] args) {
		
		//Required: create a method that can add two numbers
		
		addNumbers(4, 3);
		
		addNumbers(2.5, 3);
		
		addNumbers(5, 1.5);
		
		addNumbers(1,4,2);

	}//main
	
	public static void addNumbers(int a, int b) {
		System.out.println("add int+int" + (a+b));
	}
	
	public static void addNumbers(double a, int b) {
		System.out.println("add double+int" + (a+b));
	}
	
	public static void addNumbers(int a, double b) {
		System.out.println("addint+double" + (a+b));
	}
	
	public static void addNumbers(int a, int b, double c) {
		System.out.println("addint+int+double" + (a+b+c));
	}
	
}//class
