package Durette;
import java.util.Scanner;
/**
 * SumDigits.java
 * reverses the letters of a sentence 
 * @author Jack Durette
 *18/04/2017
 */
public class SumDigits {


	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("GREETINGS USER! PLEASE ENTER A NUMBER THAT WHICH'S \nDIGIT SUM YOU WOULD LIKE TO BE AWARE OF.");
		String s = scan.nextLine();
		int y = Integer.parseInt(s);
		System.out.println("the total sum of the digits given was: " + digitsum(y));
		
	}
	public static int digitsum(int y){
			int total = 0;
			while (y>0){
				total = total + y % 10;
				y = y/10;
			}
			return total;
		}
	}
