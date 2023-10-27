package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirConPrintWriter {

	public static void main(String[] args) throws IOException {
		// preparo el arch de salida
		FileWriter fr = null; 
		PrintWriter salida = null;
		try {
			fr = new FileWriter("./archivos/salida.out");
			salida = new PrintWriter(fr);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		int dni = 34567890;
		String s = "dni:";
		salida.print(s);
		salida.println(" " + dni);// esto escribe : dni:34567890

		for (int i = 0; i < 10; i++)
			salida.println(i);

		salida.close(); 

	}
}
