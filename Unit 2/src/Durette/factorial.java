package Durette;

/**
 * Factorial.java
 * finds the factor of a number
 * @author Jack Durette
 *18/04/2017
 */
	import java.util.Scanner;
	public class factorial {


		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			System.out.println("GREETINGS USER! PLEASE ENTER A NUMBER THAT WHICH'S FACTORIAL VALUE YOU WOULD LIKE TO BE AWARE OF.");
			String s = scan.nextLine();
			int y = Integer.parseInt(s);
			System.out.println("the factorial value was: " + factorial1(y));
		}
	public static int factorial1 (int y){
		int product = 1;
		if (y < 0)
		{
			return -1;
		}
		else if (y == 0)
		{
			return 1;
		}
		else
		{
			product = y;
			while (y > 1)
			{
				product = product * (y - 1);
				y--;
			}
		}
		return product;
	}
	

}	
	
	
