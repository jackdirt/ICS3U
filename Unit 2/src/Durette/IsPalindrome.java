package Durette;

import java.util.Scanner;
/***
 * IsPalindrome.java
 * 19/04/2017
 * @author Jack Durette
 *identifies if a word is a palindrome
 */
public class IsPalindrome {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word you think is a palindrome!");
		String word = scan.nextLine();
		
		int length = word.length();
		String reverse = "";
		
		for (int i = length - 1; i >= 0; i--){
			reverse = reverse + word.charAt(i); //rebuilding the word backwards
		}
		
		
		if (word.equals(reverse)){ // comparing the word forwards and backwards
			System.out.println("This word is a palindrome!");
		}else{
			System.out.println("This word is not a palindrome!");
		}
	}
	
}
