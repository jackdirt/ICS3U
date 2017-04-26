package Durette;
import java.util.Scanner;
/**
 * LargestNum.java
 * identifies the largest number
 * @author Jack Durette
 *18/04/2017
 */
public class LargestNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("please enter three numbers to find out which is the largest!");
		String num1 = scan.nextLine();
		int Num1 = Integer.parseInt(num1);
		String num2 = scan.nextLine();
		int Num2 = Integer.parseInt(num2);
		String num3 = scan.nextLine();
		int Num3 = Integer.parseInt(num3);
		if (Num1 > Num2){
			if (Num1 > Num3){
				System.out.println("the greatest number is: " + Num1);
			}else{
				System.out.println("the greatest number is: " + Num3);
			}
		}else if (Num2 > Num3){
			System.out.println("the greatest number is: " + Num2);
		}else{
			System.out.println("the greatest number is: " + Num3);
		}
	}

}
