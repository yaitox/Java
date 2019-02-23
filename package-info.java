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
		// SABER SI UN AÑO ES BISIESTO O NO

		System.out.println("INGRESE UN RANGO DE AÑOS");
		int anio;
		anio = scanner.nextInt();

		if (anio % 4 == 0)
			if (anio % 100 == 0)
				if (anio % 400 == 0)
					System.out.println("es bisiesto");

				else
					System.out.println("no es bisiesto");
			else
				System.out.println("es bisiesto");
		else
			System.out.println("no es bisiesto");

	}
}