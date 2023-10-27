package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class LeerConScanner {

	/**
	 * este programa lee un archivo con el siguiente formato: primera linea un
	 * entero n que indica la cantidad de numeros siguientes que debo leer seguido
	 * por n numeros tipo double
	 **/

	public static void main(String[] args) throws FileNotFoundException {

		String miPath = "./archivos/";
		Scanner sc = new Scanner(new File(miPath + "datos.in"));
		sc.useLocale(Locale.ENGLISH);
		double[] vec = new double[sc.nextInt()]; // vector para almacenar la lectura

		for (int i = 0; i < vec.length; i++) {
			vec[i] = sc.nextDouble();
		}

		sc.close();

		for (int i = 0; i < vec.length; i++)
			System.out.println(vec[i]);

	}
	/*
	 * 
	 * 5 3.2 3 4 -1 -2E4
	 * 
	 */
}
