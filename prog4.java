import java.util.*;

public class prog4 {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		double Area = Math.pow(radius,2);         
		
		System.out.println("Area = " + 3.14 * Area);
	}
}