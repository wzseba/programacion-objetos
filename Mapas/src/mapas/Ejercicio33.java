package mapas;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio33 {
	public Map<Character, Integer> frecuencias(String s) {
		Map<Character, Integer> frec = new TreeMap<Character, Integer>();
		
		Character key;
		Integer value;
		
		for(int i = 0; i < s.length(); i++) {
			key = s.charAt(i);
			value = 1;
			if (!frec.containsKey(s.charAt(i)))
				frec.put(key, value);
			else {
				value = frec.get(key);
				value += 1;
				frec.put(key, value++);
			}
		}
		
		return frec;
	}
	
	public Map<String, Integer> frecuenciasDePalabras(String s) {
		Map<String, Integer> frec = new TreeMap<String, Integer>();
		
		String key;
		Integer value;
		
		String [] datos = s.split(" ");
		
		
		for(int i = 0; i < datos.length; i++) {
			key = datos[i];
			value = 1;
			if (!frec.containsKey(key))
				frec.put(key, value);
			else {
				value = frec.get(key);
				value += 1;
				frec.put(key, value++);
			}
		}
		
		return frec;
	}
	
	public void mostrarMapa(Map<Character, Integer> map) {
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + "," + val);
		}
	}
	
	public static void main(String[] args) {
		Ejercicio33 m = new Ejercicio33();
		
		m.mostrarMapa(m.frecuencias("Hola como estas"));
	}
}
