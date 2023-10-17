package main;

import java.util.Stack;

public class Teletipo {
	
	private Stack<Character> pila;
	
	public Teletipo(String caracters) {
		this.pila = new Stack<Character>();
		for(int i = 0; i < caracters.length(); i++) {
			pila.push(Character.valueOf(caracters.charAt(i)));
		}
	}
	
	private Stack<Character> invertirPila() {
		
		Stack<Character> temPila = new Stack<Character>();
		
		while(!pila.isEmpty()) {
			temPila.push(pila.peek());
			pila.pop();
		}
		
		return temPila;
	}
	
	public String procesar() {
		pila = invertirPila();
		Stack<Character> tmp = new Stack<>();
		while(!pila.isEmpty()) {
			Character c = pila.peek();
			switch(c) {
			case '/': if(!tmp.empty()) tmp.pop(); break;
			case '&': while(!tmp.empty())tmp.pop(); break;
			default: tmp.push(c);
			}
			pila.pop();
		}
		pila = tmp;
		pila = invertirPila();
		String cadena = "";
		while(!pila.empty()) {
			cadena += pila.peek();
			pila.pop();
		}
		
		return cadena;
	}
	
}
