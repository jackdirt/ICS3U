package Durette;
import java.util.Scanner;
/**
 * IsPrime.java
 * identifies if a number is prime;
 * @author Jack Durette
 *18/04/2017
 */
public class IsPrime {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("GREETINGS USER! PLEASE ENTER A NUMBER THAT IS PRIME.");
		String s = scan.nextLine();
		int y = Integer.parseInt(s);
		
	}
	public static boolean IsPrime (int y){

		if (y <= 0)
		{
			return false;
		}
		else
		{
			for(int i = (int)Math.sqrt(y); i > 1; i --){
				if(isDivisible(y,i)){
					return false;
				}
				
			}
			return true;
		}
	}

	public static boolean isDivisible (int y, int i ){
		if (y%i == 0){
			return true;
		}
		return false; 

	}
}	
