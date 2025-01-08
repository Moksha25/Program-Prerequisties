import java.util.*;

public class prog5 {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		double height = sc.nextDouble();
		double Area = Math.pow(radius,2);
		
		System.out.println(" Volume = " + 3.14 * Area * height);
	}
}