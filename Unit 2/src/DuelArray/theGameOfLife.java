package DuelArray;
import java.util.Scanner;


	public class theGameOfLife {

	/**
	 * theGameOfLife.java
	 * @author Jack Durette
	 * 28/04/2017
	 * this program prints a 20 by 20 grid and then asks the user to place any amount of cells in any place. then, phases take place in which cells will either remain dead, stay alive or become alive based on the number of livings cells in contact with them. 
	 */
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the number of cells you want to place. (no more than 399)");  //asking for user input
			int[][] gamegrid = new int[20][20]; //building the array
			int Xcells = scan.nextInt();
			for (int i = 0; i < Xcells; i++) {
				System.out.println("Please enter the coordinates of the cell (X-space-Y)"); //getting the co-ordinates for the amount of cells stated by the user
				int CellRow = scan.nextInt();
				int CellColumn = scan.nextInt();
				gamegrid[CellRow][CellColumn] = 1;  //placing the number "1" in all designated co-ordinates

			}
			for (int i = 0; i < gamegrid.length; i++) { //printing a grid of zeros
				for (int j = 0; j < gamegrid[i].length; j++) {
					System.out.print(gamegrid[i][j]);
				}
				System.out.println();
			} 
			int value = 0;
			boolean NextPhase = true;
			for (int CurrentPhase = 1;  NextPhase  == true && Xcells !=0; CurrentPhase++) { //reprints the grid with appropriate ones
				int[][] gamegrid2 = new int [20][20];
				for(int i = 0; i < 20; i ++){
					for(int k = 0; k < 20; k ++){
						gamegrid2[i][k] = 0;
					}
				}
				System.out.println("proceed to the next day? (true/ false)"); // asking the user if they want to continue
				 NextPhase = scan.nextBoolean();
				 value = 0;
				for (int i = 0; i < gamegrid.length; i++) {
					value = 0;
					for (int j = 0; j <gamegrid[i].length; j++) {


						if (gamegrid[i][j] == 1) {
							if (gamegrid[i].length > j + 1) {
								if (gamegrid[i][j + 1] == 1) {
									value++;
								}
							}
							if (gamegrid[i].length > j - 1 && j - 1 >= 0) {
								if (gamegrid[i][j - 1] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i - 1 && i - 1 >= 0) {
								if (gamegrid[i - 1][j] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i + 1) {
								if (gamegrid[i + 1][j] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i - 1 && gamegrid[i].length > j - 1 && i - 1 >= 0 && j - 1 >= 0) {
								if (gamegrid[i - 1][j - 1] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i - 1 && gamegrid[i].length > j + 1 && i - 1 >= 0) {
								if (gamegrid[i - 1][j + 1] == 1) {
									value++;
								}
							}

							if (gamegrid.length > i + 1 && gamegrid[i].length > j - 1 && j - 1 >= 0) {
								if (gamegrid[i + 1][j - 1] == 1) {
									value++;
								}
							}

							if (gamegrid.length > i + 1 && gamegrid[i].length > j + 1) {
								if (gamegrid[i + 1][j + 1] == 1) {
									value++;
								}
							}
							if (value == 2 || value == 3) {
								gamegrid2[i][j] = 1;
								Xcells++;
							} else if (value == 1 || value == 4 || value == 5 || value == 6 || value == 7|| value == 8) {
								gamegrid2[i][j] = 0;
								Xcells--;
							}

							value = 0;

						} else if (gamegrid[i][j] == 0) {

							value=0;
							if (gamegrid[i].length > j + 1) {
								if (gamegrid[i][j + 1] == 1) {
									value++;
								}
							}
							if (gamegrid[i].length > j - 1 && j - 1 >= 0) {
								if (gamegrid[i][j - 1] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i - 1 && i - 1 >= 0) {
								if (gamegrid[i - 1][j] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i + 1) {
								if (gamegrid[i + 1][j] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i - 1 && gamegrid[i].length > j - 1 && i - 1 >= 0 && j - 1 >= 0) {
								if (gamegrid[i - 1][j - 1] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i - 1 && gamegrid[i].length > j + 1 && i - 1 >= 0) {
								if (gamegrid[i - 1][j + 1] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i + 1 && gamegrid[i].length > j - 1 && j - 1 >= 0) {
								if (gamegrid[i + 1][j - 1] == 1) {
									value++;
								}
							}
							if (gamegrid.length > i + 1 && gamegrid[i].length > j + 1) {
								if (gamegrid[i + 1][j + 1] == 1) {
									value++;
								}
							}
							if (value == 3) {
								gamegrid2[i][j] = 1;
								Xcells++;
							}
							else if (value == 1 || value == 2 || value == 4 || value == 5 || value == 6|| value == 7 || value == 8) {
								gamegrid2[i][j] = 0;
							}

							
						}
					}
				}
				gamegrid = gamegrid2;
				for(int i = 0; i < 20; i++){
					for (int j = 0; j < 20; j++){
						System.out.print(gamegrid2[i][j]);
					}
					System.out.println();
				}
			}
		}
	}
