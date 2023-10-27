package Ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Seguros {
	private Map<String, List<siniestro>> siniestros =
			new TreeMap<String, List<siniestro>>();
	
	public void denunciaSiniestro(siniestro s) {
		String key = s.getPatente();
		List<siniestro> l;
		
		if (!siniestros.containsKey(key)) {
			l = new ArrayList<siniestro>();
		}
		else {
			l = siniestros.get(key);
		}
		
		l.add(s);
		siniestros.put(key, l);	
	}
	
	public String listarSiniestros() {
		String salida = "";
		for (Map.Entry<String, List<siniestro>> entry : this.siniestros.entrySet()) {
			String key = entry.getKey();
			List<siniestro> val = entry.getValue();
			
			salida += key;
			salida += "\n";
			
			for(siniestro lds : val) {
				salida += lds.getFecha();
				salida += ", ";
				salida += lds.getDetalle();
				salida += "\n";
			}
		}
		return salida;
	}
	
	public static void main(String[] args) {
		Seguros s = new Seguros();
		
		s.denunciaSiniestro(new siniestro("abc123", "08/10/2023", "me chocharon"));
		s.denunciaSiniestro(new siniestro("CZ230RB", "15/12/2022", "Me robaron el auto"));
		
		System.out.println(s.listarSiniestros());
	}
}
