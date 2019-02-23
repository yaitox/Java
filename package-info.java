/**
 * 
 */
/**
 * @author pbohorquez
 *
 */
package packag.e;

import java.util.Scanner;

class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// ATM

		System.out.println("Welcome to the system!");

		 int value, dollar_Hundred, cash_twentyThousand, billetes_diezMil, residue50000, residue20000, residue10000;

		 System.out.println("Please digit a value that you want\nthe value has to be greater than 10 and smaller than 240 dollars\nand has to be multiple of 10");
		 valor = scanner.nextInt();
		 if(value<10)
		  System.out.println("The value has to be greater than 10!");
		 if(value<10)
		    System.exit( 0 );
		 
		 
		 {
		  if (value % 10 != 0)
		   System.out.println("Only multiples of 10!");
		  if (value % 10 != 0)
		   System.exit(0);
		 }
		 {
		  dollar_Hundred = value / 100;
		  residue100 = valor % 100;

		  dollar_Fifty = residue100 / 50;
		  residue50 = residue100 % 50;

		  dollar_Ten = residue50 / 10;
		  residue10 = residue50 % 10;

		  System.out.println("you get " + dollar_Hundred + " dollars of 100 value");
		  System.out.println("you get " + dollar_Fifty + " dollars of 50 value");
		  System.out.println("you get " + dollar_Ten + " dollars of 10 value");
		 
		 }

		}

		
	}
