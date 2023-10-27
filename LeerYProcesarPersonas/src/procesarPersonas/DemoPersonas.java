package procesarPersonas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DemoPersonas {

	public static LinkedList<Persona> getPersonas(String archivo) {
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea;
		String[] datos;

		LinkedList<Persona> llp = new LinkedList<Persona>();
		f = new File(archivo);
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
				datos = linea.split(" ");
//				Integer dni = Integer.parseInt(datos[0]);
//				Integer edad = Integer.parseInt(datos[2]);
//				Persona p = new Persona(dni, datos[1], edad);
				llp.add(new Persona(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2])));
				linea = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
		} catch (IOException ioe) {
		}
		

		return llp;
	}
	
	public static LinkedList<Persona> getPersonasMayoresAEdad(LinkedList<Persona> personas, Integer edad){
		LinkedList<Persona> aux = new LinkedList<Persona>();
		for(Persona persona:personas) {
			if(persona.getEdad()>edad)
				aux.add(persona);
		}
		Collections.sort(aux);
		try {
			PrintWriter salida = new PrintWriter(new File("personasMayoresDe"+edad+".out"));
			for(Persona persona:aux) {
				salida.println(persona);
			}
		salida.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return aux;
	}
	
	public static TreeMap<Integer, LinkedList<Persona>> agruparPorEdad(LinkedList<Persona> lista){
		TreeMap<Integer,LinkedList<Persona>> personasPorEdad = new TreeMap<Integer, LinkedList<Persona>>();
		Integer key;
		LinkedList<Persona> value;
		for(Persona persona:lista) {
			key = persona.getEdad();
			if(personasPorEdad.containsKey(key))
				personasPorEdad.get(key).add(persona);
			else {
				value = new LinkedList<Persona>();
				value.add(persona);
				personasPorEdad.put(key, value);
			}
		}
		return personasPorEdad;
	}
	
	public static void generarPersonasPorEdad(TreeMap<Integer, LinkedList<Persona>> mapa) {
		try {
			PrintWriter pr = new PrintWriter(new File("PersonasPorEdad.out"));
			for (Map.Entry<Integer, LinkedList<Persona>> entry : mapa.entrySet()) {
				Integer key = entry.getKey();
				LinkedList<Persona> val = entry.getValue();
			    pr.println("Personas de "+key+" años");
			    for(Persona persona:val) {
			    	pr.println(persona);
			    }
			    pr.println("----------------------------------------");
			}
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList<Persona> lp = getPersonas("personas.in");
		//for(Persona persona:lp) {
			//System.out.println(persona);
		//}
		//System.out.println(getPersonasMayoresAEdad(lp,39));
		generarPersonasPorEdad(agruparPorEdad(lp));

	}

}
