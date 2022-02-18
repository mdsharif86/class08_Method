package class08_Method;

public class AddingSubstractAssignment {

	public static void main(String[] args) {
		// required: create a number that can add two number
		//required: create a number that can subtract two number
		//create a method that can multiple number
		
		//int result = addNumbers(2,5);
		//System.out.println("Result is" + result);
		
		int result = addNumbers(9, 6);
		
		System.out.println("Add Number" + result);
		
		result = SubtractNumbers(9, 3);
		
		
		System.out.println("Substract is"+ result);
		
		result= MultiplyNumbers(4,8);
		 
		System.out.println("Multiply is" + result);
		
		result = DivisonNumbers(10, 5);
		
		System.out.println("Divison is" + result);
		}//main
	
		public static int addNumbers(int a, int b) {

		int r= a+b;
		return r;
		
	
		}
		
		public static int SubtractNumbers(int a, int b) {

			int r= a-b;
			return r;
			
			
			}
		public static int MultiplyNumbers(int a, int b) {

			int r= a*b;
			return r;
			
			
			}

		public static int DivisonNumbers(int a, int b) {

			int r= a/b;
			return r;
	
	
	}
}//class
