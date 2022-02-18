package class08_Method;

public class Method_Convention {

	public static void main(String[] args) {
		
		
		System.out.println("Hi there");
		//add two number 3+4
		addTwoNumber(3,4);
		
		System.out.println("any task");
		
		//add two number 2+7
		addTwoNumber(2,7);
		
		
	}//main
	//Method Declaration
	public static void addTwoNumber(int a, int b) {
					//int a;
//method body		//int b;
					//a=5;
					//b=6;
		
		int result = a+b;
		System.out.println("Result is" + result);
	
	}//add two numbers

}//class
