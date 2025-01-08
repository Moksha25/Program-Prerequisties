import java.util.*;

public class prog6 {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double Principal = sc.nextDouble();
		double Rate = sc.nextDouble();
		double Time = sc.nextDouble();
		
		System.out.println((Principal * Rate * Time) / 100);
	}
}