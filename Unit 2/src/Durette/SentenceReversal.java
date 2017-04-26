package Durette;

import java.util.Scanner;
/**
 * SentenceReversal.java
 * reverses the letters of a sentence 
 * @author Jack Durette
 *18/04/2017
 */
public class SentenceReversal {

	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Hello, please insert the sentence you would like to have reversed.");
		String[] sentence = scan.nextLine().split(" ");
		for (int i = 0; i < sentence.length; i ++){
			for (int j = sentence[i].length()-1; j>= 0; j-- ){
				System.out.print(sentence[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
	
}
