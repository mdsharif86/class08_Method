package class08_Method;

public class Quiz08 {

	public static void main(String[] args) {
	
	double grossIncome= 90000;
	int pecentage = 26;
	
	 generateNetIncome(grossIncome, pecentage);

	}//main
	public static void generateNetIncome(double grossIncome, double tax) {
		double taxAmount= grossIncome*(tax/100);
		double netIncome = grossIncome-taxAmount;
		System.out.println("Net Income is " + netIncome);
		
	}
}//class
