package DuelArray;
import java.util.Scanner;
public class theGameOfLife {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, welcome to the game of life.");
		System.out.println("Enter the X co-ordinate for your cell");
		int Y = scan.nextInt()-1;
		System.out.println("Enter the Y co-ordinate for your cell");
		int X = scan.nextInt()-1;
		System.out.println("Enter the X co-ordinate for your cell");
		int YY = scan.nextInt()-1;
		System.out.println("Enter the Y co-ordinate for your cell");
		int XX = scan.nextInt()-1;
		System.out.println("Enter the X co-ordinate for your cell");
		int YYY = scan.nextInt()-1;
		System.out.println("Enter the Y co-ordinate for your cell");
		int XXX = scan.nextInt()-1;
		char[][] array1 = new char [20][20];
		

		for(int i = 0; i < array1.length; i ++){
			for(int j = 0; j < array1[i].length; j++){
				System.out.print(array1[i][j] = 'O');
			}
		}
		array1[X][Y] = 'x';
		array1[XX][YY] = 'x';
		array1[XXX][YYY] = 'x';
		
		for(int i = 0;  )
		
	}
}
