package Durette;

import java.util.Scanner;

/**
 * GCF.java
 * finds GCF 
 * @author Jack Durette
 *18/04/2017
 */
	


	public class GCF {




	public static void  main(String [] args)
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Please enter the first integer:"); // getting the two numbers
	    int Firstnum = input.nextInt();
	    System.out.println("Please enter the second integer:");
	    int Secondnum = input.nextInt();

	    System.out.println("The GCF of " + Firstnum + " and " + Secondnum + " is " +  getGcf(Firstnum,Secondnum) + ".");
	}


	public static int getGcf(int Firstnum , int Secondnum)
	{
	    int gcf = 1;

	    if(Firstnum>Secondnum)
	    {
	        for(int i = Secondnum; i >=1; i--) // finding the GCF
	        {
	            if(Firstnum%i==0 && Secondnum%i ==0)
	            {
	                return i;
	            }
	        }
	    }
	    else
	    {
	        for(int j = Firstnum; j >=1; j--)
	        {
	            if(Firstnum%j==0 && Secondnum% j==0)
	            {
	                return j;
	            }
	        }
	    }   
	    return gcf;

	}
	}

