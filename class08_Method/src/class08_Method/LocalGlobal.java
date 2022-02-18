package class08_Method;

public class LocalGlobal {

	static int area=0;
	
	
	public static void main(String[] args) {
		//calculate the rent of area where rent is 2 square feet
		//area: length*width=50ft*10ft
		int area = CalculateAreaofRectange(50,10);
		int rent =area*2;
		System.out.println("Rent is" + rent);
	}//main
	
	
	//Method with return
	public static int CalculateAreaofRectange(int lenght, int width) {
		
		
		//double area = length*width;
		int area= lenght*width;
		return area;
		//System.out.println("Area of store is" + area);
	}
}//class
