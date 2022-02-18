package class08_Method;

public class Quiz07 {

	public static void main(String[] args) {
		//find average(5,6,7)
		int a,b,c;
		a=5;
		b=6;
		c=7;
		
		int avg= averageNumber (5,6,7);
		System.out.println("average result:"+ avg);
	}
		
		//main	
	public static int averageNumber(int x, int y, int z) {
			int result = (x+y+z)/3;
			return result;
			
	}
}//class
