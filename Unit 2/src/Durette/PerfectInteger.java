package Durette;


	

	/**
	 * PerfectInteger.java
	 * 21/04/17
	 * The program determines all of the numbers between 1 and 100 that are equal to the sum of their factors except themselves. It then prints these values.
	 * @author Jack Durette
	 *
	 */
	public class PerfectInteger {

		public static void main(String[] args) {
			for (int x = 1; x <= 100; x++) {
				if (isPerfect(x) == true) {
					System.out.println(x);
				}
			}
		}
	
		public static boolean isPerfect(int number) { //The method checks if each number is equal to the sum of its factors except itself.
			int sum = 0;
			for(int i = 1; i < number; i++){
				if(number %i == 0){
					sum = sum + i;
				}
			}
			if(sum == number){
				return true;
			}
			return false;
		}
	}

